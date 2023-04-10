package UpdatedPokemonGame;

import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PokemonChoose {
		public static EventHandler<ActionEvent> oaksLab() {
			Stage oakLab = new Stage();
			StackPane oakScreen = new StackPane();
			Scene oakScene = new Scene(oakScreen, 1280, 720);
			
			String chooseMusicString = "ChoosingPokemonMusic.mp3";
			Media chooseMusicMedia = new Media(new File(chooseMusicString).toURI().toString());
			MediaPlayer chooseMusicPlayer = new MediaPlayer(chooseMusicMedia);
			MediaView chooseMusicView = new MediaView(chooseMusicPlayer);
			chooseMusicPlayer.setAutoPlay(true);
			chooseMusicPlayer.setCycleCount(MediaPlayer.INDEFINITE);
			oakScreen.getChildren().add(chooseMusicView);
			
			try {
				File oakFile = new File("choosingPokemon.jpeg");
				Image oakImage = new Image(oakFile	.toURI().toURL().toExternalForm());
				oakScreen.getChildren().add(new ImageView(oakImage));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				File textBubbleFile = new File("textBubble.png");
				Image textBubbleImage = new Image(textBubbleFile.toURI().toURL().toExternalForm());
				ImageView textBubbleView = new ImageView(textBubbleImage);
				textBubbleView.setTranslateY(280);
				textBubbleView.setFitWidth(750);
				oakScreen.getChildren().add(textBubbleView);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			Label prompt = new Label("Any adventure requires a pokemon, so why dont you choose one from the three I provided you...");
			prompt.setTranslateY(280);
			prompt.setTranslateX(10);
			prompt.setMinWidth(500);
			prompt.setMaxWidth(500);
			prompt.setWrapText(true);
			oakScreen.getChildren().add(prompt);
			
			Button turtwigButton = new Button();
			turtwigButton.setShape(new Circle(0.5));
			turtwigButton.setTranslateY(100);
			turtwigButton.setTranslateX(-172);
			turtwigButton.setMinHeight(13);
			turtwigButton.setMaxHeight(13);
			turtwigButton.setMinWidth(13);
			turtwigButton.setMaxWidth(13);
			
			Button chimcharButton = new Button();
			chimcharButton.setShape(new Circle(0.5));
			chimcharButton.setTranslateY(155);
			chimcharButton.setTranslateX(-26);
			chimcharButton.setMinHeight(13);
			chimcharButton.setMaxHeight(13);
			chimcharButton.setMinWidth(13);
			chimcharButton.setMaxWidth(13);
			
			Button piplupButton = new Button();
			piplupButton.setShape(new Circle(0.5));
			piplupButton.setTranslateY(93);
			piplupButton.setTranslateX(172);
			piplupButton.setMinHeight(12);
			piplupButton.setMaxHeight(12);
			piplupButton.setMinWidth(8);
			piplupButton.setMaxWidth(8);
			
			oakScreen.getChildren().addAll(turtwigButton, chimcharButton, piplupButton);
			
			EventHandler<ActionEvent> turtwigPreview = new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					piplupButton.setDisable(true);
					chimcharButton.setDisable(true);
					try {
						File pokemonPreviewFile = new File("pokemonPreview.png");
						Image pokemonPreviewImage = new Image(pokemonPreviewFile.toURI().toURL().toExternalForm());
						ImageView pokemonPreviewView = new ImageView(pokemonPreviewImage);
						pokemonPreviewView.setFitHeight(pokemonPreviewImage.getHeight()/2);
						pokemonPreviewView.setFitWidth(pokemonPreviewImage.getWidth()/2);
						pokemonPreviewView.setTranslateY(-90);
						pokemonPreviewView.setTranslateX(-260);
						oakScreen.getChildren().add(pokemonPreviewView);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					try {
						File turtwigPreviewFile = new File("turtwigPreview.png");
						Image turtwigPreviewImage = new Image(turtwigPreviewFile.toURI().toURL().toExternalForm());
						ImageView turtwigPreviewView = new ImageView(turtwigPreviewImage);
						turtwigPreviewView.setFitHeight(turtwigPreviewImage.getHeight()/7);
						turtwigPreviewView.setFitWidth(turtwigPreviewImage.getWidth()/7);
								
						turtwigPreviewView.setTranslateY(-110);
						turtwigPreviewView.setTranslateX(-260);
						oakScreen.getChildren().add(turtwigPreviewView);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					String turtwigPreviewAudioString = "turtwigPreviewAudio.mp3";
					Media turtwigPreviewAudioMedia = new Media(new File(turtwigPreviewAudioString).toURI().toString());
					MediaPlayer turtwigPreviewAudioPlayer = new MediaPlayer(turtwigPreviewAudioMedia);
					MediaView turtwigPreviewAudioView = new MediaView(turtwigPreviewAudioPlayer);
					turtwigPreviewAudioPlayer.setAutoPlay(true);
					oakScreen.getChildren().add(turtwigPreviewAudioView);
					
					prompt.setText("The grass type pokemon Turtwig! I think thats a perfect pick.");
					
					StackPane pokemonChoosePane = new StackPane();
					Scene pokemonChooseScene = new Scene(pokemonChoosePane,200,200);
					Stage pokemonChooseConfirm = new Stage();
					
					Label confirmation = new Label("Would you like to start your adventure with Turtwig?");
					confirmation.setWrapText(true);
					Button yesButton = new Button("yes");
					Button noButton = new Button("no");
					confirmation.setTranslateY(-50);
					confirmation.setTranslateX(25);
					yesButton.setTranslateX(50);
					noButton.setTranslateX(-50);
					
					pokemonChoosePane.getChildren().addAll(confirmation,yesButton,noButton);
					
					pokemonChooseConfirm.setScene(pokemonChooseScene);
					pokemonChooseConfirm.show();
					
					EventHandler<ActionEvent> noTurtwig = new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							piplupButton.setDisable(false);
							chimcharButton.setDisable(false);
							pokemonChooseConfirm.close();
						}
					};
					noButton.setOnAction(noTurtwig);
					
					EventHandler<ActionEvent> yesTurtwig = new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							turtwigButton.setDisable(true);
							String catchingPokemonAudioString = "catchingPokemon.mp3";
							Media catchingPokemonAudioMedia = new Media(new File(catchingPokemonAudioString).toURI().toString());
							MediaPlayer catchingPokemonAudioPlayer = new MediaPlayer(catchingPokemonAudioMedia);
							MediaView catchingPokemonAudioView = new MediaView(catchingPokemonAudioPlayer);
							catchingPokemonAudioPlayer.setAutoPlay(true);
							oakScreen.getChildren().add(catchingPokemonAudioView);
							
							prompt.setText("Excellent choice. Im sure you and Turtwig will go through amazing experieces and create wholesome memories!");
							
							Button nextButton1 = new Button("Next");
							nextButton1.setMinHeight(21);
							nextButton1.setMaxHeight(21);
							nextButton1.setTranslateY(290);
							nextButton1.setTranslateX(150);
							nextButton1.setTextFill(Color.RED);
							nextButton1.setStyle(
									"-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");
							oakScreen.getChildren().add(nextButton1);
							
							pokemonChooseConfirm.close();
							
							EventHandler<ActionEvent> nextButton1Prompt = new EventHandler<ActionEvent>() {

								@Override
								public void handle(ActionEvent arg0) {
									nextButton1.setVisible(false);
									prompt.setText("Now, owning a Pokemon comes with great responsibilities and care. Treat the creature as if it were your own child. With that being said, enjoy the mysteries and accomplishments your adventures will bring you!");
									Button battleButton = new Button("The first Encounter");
									battleButton.setMinHeight(25);
									battleButton.setMaxHeight(25);
									battleButton.setTranslateY(300);
									battleButton.setTranslateX(150);
									battleButton.setTextFill(Color.RED);
									battleButton.setStyle(
											"-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");
									oakScreen.getChildren().add(battleButton);
									
									EventHandler<ActionEvent> turtwigDuel = new EventHandler<ActionEvent>() {

										@Override
										public void handle(ActionEvent arg0) {
											TurtwigBattleIntro turtwigVs = new TurtwigBattleIntro();
											chooseMusicPlayer.stop();
											turtwigVs.TurtwigBattle();
											oakLab.close();
										}
									};
									battleButton.setOnAction(turtwigDuel);
								}
							};
							nextButton1.setOnAction(nextButton1Prompt);
						}
					};
					yesButton.setOnAction(yesTurtwig);
					
				}
			};
			turtwigButton.setOnAction(turtwigPreview);
			
			EventHandler<ActionEvent> chimcharPreview = new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					try {
						File pokemonPreviewFile = new File("pokemonPreview.png");
						Image pokemonPreviewImage = new Image(pokemonPreviewFile.toURI().toURL().toExternalForm());
						ImageView pokemonPreviewView = new ImageView(pokemonPreviewImage);
						pokemonPreviewView.setFitHeight(pokemonPreviewImage.getHeight()/2);
						pokemonPreviewView.setFitWidth(pokemonPreviewImage.getWidth()/2);
						pokemonPreviewView.setTranslateY(-30);
						pokemonPreviewView.setTranslateX(-160);
						oakScreen.getChildren().add(pokemonPreviewView);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					try {
						File chimcharPreviewFile = new File("chimcharPreview.png");
						Image chimcharPreviewImage = new Image(chimcharPreviewFile.toURI().toURL().toExternalForm());
						ImageView chimcharPreviewView = new ImageView(chimcharPreviewImage);
						chimcharPreviewView.setFitHeight(chimcharPreviewImage.getHeight()/7);
						chimcharPreviewView.setFitWidth(chimcharPreviewImage.getWidth()/7);
								
						chimcharPreviewView.setTranslateY(-50);
						chimcharPreviewView.setTranslateX(-175);
						oakScreen.getChildren().add(chimcharPreviewView);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					String chimcharPreviewAudioString = "chimcharPreviewAudio.mp3";
					Media chimcharPreviewAudioMedia = new Media(new File(chimcharPreviewAudioString).toURI().toString());
					MediaPlayer chimcharPreviewAudioPlayer = new MediaPlayer(chimcharPreviewAudioMedia);
					MediaView chimcharPreviewAudioView = new MediaView(chimcharPreviewAudioPlayer);
					chimcharPreviewAudioPlayer.setAutoPlay(true);
					oakScreen.getChildren().add(chimcharPreviewAudioView);
					
					prompt.setText("The fire type pokemon Chimchar! I think thats a perfect pick.");
					
					StackPane pokemonChoosePane = new StackPane();
					Scene pokemonChooseScene = new Scene(pokemonChoosePane,200,200);
					Stage pokemonChooseConfirm = new Stage();
					
					Label confirmation = new Label("Would you like to start your adventure with Chimchar?");
					confirmation.setWrapText(true);
					Button yesButton = new Button("yes");
					Button noButton = new Button("no");
					confirmation.setTranslateY(-50);
					confirmation.setTranslateX(25);
					yesButton.setTranslateX(50);
					noButton.setTranslateX(-50);
					
					pokemonChoosePane.getChildren().addAll(confirmation,yesButton,noButton);
					
					pokemonChooseConfirm.setScene(pokemonChooseScene);
					pokemonChooseConfirm.show();
					
					EventHandler<ActionEvent> noChimchar = new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							piplupButton.setDisable(false);
							turtwigButton.setDisable(false);
							pokemonChooseConfirm.close();
						}
					};
					noButton.setOnAction(noChimchar);
					
					EventHandler<ActionEvent> yesChimchar = new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							chimcharButton.setDisable(true);
							String catchingPokemonAudioString = "catchingPokemon.mp3";
							Media catchingPokemonAudioMedia = new Media(new File(catchingPokemonAudioString).toURI().toString());
							MediaPlayer catchingPokemonAudioPlayer = new MediaPlayer(catchingPokemonAudioMedia);
							MediaView catchingPokemonAudioView = new MediaView(catchingPokemonAudioPlayer);
							catchingPokemonAudioPlayer.setAutoPlay(true);
							oakScreen.getChildren().add(catchingPokemonAudioView);
							
							prompt.setText("Excellent choice. Im sure you and Chimchar will go through amazing experieces and create wholesome memories!");
							
							Button nextButton1 = new Button("Next");
							nextButton1.setMinHeight(21);
							nextButton1.setMaxHeight(21);
							nextButton1.setTranslateY(290);
							nextButton1.setTranslateX(150);
							nextButton1.setTextFill(Color.RED);
							nextButton1.setStyle(
									"-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");
							oakScreen.getChildren().add(nextButton1);
							
							pokemonChooseConfirm.close();
							
							EventHandler<ActionEvent> nextButton1Prompt = new EventHandler<ActionEvent>() {

								@Override
								public void handle(ActionEvent arg0) {
									nextButton1.setVisible(false);
									prompt.setText("Now, owning a Pokemon comes with great responsibilities and care. Treat the creature as if it were your own child. With that being said, enjoy the mysteries and accomplishments your adventures will bring you!");
									Button battleButton = new Button("The first Encounter");
									battleButton.setMinHeight(25);
									battleButton.setMaxHeight(25);
									battleButton.setTranslateY(300);
									battleButton.setTranslateX(150);
									battleButton.setTextFill(Color.RED);
									battleButton.setStyle(
											"-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");
									oakScreen.getChildren().add(battleButton);
									
									EventHandler<ActionEvent> chimcharDuel = new EventHandler<ActionEvent>() {

										@Override
										public void handle(ActionEvent arg0) {
											ChimcharBattleIntro chimcharVs = new ChimcharBattleIntro();
											chooseMusicPlayer.stop();
											chimcharVs.ChimcharBattle();
											oakLab.close();
										}
									};
									battleButton.setOnAction(chimcharDuel);
								}
							};
							nextButton1.setOnAction(nextButton1Prompt);
						}
					};
					yesButton.setOnAction(yesChimchar);
				}
			};
			chimcharButton.setOnAction(chimcharPreview);

			EventHandler<ActionEvent> piplupPreview = new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					try {
						File pokemonPreviewFile = new File("pokemonPreview.png");
						Image pokemonPreviewImage = new Image(pokemonPreviewFile.toURI().toURL().toExternalForm());
						ImageView pokemonPreviewView = new ImageView(pokemonPreviewImage);
						pokemonPreviewView.setFitHeight(pokemonPreviewImage.getHeight()/2);
						pokemonPreviewView.setFitWidth(pokemonPreviewImage.getWidth()/2);
						pokemonPreviewView.setTranslateY(-60);
						pokemonPreviewView.setTranslateX(80);
						oakScreen.getChildren().add(pokemonPreviewView);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					try {
						File piplupPreviewFile = new File("piplupPreview.png");
						Image piplupPreviewImage = new Image(piplupPreviewFile.toURI().toURL().toExternalForm());
						ImageView piplupPreviewView = new ImageView(piplupPreviewImage);
						piplupPreviewView.setFitHeight(piplupPreviewImage.getHeight()/7);
						piplupPreviewView.setFitWidth(piplupPreviewImage.getWidth()/7);
								
						piplupPreviewView.setTranslateY(-80);
						piplupPreviewView.setTranslateX(80);
						oakScreen.getChildren().add(piplupPreviewView);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					String piplupPreviewAudioString = "piplupPreviewAudio.mp3";
					Media piplupPreviewAudioMedia = new Media(new File(piplupPreviewAudioString).toURI().toString());
					MediaPlayer piplupPreviewAudioPlayer = new MediaPlayer(piplupPreviewAudioMedia);
					MediaView piplupPreviewAudioView = new MediaView(piplupPreviewAudioPlayer);
					piplupPreviewAudioPlayer.setAutoPlay(true);
					oakScreen.getChildren().add(piplupPreviewAudioView);
					
					prompt.setText("The water type pokemon Squirtle! I think thats a perfect pick.");
					
					StackPane pokemonChoosePane = new StackPane();
					Scene pokemonChooseScene = new Scene(pokemonChoosePane,200,200);
					Stage pokemonChooseConfirm = new Stage();
					
					Label confirmation = new Label("Would you like to start your adventure with Squirtle?");
					confirmation.setWrapText(true);
					Button yesButton = new Button("yes");
					Button noButton = new Button("no");
					confirmation.setTranslateY(-50);
					confirmation.setTranslateX(25);
					yesButton.setTranslateX(50);
					noButton.setTranslateX(-50);
					
					pokemonChoosePane.getChildren().addAll(confirmation,yesButton,noButton);
					
					pokemonChooseConfirm.setScene(pokemonChooseScene);
					pokemonChooseConfirm.show();
					
					EventHandler<ActionEvent> noPiplup = new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							piplupButton.setDisable(false);
							turtwigButton.setDisable(false);
							pokemonChooseConfirm.close();
						}
					};
					noButton.setOnAction(noPiplup);
					
					EventHandler<ActionEvent> yesPiplup = new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							piplupButton.setDisable(true);
							String catchingPokemonAudioString = "catchingPokemon.mp3";
							Media catchingPokemonAudioMedia = new Media(new File(catchingPokemonAudioString).toURI().toString());
							MediaPlayer catchingPokemonAudioPlayer = new MediaPlayer(catchingPokemonAudioMedia);
							MediaView catchingPokemonAudioView = new MediaView(catchingPokemonAudioPlayer);
							catchingPokemonAudioPlayer.setAutoPlay(true);
							oakScreen.getChildren().add(catchingPokemonAudioView);
							
							prompt.setText("Excellent choice. Im sure you and Piplup will go through amazing experieces and create wholesome memories!");
							
							Button nextButton1 = new Button("Next");
							nextButton1.setMinHeight(15);
							nextButton1.setMaxHeight(15);
							nextButton1.setTranslateY(290);
							nextButton1.setTranslateX(150);
							nextButton1.setTextFill(Color.RED);
							nextButton1.setStyle(
									"-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");
							oakScreen.getChildren().add(nextButton1);
							
							pokemonChooseConfirm.close();
							
							EventHandler<ActionEvent> nextButton1Prompt = new EventHandler<ActionEvent> () {

								@Override
								public void handle(ActionEvent arg0) {
									// TODO Auto-generated method stub
									nextButton1.setVisible(false);
									prompt.setText("Now, owning a Pokemon comes with great responsibilities and care. Treat the creature as if it were your own child. With that being said, enjoy the mysteries and accomplishments your adventures will bring you!");
									Button battleButton = new Button("The first Encounter");
									battleButton.setMinHeight(25);
									battleButton.setMaxHeight(25);
									battleButton.setTranslateY(300);
									battleButton.setTranslateX(150);
									battleButton.setTextFill(Color.RED);
									battleButton.setStyle(
											"-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");
									oakScreen.getChildren().add(battleButton);
									
									EventHandler<ActionEvent> piplupDuel = new EventHandler<ActionEvent>() {

										@Override
										public void handle(ActionEvent arg0) {
											PiplupBattleIntro piplupVs = new PiplupBattleIntro();
											chooseMusicPlayer.stop();
											piplupVs.PiplupBattle();
											oakLab.close();
										}
									};
									battleButton.setOnAction(piplupDuel);
									
								}
								
							};
							nextButton1.setOnAction(nextButton1Prompt);
						}
					};
					yesButton.setOnAction(yesPiplup);
					
				}
			};
			piplupButton.setOnAction(piplupPreview);
			
			oakLab.setScene(oakScene);
			oakLab.show();
			
			return null;
			
			
			
		};
		
	}
	

