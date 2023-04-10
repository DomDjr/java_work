package UpdatedPokemonGame;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PokemonMain extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage mainStage) throws Exception {
		// TODO Auto-generated method stub
		
		//start screen
		StackPane pokemonWindow = new StackPane();
		Scene launchStage = new Scene(pokemonWindow, 1280, 720);
		
		String openingString = "Pokemon Diamond Opening.mp3";
		Media openingMedia = new Media(new File(openingString).toURI().toString());
		MediaPlayer openingPlayer = new MediaPlayer(openingMedia);
		MediaView openingView = new MediaView(openingPlayer);
		openingPlayer.setAutoPlay(true);
		openingPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		pokemonWindow.getChildren().add(openingView);
		try {
			File startBackground = new File("StartBackground.jpeg");
			
			Image startImage = new Image(startBackground.toURI().toURL().toExternalForm());
			System.out.println(startImage.getHeight());
			System.out.println(startImage.getWidth());
			pokemonWindow.getChildren().add(new ImageView(startImage));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Button startButton = new Button("Press to Start");
		startButton.setTranslateY(200);
		startButton.setStyle("-fx-background-color: #0865a2");
		startButton.setTextFill(Color.WHITE);
		
		pokemonWindow.getChildren().add(startButton);
		
		//intro screen for professor oak
		
		
		startButton.setOnMouseClicked(new EventHandler <MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				String buttonAString = "PokemonAButton.mp3";
				Media buttonAMedia = new Media(new File(buttonAString).toURI().toString());
				MediaPlayer buttonAPlayer = new MediaPlayer(buttonAMedia);
				MediaView buttonAView = new MediaView(buttonAPlayer);
				buttonAPlayer.setAutoPlay(true);
				pokemonWindow.getChildren().add(buttonAView);
				// TODO Auto-generated method stub
				openingPlayer.stop();
				mainStage.close();
				
			}
			
		});
		
		PokemonIntro intro = new PokemonIntro();
		startButton.setOnAction(intro.ChangeToIntro());
		
		
		
		
		
		
		
		
		
		

		mainStage.setTitle("Pokemon");
		mainStage.setScene(launchStage);
		mainStage.show();
		

	}

}
