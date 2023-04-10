import java.io.*;


public class PPMImage {
    String magicNumber;
    int width;
    int height;
    int maxColorValue;
    char[] raster;

    //Checks whether the file is a .ppm file
    PPMImage(String imageFileName) throws IOException {
        FileInputStream isItPPM = new FileInputStream(imageFileName);
        String fileName = imageFileName;
        readImage(fileName);
    }

    //reads the header and bytes of the img.ppm file
    private void readImage(String imageFileName) throws IOException {
        FileInputStream imageFile = new FileInputStream(imageFileName);

        //Gets magic number
        byte[] magicNumberArray = new byte[2];
        imageFile.read(magicNumberArray);

        String tempMagic = "";

        for (int i = 0; i < magicNumberArray.length; i++) {
            tempMagic += (char) magicNumberArray[i];
        }
        System.out.println(tempMagic);


        magicNumber = tempMagic;
        System.out.println("magic number =" + magicNumber);
        imageFile.skip(1);

        //Get width and height
        width = readInt(imageFile);
        System.out.println("width = " + width);
        height = readInt(imageFile);
        System.out.println("height = " + height);

        //Get maxvalue
        maxColorValue = readInt(imageFile);

        //gathers raster data
        raster = new char[width * height * 3];
            for(int i = 0; i < raster.length; i++)
                raster[i] = (char) imageFile.read();



        imageFile.close();
    }
    //helper method for obtaining width, height, and maxColorValue
    protected int readInt(FileInputStream imageFile) throws IOException {
        String s = "";
        char c;
        do{
            c = (char)imageFile.read();
            s += c;
        } while(!Character.isWhitespace(c));


        return Integer.parseInt(s.trim());

    }

    //method for sepia filter
    public void sepia() {
        char r;
        char g;
        char b;
        for (int i = 0; i < raster.length; i+=3) {
            r = raster[i];
            g = raster[i + 1];
            b = raster[i + 2];

            raster[i] = (char)((r * .393) + (g * .769) + (b * .189));
            if(raster[i] > maxColorValue) {
                raster[i] = (char)255;
            }
            raster[i + 1] = (char)((r * .349) + (g * .686) + (b * .168));
            if(raster[i + 1] > maxColorValue) {
                raster[i + 1] = (char)255;
            }
            raster[i + 2] = (char)((r * .272) + (g * .534) + (b * .131));
            if(raster[i + 2] > maxColorValue) {
                raster[i + 2] = (char)255;
            }
        }
    }

    public void iceFilter() {
        char r;
        char g;
        char b;
        for (int i = 0; i < raster.length; i+=3) {
            r = raster[i];
            g = raster[i + 1];
            b = raster[i + 2];

            raster[i] = (char)((r * .800) + (g * .509) + (b * .289));
            if(raster[i] > maxColorValue) {
                raster[i] = (char)255;
            }
            raster[i + 1] = (char)((r * .749) + (g * .682) + (b * .167));
            if(raster[i + 1] > maxColorValue) {
                raster[i + 1] = (char)255;
            }
            raster[i + 2] = (char)((r * .972) + (g * .564) + (b * .171));
            if(raster[i + 2] > maxColorValue) {
                raster[i + 2] = (char)255;
            }
        }
    }

    public void blueFilter () {
        char r;
        char g;
        char b;
        for (int i = 0; i < raster.length; i+=3) {
            r = raster[i];
            g = raster[i + 1];
            b = raster[i + 2];

            raster[i] = (char)((r * .500) + (g * .500) + (b * .500));
            if(raster[i] > maxColorValue) {
                raster[i] = (char)255;
            }
            raster[i + 1] = (char)((r * .700) + (g * .600) + (b * .500));
            if(raster[i + 1] > maxColorValue) {
                raster[i + 1] = (char)255;
            }
            raster[i + 2] = (char)((r * -.900) + (g * -.800) + (b * -.700));
            if(raster[i + 2] > maxColorValue) {
                raster[i + 2] = (char)255;
            }
        }
    }

    public void purpleBlueFilter () {
        char r;
        char g;
        char b;
        for (int i = 0; i < raster.length; i+=3) {
            r = raster[i];
            g = raster[i + 1];
            b = raster[i + 2];

            raster[i] = (char)((r * .500) + (g * .500) + (b * .300));
            if(raster[i] > maxColorValue) {
                raster[i] = (char)255;
            }
            raster[i + 1] = (char)((r * .100) + (g * .300) + (b * .800));
            if(raster[i + 1] > maxColorValue) {
                raster[i + 1] = (char)255;
            }
            raster[i + 2] = (char)((r * -.100) + (g * -.800) + (b * -.700));
            if(raster[i + 2] > maxColorValue) {
                raster[i + 2] = (char)255;
            }
        }
    }


    //method for grayscale filter
    public void grayscale() {
        char r;
        char g;
        char b;
        for (int i = 0; i < raster.length; i+=3) {
            r = raster[i];
            g = raster[i + 1];
            b = raster[i + 2];

            raster[i] = (char)((r * .299) + (g * .587) + (b * .114));
            raster[i + 1] = (char)((r * .299) + (g * .587) + (b * .114));
            raster[i + 2] = (char)((r * .299) + (g * .587) + (b * .114));

        }



    }

    //Negative Conversion
    public void negative(){
        for (int i = 0; i < raster.length; i++) {
            raster[i] = (char) ( 255 - raster[i]);
        }
    }

    //writes the bytes back to a new img.ppm file with filter or copy.
    public void writeFile(String outputImageFileName) throws IOException {
        try {
            FileOutputStream modifiedImage = new FileOutputStream(outputImageFileName);

            char[] magicNumberArray = magicNumber.toCharArray();
            char[] widthArray = String.valueOf(width).toCharArray();
            char[] heightArray = String.valueOf(height).toCharArray();
            char[] maxColorArray = String.valueOf(maxColorValue).toCharArray();

            for(int i = 0; i < magicNumberArray.length; i++) {
                modifiedImage.write((byte)magicNumberArray[i]);
            }

            modifiedImage.write('\n');

            for (int i = 0; i < widthArray.length; i++) {
                modifiedImage.write((byte)widthArray[i]);
            }
            modifiedImage.write('\n');

            for (int i = 0; i < heightArray.length; i++) {
                modifiedImage.write((byte)heightArray[i]);
            }

            modifiedImage.write('\n');

            for (int i = 0; i < maxColorArray.length; i++) {
                modifiedImage.write((byte)maxColorArray[i]);
            }

            modifiedImage.write('\n');

            for (int i = 0; i < raster.length; i++) {
                modifiedImage.write((byte)raster[i]);
            }

            modifiedImage.flush();
            modifiedImage.close();

        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}




