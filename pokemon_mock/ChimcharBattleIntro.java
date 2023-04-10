package UpdatedPokemonGame;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ChimcharBattleIntro {
		public static EventHandler<ActionEvent> ChimcharBattle() {
			StackPane friendPane = new StackPane();
			Scene friendScene = new Scene(friendPane, 1280, 720);
			Stage friendDialogue = new Stage();
			
			String preBattleMusicString = "PreBattleMusic.mp3";
			Media preBattleMusicMedia = new Media(new File(preBattleMusicString).toURI().toString());
			MediaPlayer preBattleMusicPlayer = new MediaPlayer(preBattleMusicMedia);
			MediaView preBattleMusicView = new MediaView(preBattleMusicPlayer);
			preBattleMusicPlayer.setAutoPlay(true);
			preBattleMusicPlayer.setCycleCount(MediaPlayer.INDEFINITE);
			friendPane.getChildren().add(preBattleMusicView);
			
			try {
				File  battleBackgroundFile = new File("BattleBackground.png");
				Image battleBackgroundImage = new Image(battleBackgroundFile.toURI().toURL().toExternalForm());
				ImageView battleBackgroundView = new ImageView(battleBackgroundImage);
				friendPane.getChildren().add(battleBackgroundView);
				
				battleBackgroundView.setFitHeight(battleBackgroundImage.getHeight());
				battleBackgroundView.setFitWidth(battleBackgroundImage.getWidth());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				File  battleBarryBackgroundFile = new File("BattleBarry.png");
				Image battleBarryBackgroundImage = new Image(battleBarryBackgroundFile.toURI().toURL().toExternalForm());
				ImageView battleBarryBackgroundView = new ImageView(battleBarryBackgroundImage);
				battleBarryBackgroundView.setTranslateY(100);
				friendPane.getChildren().add(battleBarryBackgroundView);
				battleBarryBackgroundView.setFitHeight(battleBarryBackgroundImage.getHeight()/3.5);
				battleBarryBackgroundView.setFitWidth(battleBarryBackgroundImage.getWidth()/3.5);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				File textBubbleFile = new File("textBubble.png");
				Image textBubbleImage = new Image(textBubbleFile.toURI().toURL().toExternalForm());
				ImageView textBubbleView = new ImageView(textBubbleImage);
				textBubbleView.setTranslateY(280);
				textBubbleView.setFitWidth(750);
				friendPane.getChildren().add(textBubbleView);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			Label friendPrompt = new Label("Oh hey! It looks like you got yourseld a pokemon. Ah, so you chose Turtwig hm? It might be the best lookin' , but i doubt it will out perform mine. Why dont you guess what Pokemon I chose. hmph..");
			friendPrompt.setTranslateY(280);
			friendPrompt.setTranslateX(10);
			friendPrompt.setMinWidth(500);
			friendPrompt.setMaxWidth(500);
			friendPrompt.setWrapText(true);
			friendPane.getChildren().add(friendPrompt);
			
			Button nextButton = new Button("Next");
			nextButton.setMinHeight(21);
			nextButton.setMaxHeight(21);
			nextButton.setTranslateY(300);
			nextButton.setTranslateX(150);
			nextButton.setTextFill(Color.RED);
			nextButton.setStyle(
					"-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");
			friendPane.getChildren().add(nextButton);
			
			EventHandler<ActionEvent> displayGuessFields = new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					TextField guessPokemon = new TextField();
					guessPokemon.setTranslateY(300);
					guessPokemon.setMinWidth(100);
					guessPokemon.setMaxWidth(100);
					guessPokemon.setMinHeight(25);
					guessPokemon.setMaxHeight(25);
					friendPane.getChildren().add(guessPokemon);
					
					Button submitGuess = new Button("Submit");
					submitGuess.setTranslateX(80);
					submitGuess.setTranslateY(300);
					friendPane.getChildren().add(submitGuess);
					
					EventHandler<ActionEvent> displayGuessResult = new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							if (guessPokemon.equals("piplup") || guessPokemon.equals("Piplup")) {
								friendPrompt.setText("No i dont think thats the one. Try again.");
							}
							else {
								friendPrompt.setText("Right on! Piplup it is! Say... Why dont we give our Pokemon's a test run. You know, test their movesets and such. Im sure I'll win!");
								Button battleButton = new Button("Battle");
								battleButton.setTranslateX(150);
								battleButton.setTranslateY(300);
								battleButton.setTextFill(Color.RED);
								battleButton.setStyle(
										"-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");
								friendPane.getChildren().add(battleButton);
								
								EventHandler<ActionEvent> battlePhase = new EventHandler<ActionEvent>() {

									@Override
									public void handle(ActionEvent arg0) {
										friendDialogue.close();
										preBattleMusicPlayer.stop();
										ChimcharBattle battle = new ChimcharBattle();
										battle.ChimcharBattle();
									}
								};
								battleButton.setOnAction(battlePhase);
							}
						}
					};
					submitGuess.setOnAction(displayGuessResult);
				}
			};
			nextButton.setOnAction(displayGuessFields);
			
			friendDialogue.setScene(friendScene);
			friendDialogue.show();
			return null;
		}
}
