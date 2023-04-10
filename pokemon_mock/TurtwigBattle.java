package UpdatedPokemonGame;

import java.io.File;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class TurtwigBattle {
	public static EventHandler<ActionEvent> TurtwigBattle() {
		StackPane battlePane = new StackPane();
		Scene battleScene = new Scene(battlePane, 1200,720);
		Stage battleStage = new Stage();
		
		String battleMusicString = "BattleTrainer.mp3";
		Media battleMusicMedia = new Media(new File(battleMusicString).toURI().toString());
		MediaPlayer battleMusicPlayer = new MediaPlayer(battleMusicMedia);
		MediaView battleMusicView = new MediaView(battleMusicPlayer);
		battleMusicPlayer.setAutoPlay(true);
		battleMusicPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		battlePane.getChildren().add(battleMusicView);
		
		try {
			File  battleBackgroundFile = new File("RealBattleBackground.png");
			Image battleBackgroundImage = new Image(battleBackgroundFile.toURI().toURL().toExternalForm());
			ImageView battleBackgroundView = new ImageView(battleBackgroundImage);
			battlePane.getChildren().add(battleBackgroundView);
			
			battleBackgroundView.setFitHeight(battleBackgroundImage.getHeight() * 1.5);
			battleBackgroundView.setFitWidth(battleBackgroundImage.getWidth() * 1.5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			File  battleBarryBackgroundFile = new File("BattleBarry.png");
			Image battleBarryBackgroundImage = new Image(battleBarryBackgroundFile.toURI().toURL().toExternalForm());
			ImageView battleBarryBackgroundView = new ImageView(battleBarryBackgroundImage);
			battleBarryBackgroundView.setTranslateY(-130);
			battleBarryBackgroundView.setTranslateX(300);
			battlePane.getChildren().add(battleBarryBackgroundView);
			battleBarryBackgroundView.setFitHeight(battleBarryBackgroundImage.getHeight()/4);
			battleBarryBackgroundView.setFitWidth(battleBarryBackgroundImage.getWidth()/4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			File  battlePiplupBackgroundFile = new File("BattlePiplup2.png");
			Image battlePiplupBackgroundImage = new Image(battlePiplupBackgroundFile.toURI().toURL().toExternalForm());
			ImageView battlePiplupBackgroundView = new ImageView(battlePiplupBackgroundImage);
			battlePiplupBackgroundView.setTranslateY(-30);
			battlePiplupBackgroundView.setTranslateX(220);
			battlePane.getChildren().add(battlePiplupBackgroundView);
			battlePiplupBackgroundView.setFitHeight(battlePiplupBackgroundImage.getHeight()/6);
			battlePiplupBackgroundView.setFitWidth(battlePiplupBackgroundImage.getWidth()/6);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			File  battleTurtwigBackgroundFile = new File("BattleTurtwig.png");
			Image battleTurtwigBackgroundImage = new Image(battleTurtwigBackgroundFile.toURI().toURL().toExternalForm());
			ImageView battleTurtwigBackgroundView = new ImageView(battleTurtwigBackgroundImage);
			battleTurtwigBackgroundView.setTranslateY(140);
			battleTurtwigBackgroundView.setTranslateX(-330);
			battlePane.getChildren().add(battleTurtwigBackgroundView);
			battleTurtwigBackgroundView.setFitHeight(battleTurtwigBackgroundImage.getHeight());
			battleTurtwigBackgroundView.setFitWidth(battleTurtwigBackgroundImage.getWidth());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			File  battleTurtwigHealthFile = new File("HealthLayout.png");
			Image battleTurtwigHealthImage = new Image(battleTurtwigHealthFile.toURI().toURL().toExternalForm());
			ImageView battleTurtwigHealthView = new ImageView(battleTurtwigHealthImage);
			battleTurtwigHealthView.setTranslateY(100);
			battleTurtwigHealthView.setTranslateX(50);
			battlePane.getChildren().add(battleTurtwigHealthView);
			battleTurtwigHealthView.setFitHeight(battleTurtwigHealthImage.getHeight()/2);
			battleTurtwigHealthView.setFitWidth(battleTurtwigHealthImage.getWidth()/2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			File  battlePiplupHealthFile = new File("HealthLayout.png");
			Image battlePiplupHealthImage = new Image(battlePiplupHealthFile.toURI().toURL().toExternalForm());
			ImageView battlePiplupHealthView = new ImageView(battlePiplupHealthImage);
			battlePiplupHealthView.setTranslateY(-130);
			battlePiplupHealthView.setTranslateX(-90);
			battlePane.getChildren().add(battlePiplupHealthView);
			battlePiplupHealthView.setFitHeight(battlePiplupHealthImage.getHeight()/2);
			battlePiplupHealthView.setFitWidth(battlePiplupHealthImage.getWidth()/2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ProgressBar myHealthBar = new ProgressBar(1);
		myHealthBar.setMinWidth(200);
		myHealthBar.setMaxWidth(200);
		myHealthBar.setTranslateY(90);
		myHealthBar.setTranslateX(50);
		battlePane.getChildren().add(myHealthBar);
		
		ProgressBar enemyHealthBar = new ProgressBar(1);
		enemyHealthBar.setMinWidth(200);
		enemyHealthBar.setMaxWidth(200);
		enemyHealthBar.setTranslateY(-130);
		enemyHealthBar.setTranslateX(-90);
		battlePane.getChildren().add(enemyHealthBar);
		
		Label myPokemonName = new Label("TURTWIG");
		myPokemonName.setTranslateY(110);
		myPokemonName.setTranslateX(-30);
		battlePane.getChildren().add(myPokemonName);
		
		Label enemyPokemonName = new Label("PIPLUP");
		enemyPokemonName.setTranslateY(-110);
		enemyPokemonName.setTranslateX(-20);
		battlePane.getChildren().add(enemyPokemonName);
		
		try {
			File  moveLayoutFile = new File("MoveLayout.png");
			Image moveLayoutImage = new Image(moveLayoutFile.toURI().toURL().toExternalForm());
			ImageView moveLayoutView = new ImageView(moveLayoutImage);
			moveLayoutView.setTranslateY(260);
			moveLayoutView.setFitHeight(moveLayoutImage.getHeight()/1.3);
			moveLayoutView.setFitWidth(moveLayoutImage.getWidth());
			moveLayoutView.setTranslateX(30);
			battlePane.getChildren().add(moveLayoutView);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		Button tackle = new Button("TACKLE");
		tackle.setTranslateY(230);
		tackle.setTranslateX(-80);
		tackle.setMinWidth(200);
		tackle.setMaxWidth(200);
		tackle.setMinHeight(50);
		tackle.setMaxHeight(50);
		battlePane.getChildren().add(tackle);
		
		Button razorLeaf = new Button("RAZOR LEAF");
		razorLeaf.setTranslateY(230);
		razorLeaf.setTranslateX(130);
		razorLeaf.setMinHeight(50);
		razorLeaf.setMaxHeight(50);
		razorLeaf.setMinWidth(200);
		razorLeaf.setMaxWidth(200);
		battlePane.getChildren().add(razorLeaf);
		
		Button potion = new Button("POTION");
		potion.setTranslateY(280);
		potion.setTranslateX(-80);
		potion.setMinWidth(200);
		potion.setMaxWidth(200);
		potion.setMinHeight(50);
		potion.setMaxHeight(50);
		battlePane.getChildren().add(potion);
		
		Button scratch = new Button("SCRATCH"); 
		scratch.setTranslateY(280);
		scratch.setTranslateX(130);
		scratch.setMinWidth(200);
		scratch.setMaxWidth(200);
		scratch.setMinHeight(50);
		scratch.setMaxHeight(50);
		battlePane.getChildren().add(scratch);
		
		tackle.setOnAction(event -> {
			TurtwigStats attack = new TurtwigStats();
	        System.out.println(((Button)event.getSource()).getText());
	        enemyHealthBar.setProgress(enemyHealthBar.getProgress() - attack.ResultAttack(((Button)event.getSource()).getText()));
	        EnemyPiplupStats piplupAttack = new EnemyPiplupStats();
	        System.out.println(piplupAttack.ResultAttack());
	        
	    });
		
		battleStage.setScene(battleScene);
		battleStage.show();
		
		return null;
		
	}
}
