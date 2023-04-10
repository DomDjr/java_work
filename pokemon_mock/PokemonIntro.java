package UpdatedPokemonGame;

import java.io.File;
import java.net.MalformedURLException;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PokemonIntro {

	public static EventHandler<ActionEvent> ChangeToIntro() {
		Stage introStage = new Stage();
		StackPane introScreen = new StackPane();
		Scene introStart = new Scene(introScreen, 1280, 720);

		EventHandler<ActionEvent> introSection = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String oakOpeningString = "OakOpening.mp3";
				Media openingMedia = new Media(new File(oakOpeningString).toURI().toString());
				MediaPlayer openingPlayer = new MediaPlayer(openingMedia);
				MediaView openingView = new MediaView(openingPlayer);
				openingPlayer.setAutoPlay(true);
				openingPlayer.setCycleCount(MediaPlayer.INDEFINITE);
				introScreen.getChildren().add(openingView);
				try {
					File introBackground = new File("introScene.jpeg");

					Image introImage = new Image(introBackground.toURI().toURL().toExternalForm());
					System.out.println(introImage.getHeight());
					System.out.println(introImage.getWidth());
					introScreen.getChildren().add(new ImageView(introImage));

				} catch (Exception e) {
					e.printStackTrace();
				}

				try {
					File oakFile = new File("ProfessorOak.png");

					Image oakImage = new Image(oakFile.toURI().toURL().toExternalForm());
					System.out.println(oakImage.getHeight());
					System.out.println(oakImage.getWidth());
					ImageView oakView = new ImageView(oakImage);
					oakView.setTranslateY(200);
					introScreen.getChildren().add(oakView);

					FadeTransition fadeInOak = new FadeTransition(Duration.seconds(2), oakView);
					fadeInOak.setFromValue(0);
					fadeInOak.setToValue(1.0);
					fadeInOak.play();

				} catch (Exception e) {
					e.printStackTrace();

				}

				try {
					File textBubbleFile = new File("textBubble.png");

					Image textBubbleImage = new Image(textBubbleFile.toURI().toURL().toExternalForm());
					System.out.println(textBubbleImage.getHeight());
					System.out.println(textBubbleImage.getWidth());
					ImageView textBubbleView = new ImageView(textBubbleImage);
					textBubbleView.setTranslateY(300);
					textBubbleView.setFitWidth(680);
					introScreen.getChildren().add(textBubbleView);

				} catch (Exception e) {
					e.printStackTrace();

				}

				Label prompt = new Label();
				prompt.setMinHeight(70);
				prompt.setMaxHeight(70);
				prompt.setMinWidth(410);
				prompt.setMaxWidth(410);
				prompt.setTranslateY(300);
				prompt.setStyle(
						"-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");
				prompt.setText(
						"Hello there! It's so very nice to meet you! Welcome to the world of Pokemon! My name is Rowan. However, everyone just calls me the Pokemon Professor. Here, I have a Poke ball. Touch the button on the middle of the Poke ball, if you'd please.");
				prompt.setWrapText(true);
				introScreen.getChildren().add(prompt);

				Button nextButton = new Button("Next");
				nextButton.setMinHeight(21);
				nextButton.setMaxHeight(21);
				nextButton.setTranslateY(324);
				nextButton.setTranslateX(30);
				nextButton.setTextFill(Color.RED);
				nextButton.setStyle(
						"-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");
				introScreen.getChildren().add(nextButton);

				EventHandler<ActionEvent> introPokeBall = new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						String buttonAString = "PokemonAButton.mp3";
						Media buttonAMedia = new Media(new File(buttonAString).toURI().toString());
						MediaPlayer buttonAPlayer = new MediaPlayer(buttonAMedia);
						MediaView buttonAView = new MediaView(buttonAPlayer);
						buttonAPlayer.setAutoPlay(true);
						introScreen.getChildren().add(buttonAView);
						nextButton.setVisible(false);
						// TODO Auto-generated method stub
						try {
							File introPokeBallFile = new File("IntroPokeBall.png");

							Image introPokeBallImage = new Image(introPokeBallFile.toURI().toURL().toExternalForm());
							System.out.println(introPokeBallImage.getHeight());
							System.out.println(introPokeBallImage.getWidth());
							ImageView introPokeBallView = new ImageView(introPokeBallImage);
							introPokeBallView.setFitHeight(introPokeBallImage.getHeight() / 4);
							introPokeBallView.setFitWidth(introPokeBallImage.getWidth() / 4);
							introPokeBallView.setTranslateX(300);
							introPokeBallView.setTranslateY(250);
							introScreen.getChildren().add(introPokeBallView);

							Button pokeBallButton = new Button();
							pokeBallButton.setShape(new Circle(0.5));
							pokeBallButton.setTranslateX(293.6);
							pokeBallButton.setTranslateY(272.3);
							pokeBallButton.setMinHeight(10);
							pokeBallButton.setMaxHeight(10);
							pokeBallButton.setMinWidth(10);
							pokeBallButton.setMaxWidth(10);
							introScreen.getChildren().add(pokeBallButton);

							EventHandler<ActionEvent> introMunchlax = new EventHandler<ActionEvent>() {

								@Override
								public void handle(ActionEvent arg0) {
									String pokeBallOpenString = "pokeBallOpen.mp3";
									Media pokeBallOpenMedia = new Media(new File(pokeBallOpenString).toURI().toString());
									MediaPlayer pokeBallOpenPlayer = new MediaPlayer(pokeBallOpenMedia);
									MediaView pokeBallOpenView = new MediaView(pokeBallOpenPlayer);
									pokeBallOpenPlayer.setAutoPlay(true);
									introScreen.getChildren().add(pokeBallOpenView);
									
									// TODO Auto-generated method stub
									FadeTransition fadeOutPokeBall = new FadeTransition(Duration.seconds(2),
											introPokeBallView);
									fadeOutPokeBall.setFromValue(1.0);
									fadeOutPokeBall.setToValue(0);
									fadeOutPokeBall.play();

									FadeTransition fadeOutPokeBallButton = new FadeTransition(Duration.seconds(2),
											pokeBallButton);
									fadeOutPokeBallButton.setFromValue(1.0);
									fadeOutPokeBallButton.setToValue(0);
									fadeOutPokeBallButton.play();

									nextButton.setVisible(false);

									File munchlaxFile = new File("munchlax.png");
									Image munchlaxImage;
									try {
										munchlaxImage = new Image(munchlaxFile.toURI().toURL().toExternalForm());
										System.out.println(munchlaxImage.getHeight());
										System.out.println(munchlaxImage.getWidth());
										ImageView munchlaxView = new ImageView(munchlaxImage);
										munchlaxView.setFitHeight(170);
										munchlaxView.setFitWidth(150);
										munchlaxView.setTranslateX(420);
										munchlaxView.setTranslateY(220);
										introScreen.getChildren().add(munchlaxView);

										prompt.setText(
												"We humans live alongside Pokemon as friends. At times we play together, and at other times we work together. Some people use their Pokemon to battle and develop closer bonds with them. What do I do? I conduct research so that we may learn more about Pokemon.");
										introPokeBallView.setVisible(false);
										pokeBallButton.setVisible(false);
										Button nextButton2 = new Button("Next");
										nextButton2.setMinHeight(21);
										nextButton2.setMaxHeight(21);
										nextButton2.setTranslateY(324);
										nextButton2.setTranslateX(110);
										nextButton2.setTextFill(Color.RED);
										nextButton2.setStyle(
												"-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");
										introScreen.getChildren().add(nextButton2);

										EventHandler<ActionEvent> onNextButton = new EventHandler<ActionEvent>() {

											@Override
											public void handle(ActionEvent arg0) {
												String buttonAString = "PokemonAButton.mp3";
												Media buttonAMedia = new Media(new File(buttonAString).toURI().toString());
												MediaPlayer buttonAPlayer = new MediaPlayer(buttonAMedia);
												MediaView buttonAView = new MediaView(buttonAPlayer);
												buttonAPlayer.setAutoPlay(true);
												introScreen.getChildren().add(buttonAView);
												
												// TODO Auto-generated method stub
												prompt.setText(
														"Now, why don't you tell me a little bit about yourself? Are you a boy? Or are you a girl?");

												try {
													nextButton2.setVisible(false);

													File lucasFile = new File("lucasImage.png");

													Image lucasImage = new Image(
															lucasFile.toURI().toURL().toExternalForm());
													System.out.println(lucasImage.getHeight());
													System.out.println(lucasImage.getWidth());
													ImageView lucasView = new ImageView(lucasImage);
													lucasView.setFitHeight(lucasImage.getHeight() / 2);
													lucasView.setFitWidth(lucasImage.getWidth() / 2);
													lucasView.setTranslateX(-460);
													lucasView.setTranslateY(150);

													FadeTransition fadeInLucas = new FadeTransition(Duration.seconds(1),
															lucasView);
													fadeInLucas.setFromValue(0);
													fadeInLucas.setToValue(1.0);
													fadeInLucas.play();

													introScreen.getChildren().add(lucasView);

													File dawnFile = new File("dawnImage.png");

													Image dawnImage = new Image(
															dawnFile.toURI().toURL().toExternalForm());
													System.out.println(dawnImage.getHeight());
													System.out.println(dawnImage.getWidth());
													ImageView dawnView = new ImageView(dawnImage);
													dawnView.setFitHeight(dawnImage.getHeight() / 2);
													dawnView.setFitWidth(dawnImage.getWidth() / 2);
													dawnView.setTranslateX(-300);
													dawnView.setTranslateY(150);

													FadeTransition fadeInDawn = new FadeTransition(Duration.seconds(1),
															dawnView);
													fadeInDawn.setFromValue(0);
													fadeInDawn.setToValue(1.0);
													fadeInDawn.play();

													introScreen.getChildren().add(dawnView);

													Button boyButton = new Button("Boy");
													boyButton.setTranslateX(-470);
													boyButton.setTranslateY(280);
													introScreen.getChildren().add(boyButton);

													Button girlButton = new Button("Girl");
													girlButton.setTranslateX(-290);
													girlButton.setTranslateY(280);
													introScreen.getChildren().add(girlButton);

													boyButton.setOnMouseClicked((MouseEvent e) -> {
														Stage confirmStage = new Stage();
														StackPane confirmPane = new StackPane();
														Scene confirmScene = new Scene(confirmPane, 200, 200);

														Label confirmation = new Label("Confirm?");
														Button yesButton = new Button("yes");
														Button noButton = new Button("no");
														confirmation.setTranslateY(-50);
														yesButton.setTranslateX(50);
														noButton.setTranslateX(-50);

														confirmPane.getChildren().add(confirmation);
														confirmPane.getChildren().add(yesButton);
														confirmPane.getChildren().add(noButton);
														confirmStage.setScene(confirmScene);
														confirmStage.show();

														EventHandler<ActionEvent> noButtonPressed = new EventHandler<ActionEvent>() {

															@Override
															public void handle(ActionEvent arg0) {
																String buttonAString = "PokemonAButton.mp3";
																Media buttonAMedia = new Media(new File(buttonAString).toURI().toString());
																MediaPlayer buttonAPlayer = new MediaPlayer(buttonAMedia);
																MediaView buttonAView = new MediaView(buttonAPlayer);
																buttonAPlayer.setAutoPlay(true);
																introScreen.getChildren().add(buttonAView);
																
																// TODO Auto-generated method stub
																confirmStage.close();

															}
														};
														noButton.setOnAction(noButtonPressed);

														EventHandler<ActionEvent> yesButtonPressed = new EventHandler<ActionEvent>() {

															@Override
															public void handle(ActionEvent arg0) {
																// TODO Auto-generated method stub
																String buttonAString = "PokemonAButton.mp3";
																Media buttonAMedia = new Media(new File(buttonAString).toURI().toString());
																MediaPlayer buttonAPlayer = new MediaPlayer(buttonAMedia);
																MediaView buttonAView = new MediaView(buttonAPlayer);
																buttonAPlayer.setAutoPlay(true);
																introScreen.getChildren().add(buttonAView);
																
																confirmStage.close();
																prompt.setText("Alright so a boy it is!?");
																girlButton.setVisible(false);
																boyButton.setVisible(false);
																confirmPane.getChildren().remove(boyButton);
																fadeInDawn.setFromValue(1.0);
																fadeInDawn.setToValue(0);
																fadeInDawn.play();

																Button nextButton3 = new Button("Next");
																nextButton3.setMinHeight(21);
																nextButton3.setMaxHeight(21);
																nextButton3.setTranslateY(324);
																nextButton3.setTranslateX(110);
																nextButton3.setTextFill(Color.RED);
																nextButton3.setStyle(
																		"-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");
																introScreen.getChildren().add(nextButton3);

																EventHandler<ActionEvent> toEnterName = new EventHandler<ActionEvent>() {

																	@Override
																	public void handle(ActionEvent arg0) {
																		String buttonAString = "PokemonAButton.mp3";
																		Media buttonAMedia = new Media(new File(buttonAString).toURI().toString());
																		MediaPlayer buttonAPlayer = new MediaPlayer(buttonAMedia);
																		MediaView buttonAView = new MediaView(buttonAPlayer);
																		buttonAPlayer.setAutoPlay(true);
																		introScreen.getChildren().add(buttonAView);
																		
																		prompt.setText(
																				"Now, tell me, what is your name?");
																		nextButton3.setVisible(false);
																		TextField nameField = new TextField(
																				"Enter name");
																		nameField.setTranslateX(-440);
																		nameField.setTranslateY(-50);
																		nameField.setMinWidth(100);
																		nameField.setMaxWidth(100);
																		introScreen.getChildren().add(nameField);

																		Button submitNameButton = new Button("Submit");
																		submitNameButton.setTranslateX(-380);
																		submitNameButton.setTranslateY(-50);
																		introScreen.getChildren().add(submitNameButton);

																		EventHandler<ActionEvent> nameConfirm = new EventHandler<ActionEvent>() {

																			@Override
																			public void handle(ActionEvent arg0) {
																				String buttonAString = "PokemonAButton.mp3";
																				Media buttonAMedia = new Media(new File(buttonAString).toURI().toString());
																				MediaPlayer buttonAPlayer = new MediaPlayer(buttonAMedia);
																				MediaView buttonAView = new MediaView(buttonAPlayer);
																				buttonAPlayer.setAutoPlay(true);
																				introScreen.getChildren().add(buttonAView);
																				
																				Stage nameConfirm = new Stage();
																				StackPane confirmPane = new StackPane();
																				Scene confirmScene = new Scene(
																						confirmPane, 200, 200);

																				Label confirmLabel = new Label(
																						"Does " + nameField.getText()
																								+ " work?");
																				confirmPane.getChildren()
																						.add(confirmLabel);
																				
																				Button yesNameConfirmButton = new Button("Yes");
																				yesNameConfirmButton.setTranslateX(50);
																				yesNameConfirmButton.setTranslateY(50);
																				confirmPane.getChildren().add(yesNameConfirmButton);
																				
																				Button noConfirmButton = new Button("No");
																				noConfirmButton.setTranslateX(-50);
																				noConfirmButton.setTranslateY(50);
																				confirmPane.getChildren().add(noConfirmButton);

																				nameConfirm.setScene(confirmScene);
																				nameConfirm.show();
																				
																				EventHandler<ActionEvent> noConfirmButtonPress = new EventHandler<ActionEvent>() {

																					@Override
																					public void handle(ActionEvent arg0) {
																						String buttonAString = "PokemonAButton.mp3";
																						Media buttonAMedia = new Media(new File(buttonAString).toURI().toString());
																						MediaPlayer buttonAPlayer = new MediaPlayer(buttonAMedia);
																						MediaView buttonAView = new MediaView(buttonAPlayer);
																						buttonAPlayer.setAutoPlay(true);
																						introScreen.getChildren().add(buttonAView);
																						nameConfirm.close();
																					}
																					
																				};
																				noConfirmButton.setOnAction(noConfirmButtonPress);;
																				
																				EventHandler<ActionEvent> yesConfirmButtonPress = new EventHandler<ActionEvent> () {
																					@Override
																					public void handle(ActionEvent arg0) {
																						String buttonAString = "PokemonAButton.mp3";
																						Media buttonAMedia = new Media(new File(buttonAString).toURI().toString());
																						MediaPlayer buttonAPlayer = new MediaPlayer(buttonAMedia);
																						MediaView buttonAView = new MediaView(buttonAPlayer);
																						buttonAPlayer.setAutoPlay(true);
																						introScreen.getChildren().add(buttonAView);
																						nameConfirm.close();
																						prompt.setText("Ok…So, you're ready? A fine name that is! Now, this boy here…I believe he's your friend. What might his name be?");
																						File friendFile = new File("friend.png");
																						nextButton.setVisible(false);
																						
																						Image friendImage;
																						try {
																							friendImage = new Image(friendFile.toURI().toURL().toExternalForm());
																							ImageView friendView = new ImageView(friendImage);
																							friendView.setFitHeight(friendImage.getHeight() / 2.5);
																							friendView.setFitWidth(friendImage.getWidth() / 2.5);
																							friendView.setTranslateX(-290);
																							friendView.setTranslateY(150);

																							FadeTransition fadeInFriend = new FadeTransition(Duration.seconds(1),
																									friendView);
																							fadeInFriend.setFromValue(0);
																							fadeInFriend.setToValue(1.0);
																							fadeInFriend.play();
																							introScreen.getChildren().add(friendView);
																						} catch (MalformedURLException e) {
																							// TODO Auto-generated catch block
																							e.printStackTrace();
																						}
																						
																						nameField.setEditable(false);
																						submitNameButton.setVisible(false);
																						
																						TextField friendNameField = new TextField(
																								"Enter name");
																						friendNameField.setTranslateX(-310);
																						friendNameField.setTranslateY(-50);
																						friendNameField.setMinWidth(100);
																						friendNameField.setMaxWidth(100);
																						introScreen.getChildren().add(friendNameField);

																						Button submitFriendNameButton = new Button("Submit");
																						submitFriendNameButton.setTranslateX(-250);
																						submitFriendNameButton.setTranslateY(-50);
																						introScreen.getChildren().add(submitFriendNameButton);
																						
																						EventHandler<ActionEvent> submitFriendName = new EventHandler<ActionEvent>() {
																							@Override
																							public void handle(ActionEvent arg0) {
																								String buttonAString = "PokemonAButton.mp3";
																								Media buttonAMedia = new Media(new File(buttonAString).toURI().toString());
																								MediaPlayer buttonAPlayer = new MediaPlayer(buttonAMedia);
																								MediaView buttonAView = new MediaView(buttonAPlayer);
																								buttonAPlayer.setAutoPlay(true);
																								introScreen.getChildren().add(buttonAView);
																								Stage friendNameConfirm = new Stage();
																								StackPane friendConfirmPane = new StackPane();
																								Scene friendNameScene = new Scene(friendConfirmPane, 200,200);
																								
																								Label confirmNameLabel = new Label(
																										friendNameField.getText()
																												+ " is it? That's your friend's name?");
																								confirmNameLabel.setWrapText(true);
																								confirmPane.getChildren()
																										.add(confirmNameLabel);
																								
																								Button yesFriendNameConfirm = new Button("Yes");
																								yesFriendNameConfirm.setTranslateX(50);
																								yesFriendNameConfirm.setTranslateY(50);
																								Button noFriendNameConfirm = new Button("No");
																								noFriendNameConfirm.setTranslateX(-50);
																								noFriendNameConfirm.setTranslateY(50);
																								
																								friendConfirmPane.getChildren().addAll(yesFriendNameConfirm, noFriendNameConfirm, confirmNameLabel);
																								
																								friendNameConfirm.setScene(friendNameScene);
																								friendNameConfirm.show();
																								
																								EventHandler<ActionEvent> noConfirmFriendName = new EventHandler<ActionEvent>() {
																									@Override
																									public void handle(ActionEvent arg0) {
																										String buttonAString = "PokemonAButton.mp3";
																										Media buttonAMedia = new Media(new File(buttonAString).toURI().toString());
																										MediaPlayer buttonAPlayer = new MediaPlayer(buttonAMedia);
																										MediaView buttonAView = new MediaView(buttonAPlayer);
																										buttonAPlayer.setAutoPlay(true);
																										introScreen.getChildren().add(buttonAView);
																										friendNameConfirm.close();
																									}
																								};
																								noFriendNameConfirm.setOnAction(noConfirmFriendName);
																								
																								EventHandler<ActionEvent> yesConfirmFriendName = new EventHandler<ActionEvent>() {
																									@Override
																									public void handle(ActionEvent arg0) {
																										String buttonAString = "PokemonAButton.mp3";
																										Media buttonAMedia = new Media(new File(buttonAString).toURI().toString());
																										MediaPlayer buttonAPlayer = new MediaPlayer(buttonAMedia);
																										MediaView buttonAView = new MediaView(buttonAPlayer);
																										buttonAPlayer.setAutoPlay(true);
																										submitFriendNameButton.setVisible(false);
																										introScreen.getChildren().add(buttonAView);
																										
																										friendNameConfirm.close();
																										prompt.setText("All right. " + nameField.getText() + " the time has come. Your very own tale of grand adventure is about to unfold. On your journey, you will meet countless Pokemon and people. I'm sure that along the way you will discover many things, perhaps even something about yourself. Now, go on, leap into the world of Pokemon!");
																										
																										Button labButton = new Button("Choose A Pokemon");
																										labButton.setTranslateY(-100);
																										introScreen.getChildren().add(labButton);
																										
																										EventHandler<ActionEvent> oaksLab = new EventHandler<ActionEvent>() {
																											@Override
																											public void handle(ActionEvent arg0) {
																												PokemonChoose lab = new PokemonChoose();
																												lab.oaksLab();
																												introStage.close();
																												openingPlayer.stop();
																											}
																										};
																										labButton.setOnAction(oaksLab);
																									}
																								};
																								yesFriendNameConfirm.setOnAction(yesConfirmFriendName);
																								
																							}
																						};
																						submitFriendNameButton.setOnAction(submitFriendName);
																						
																						
																						
																					}
																					
																				};
																				yesNameConfirmButton.setOnAction(yesConfirmButtonPress);
																				
																				
																			}
																		};
																		submitNameButton.setOnAction(nameConfirm);
																	}
																};
																nextButton3.setOnAction(toEnterName);

															}
														};
														yesButton.setOnAction(yesButtonPressed);
														System.out.println("hello");
													});

													girlButton.setOnMouseClicked((MouseEvent e) -> {
														Stage confirmStage = new Stage();
														StackPane confirmPane = new StackPane();
														Scene confirmScene = new Scene(confirmPane, 200, 200);

														Label confirmation = new Label("Confirm?");
														Button yesButton = new Button("yes");
														Button noButton = new Button("no");
														confirmation.setTranslateY(-50);
														yesButton.setTranslateX(50);
														noButton.setTranslateX(-50);

														confirmPane.getChildren().add(confirmation);
														confirmPane.getChildren().add(yesButton);
														confirmPane.getChildren().add(noButton);

														confirmStage.setScene(confirmScene);
														confirmStage.show();

														EventHandler<ActionEvent> noButtonPressed = new EventHandler<ActionEvent>() {

															@Override
															public void handle(ActionEvent arg0) {
																// TODO Auto-generated method stub
																confirmStage.close();

															}
														};
														noButton.setOnAction(noButtonPressed);
														EventHandler<ActionEvent> yesButtonPressed = new EventHandler<ActionEvent>() {

															@Override
															public void handle(ActionEvent arg0) {
																// TODO Auto-generated method stub
																confirmStage.close();
																prompt.setText("Alright so a girl it is!?");
																girlButton.setVisible(false);
																boyButton.setVisible(false);
																fadeInLucas.setFromValue(1.0);
																fadeInLucas.setToValue(0);
																fadeInLucas.play();

																Button nextButton3 = new Button("Next");
																nextButton3.setMinHeight(21);
																nextButton3.setMaxHeight(21);
																nextButton3.setTranslateY(324);
																nextButton3.setTranslateX(110);
																nextButton3.setTextFill(Color.RED);
																nextButton3.setStyle(
																		"-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");
																introScreen.getChildren().add(nextButton3);

																EventHandler<ActionEvent> toEnterName = new EventHandler<ActionEvent>() {

																	@Override
																	public void handle(ActionEvent arg0) {
																		prompt.setText(
																				"Now, tell me, what is your name?");
																		nextButton3.setVisible(false);

																		TextField nameField = new TextField(
																				"Enter name");
																		nameField.setTranslateX(-330);
																		nameField.setTranslateY(-50);
																		nameField.setMinWidth(100);
																		nameField.setMaxWidth(100);
																		introScreen.getChildren().add(nameField);

																		Button submitNameButton = new Button("Submit");
																		submitNameButton.setTranslateX(-270);
																		submitNameButton.setTranslateY(-50);
																		introScreen.getChildren().add(submitNameButton);

																		EventHandler<ActionEvent> nameConfirm = new EventHandler<ActionEvent>() {

																			@Override
																			public void handle(ActionEvent arg0) {
																				Stage nameConfirm = new Stage();
																				StackPane confirmPane = new StackPane();
																				Scene confirmScene = new Scene(
																						confirmPane, 200, 200);

																				Label confirmLabel = new Label(
																						"Does " + nameField.getText()
																								+ " work?");
																				confirmPane.getChildren()
																						.add(confirmLabel);
																				
																				Button yesConfirmButton = new Button("Yes");
																				yesConfirmButton.setTranslateX(50);
																				yesConfirmButton.setTranslateY(50);
																				confirmPane.getChildren().add(yesConfirmButton);
																				
																				Button noConfirmButton = new Button("No");
																				noConfirmButton.setTranslateX(-50);
																				noConfirmButton.setTranslateY(50);
																				confirmPane.getChildren().add(noConfirmButton);
																				
																				nameConfirm.setScene(confirmScene);
																				nameConfirm.show();
																				
																				EventHandler<ActionEvent> noConfirmButtonPress = new EventHandler<ActionEvent>() {

																					@Override
																					public void handle(ActionEvent arg0) {
																						nameConfirm.close();
																					}
																					
																				};
																				noConfirmButton.setOnAction(noConfirmButtonPress);;
																				
																				EventHandler<ActionEvent> yesConfirmButtonPress = new EventHandler<ActionEvent> () {
																					@Override
																					public void handle(ActionEvent arg0) {
																						nameConfirm.close();
																						prompt.setText("Ok…So, you're ready? A fine name that is! Now, this boy here…I believe he's your friend. What might his name be?");
																						nextButton.setVisible(false);
																						
																						File friendFile = new File("friend.png");

																						Image friendImage;
																						try {
																							friendImage = new Image(friendFile.toURI().toURL().toExternalForm());
																							ImageView friendView = new ImageView(friendImage);
																							friendView.setFitHeight(friendImage.getHeight() / 2.5);
																							friendView.setFitWidth(friendImage.getWidth() / 2.5);
																							friendView.setTranslateX(-480);
																							friendView.setTranslateY(150);

																							FadeTransition fadeInFriend = new FadeTransition(Duration.seconds(1),
																									friendView);
																							fadeInFriend.setFromValue(0);
																							fadeInFriend.setToValue(1.0);
																							fadeInFriend.play();
																							introScreen.getChildren().add(friendView);
																						} catch (MalformedURLException e) {
																							// TODO Auto-generated catch block
																							e.printStackTrace();
																						}
																						
																						nameField.setEditable(false);
																						submitNameButton.setVisible(false);
																						
																						TextField friendNameField = new TextField(
																								"Enter name");
																						friendNameField.setTranslateX(-480);
																						friendNameField.setTranslateY(-50);
																						friendNameField.setMinWidth(100);
																						friendNameField.setMaxWidth(100);
																						introScreen.getChildren().add(friendNameField);

																						Button submitFriendNameButton = new Button("Submit");
																						submitFriendNameButton.setTranslateX(-420);
																						submitFriendNameButton.setTranslateY(-50);
																						introScreen.getChildren().add(submitFriendNameButton);
																						
																						EventHandler<ActionEvent> submitFriendName = new EventHandler<ActionEvent>() {
																							@Override
																							public void handle(ActionEvent arg0) {
																								Stage friendNameConfirm = new Stage();
																								StackPane friendConfirmPane = new StackPane();
																								Scene friendNameScene = new Scene(friendConfirmPane, 200,200);
																								
																								Label confirmNameLabel = new Label(
																										"ah.. was it " + friendNameField.getText()
																												+ " ?");
																								confirmNameLabel.setWrapText(true);
																								confirmPane.getChildren()
																										.add(confirmNameLabel);
																								
																								Button yesFriendNameConfirm = new Button("Yes");
																								yesFriendNameConfirm.setTranslateX(50);
																								yesFriendNameConfirm.setTranslateY(50);
																								Button noFriendNameConfirm = new Button("No");
																								noFriendNameConfirm.setTranslateX(-50);
																								noFriendNameConfirm.setTranslateY(50);
																								
																								friendConfirmPane.getChildren().addAll(yesFriendNameConfirm, noFriendNameConfirm, confirmNameLabel);
																								
																								friendNameConfirm.setScene(friendNameScene);
																								friendNameConfirm.show();
																								
																								EventHandler<ActionEvent> noConfirmFriendName = new EventHandler<ActionEvent>() {
																									@Override
																									public void handle(ActionEvent arg0) {
																										friendNameConfirm.close();
																									}
																								};
																								noFriendNameConfirm.setOnAction(noConfirmFriendName);
																								
																								EventHandler<ActionEvent> yesConfirmFriendName = new EventHandler<ActionEvent>() {
																									@Override
																									public void handle(ActionEvent arg0) {
																										friendNameConfirm.close();
																										prompt.setText("All right. " + nameField.getText() + " the time has come. Your very own tale of grand adventure is about to unfold. On your journey, you will meet countless Pokemon and people. I'm sure that along the way you will discover many things, perhaps even something about yourself. Now, go on, leap into the world of Pokemon!");
																										submitFriendNameButton.setVisible(false);
																										
																										Button labButton = new Button("Choose A Pokemon");
																										labButton.setTranslateY(-100);
																										introScreen.getChildren().add(labButton);
																										
																										EventHandler<ActionEvent> oaksLab = new EventHandler<ActionEvent>() {
																											@Override
																											public void handle(ActionEvent arg0) {
																												PokemonChoose lab = new PokemonChoose();
																												lab.oaksLab();
																												introStage.close();
																												openingPlayer.stop();
																											}
																										};
																										labButton.setOnAction(oaksLab);
																									}
																								};
																								yesFriendNameConfirm.setOnAction(yesConfirmFriendName);
																								
																								
																								
																							}
																						};
																						submitFriendNameButton.setOnAction(submitFriendName);
																						
																						
																						
																					}
																					
																				};
																				yesConfirmButton.setOnAction(yesConfirmButtonPress);
																				
																			}
																		};
																		submitNameButton.setOnAction(nameConfirm);
																	}
																};
																nextButton3.setOnAction(toEnterName);

															}
														};
														yesButton.setOnAction(yesButtonPressed);

													});

												} catch (Exception e) {
													e.printStackTrace();

												}

											}
										};
										nextButton2.setOnAction(onNextButton);

									} catch (MalformedURLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

								}

							};
							pokeBallButton.setOnAction(introMunchlax);

						} catch (Exception e) {
							e.printStackTrace();

						}
					}

				};
				nextButton.setOnAction(introPokeBall);

				introStage.setScene(introStart);
				introStage.show();

			}

		};

		return introSection;
	};

}
