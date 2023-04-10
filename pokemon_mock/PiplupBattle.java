package UpdatedPokemonGame;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class PiplupBattle {
	public static EventHandler<ActionEvent> PiplupBattle() {
		StackPane battlePane = new StackPane();
		Scene battleScene = new Scene(battlePane, 1200, 720);
		Stage battleStage = new Stage();

		String battleMusicString = "BattleTrainer.mp3";
		Media battleMusicMedia = new Media(new File(battleMusicString).toURI().toString());
		MediaPlayer battleMusicPlayer = new MediaPlayer(battleMusicMedia);
		MediaView battleMusicView = new MediaView(battleMusicPlayer);
		battleMusicPlayer.setAutoPlay(true);
		battleMusicPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		battlePane.getChildren().add(battleMusicView);

		try {
			File battleBackgroundFile = new File("RealBattleBackground.png");
			Image battleBackgroundImage = new Image(battleBackgroundFile.toURI().toURL().toExternalForm());
			ImageView battleBackgroundView = new ImageView(battleBackgroundImage);
			battlePane.getChildren().add(battleBackgroundView);

			battleBackgroundView.setFitHeight(battleBackgroundImage.getHeight() * 1.5);
			battleBackgroundView.setFitWidth(battleBackgroundImage.getWidth() * 1.5);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			File battleBarryBackgroundFile = new File("BattleBarry.png");
			Image battleBarryBackgroundImage = new Image(battleBarryBackgroundFile.toURI().toURL().toExternalForm());
			ImageView battleBarryBackgroundView = new ImageView(battleBarryBackgroundImage);
			battleBarryBackgroundView.setTranslateY(-130);
			battleBarryBackgroundView.setTranslateX(300);
			battlePane.getChildren().add(battleBarryBackgroundView);
			battleBarryBackgroundView.setFitHeight(battleBarryBackgroundImage.getHeight() / 4);
			battleBarryBackgroundView.setFitWidth(battleBarryBackgroundImage.getWidth() / 4);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			File battleChimcharBackgroundFile = new File("BattleChimchar2.png");
			Image battleChimcharBackgroundImage = new Image(
					battleChimcharBackgroundFile.toURI().toURL().toExternalForm());
			ImageView battleChimcharBackgroundView = new ImageView(battleChimcharBackgroundImage);
			battleChimcharBackgroundView.setTranslateY(-30);
			battleChimcharBackgroundView.setTranslateX(220);
			battlePane.getChildren().add(battleChimcharBackgroundView);
			battleChimcharBackgroundView.setFitHeight(battleChimcharBackgroundImage.getHeight() / 6);
			battleChimcharBackgroundView.setFitWidth(battleChimcharBackgroundImage.getWidth() / 6);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			File battlePiplupBackgroundFile = new File("BattlePiplup.png");
			Image battlePiplupBackgroundImage = new Image(
					battlePiplupBackgroundFile.toURI().toURL().toExternalForm());
			ImageView battlePiplupBackgroundView = new ImageView(battlePiplupBackgroundImage);
			battlePiplupBackgroundView.setTranslateY(140);
			battlePiplupBackgroundView.setTranslateX(-330);
			battlePane.getChildren().add(battlePiplupBackgroundView);
			battlePiplupBackgroundView.setFitHeight(battlePiplupBackgroundImage.getHeight());
			battlePiplupBackgroundView.setFitWidth(battlePiplupBackgroundImage.getWidth());
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			File battleTurtwigHealthFile = new File("HealthLayout.png");
			Image battleTurtwigHealthImage = new Image(battleTurtwigHealthFile.toURI().toURL().toExternalForm());
			ImageView battleTurtwigHealthView = new ImageView(battleTurtwigHealthImage);
			battleTurtwigHealthView.setTranslateY(100);
			battleTurtwigHealthView.setTranslateX(50);
			battlePane.getChildren().add(battleTurtwigHealthView);
			battleTurtwigHealthView.setFitHeight(battleTurtwigHealthImage.getHeight() / 2);
			battleTurtwigHealthView.setFitWidth(battleTurtwigHealthImage.getWidth() / 3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			File battlePiplupHealthFile = new File("HealthLayout.png");
			Image battlePiplupHealthImage = new Image(battlePiplupHealthFile.toURI().toURL().toExternalForm());
			ImageView battlePiplupHealthView = new ImageView(battlePiplupHealthImage);
			battlePiplupHealthView.setTranslateY(-130);
			battlePiplupHealthView.setTranslateX(-90);
			battlePane.getChildren().add(battlePiplupHealthView);
			battlePiplupHealthView.setFitHeight(battlePiplupHealthImage.getHeight() / 2);
			battlePiplupHealthView.setFitWidth(battlePiplupHealthImage.getWidth() / 3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ProgressBar myHealthBar = new ProgressBar(100);
		myHealthBar.setMinWidth(200);
		myHealthBar.setMaxWidth(200);
		myHealthBar.setTranslateY(90);
		myHealthBar.setTranslateX(50);
		battlePane.getChildren().add(myHealthBar);
		
		ProgressBar enemyHealthBar = new ProgressBar(100);
		enemyHealthBar.setMinWidth(200);
		enemyHealthBar.setMaxWidth(200);
		enemyHealthBar.setTranslateY(-130);
		enemyHealthBar.setTranslateX(-90);
		battlePane.getChildren().add(enemyHealthBar);
		
		Label myPokemonName = new Label("PIPLUP");
		myPokemonName.setTranslateY(110);
		myPokemonName.setTranslateX(-30);
		battlePane.getChildren().add(myPokemonName);
		
		Label enemyPokemonName = new Label("CHIMCHAR");
		enemyPokemonName.setTranslateY(-110);
		enemyPokemonName.setTranslateX(-20);
		battlePane.getChildren().add(enemyPokemonName);
		
		battleStage.setScene(battleScene);
		battleStage.show();

		return null;

	}
}
