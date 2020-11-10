import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Separator;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
//I used the following links to help me complete this project, in addition to class material.
//https://stackoverflow.com/questions/20710847/javafx-display-scene-background-image?noredirect=1&lq=1
//https://docs.oracle.com/javafx/2/text/jfxpub-text.htm
//https://www.tutorialspoint.com/how-to-create-a-toolbar-in-javafx
//http://tutorials.jenkov.com/javafx/toolbar.html
//https://www.youtube.com/watch?v=SpL3EToqaXA&list=PL6gx4Cwl9DGBzfXLWLSYVy8EbTdpGbUIG&index=5
/**
 * Application that allows the user to dock various ships.
 * Includes exciting functionality.
 * @author Brandon Noll
 * @version 1.2
 */
public class Starbase extends Application {
    private boolean button1Open = true;
    private boolean button2Open = true;
    private boolean button3Open = true;
    private boolean button4Open = true;
    private boolean button5Open = true;
    private boolean button6Open = true;
    private boolean button7Open = true;
    private boolean button8Open = true;

    /**
     * Getter for button1.
     * @return True if dock 1 is open, false if closed
     */
    public boolean isButton1Open() {
        return button1Open;
    }
    /**
     * Getter for button2.
     * @return True if dock 2 is open, false if closed
     */
    public boolean isButton2Open() {
        return button2Open;
    }
    /**
     * Getter for button3.
     * @return True if dock 3 is open, false if closed
     */
    public boolean isButton3Open() {
        return button3Open;
    }
    /**
     * Getter for button4.
     * @return True if dock 4 is open, false if closed
     */
    public boolean isButton4Open() {
        return button4Open;
    }
    /**
     * Getter for button5.
     * @return True if dock 5 is open, false if closed
     */
    public boolean isButton5Open() {
        return button5Open;
    }
    /**
     * Getter for button6.
     * @return True if dock 6 is open, false if closed
     */
    public boolean isButton6Open() {
        return button6Open;
    }
    /**
     * Getter for button7.
     * @return True if dock 7 is open, false if closed
     */
    public boolean isButton7Open() {
        return button7Open;
    }
    /**
     * Getter for button8.
     * @return True if dock 8 is open, false if closed
     */
    public boolean isButton8Open() {
        return button8Open;
    }
    @Override public void start(Stage primaryStage) {
        StackPane rootPane = new StackPane(); Pane pane1 = new Pane();
        ImageView imageView = new ImageView(new Image("space.jpg")); imageView.setFitHeight(1000);
        imageView.setFitWidth(1500); pane1.getChildren().addAll(imageView);
        BorderPane pane2 = new BorderPane(); StackPane shapeWithLabel  = new StackPane();
        Rectangle rectangle1 = new Rectangle(400, 70); Label label = new Label("Welcome to Starbase 1331!");
        label.setFont(new Font("Arial", 30)); label.setTextFill(Color.WHITE);
        shapeWithLabel.getChildren().addAll(rectangle1, label); pane2.setTop(shapeWithLabel);
        pane2.setMargin(shapeWithLabel, new Insets(50, 0, 0, 0));
        ToolBar toolbar = new ToolBar(); TextField textfield = new TextField();
        textfield.setText("Starship Name"); ChoiceBox<Starship> choicebox = new ChoiceBox<>();
        choicebox.getItems().addAll(Starship.DEFIANT, Starship.CONSTITUTION, Starship.INTREPID, Starship.GALAXY);
        Button dockingButton = new Button(); dockingButton.setText("Request Clearance To Dock");
        Button evacuateButton = new Button(); evacuateButton.setText("Evacuate Ports!");
        evacuateButton.setStyle("-fx-background-color: #ff0000");
        toolbar.getItems().addAll(textfield, new Separator(),
                choicebox, new Separator(), dockingButton, new Separator(), evacuateButton);
        pane2.setBottom(toolbar);

        //buttons in the center (8 of them)
        GridPane buttonPane = new GridPane(); Button button1 = new Button();
        Button button2 = new Button(); Button button3 = new Button(); Button button4 = new Button();
        Button button6 = new Button(); Button button7 = new Button(); Button button5 = new Button();
        Button button8 = new Button(); button1.setText("EMPTY"); button2.setText("EMPTY");
        button4.setText("EMPTY"); button5.setText("EMPTY"); button6.setText("EMPTY");
        button7.setText("EMPTY"); button8.setText("EMPTY"); button3.setText("EMPTY");
        button1.setPrefSize(150, 150); button2.setPrefSize(150, 150); button3.setPrefSize(150, 150);
        button4.setPrefSize(150, 150); button5.setPrefSize(150, 150); button6.setPrefSize(150, 150);
        button7.setPrefSize(150, 150); button8.setPrefSize(150, 150);
        button1.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
        button2.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
        button3.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
        button4.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
        button5.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
        button6.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
        button7.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
        button8.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
        buttonPane.add(button1, 0, 0, 1, 1); buttonPane.add(button2, 1, 0, 1, 1);
        buttonPane.add(button3, 2, 0, 1, 1); buttonPane.add(button4, 3, 0, 1, 1);
        buttonPane.add(button5, 0, 1, 1, 1); buttonPane.add(button6, 1, 1, 1, 1);
        buttonPane.add(button7, 2, 1, 1, 1); buttonPane.add(button8, 3, 1, 1, 1);
        pane2.setCenter(buttonPane); pane2.setMargin(buttonPane, new Insets(100, 0, 75, 75));
        rootPane.getChildren().add(pane1); rootPane.getChildren().add(pane2);
        button1.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent event) {
                button1.setText("EMPTY"); button1.setStyle("-fx-background-color: #7cfc00");
                button1Open = true;
                button1.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent event) {
                button2.setText("EMPTY"); button2.setStyle("-fx-background-color: #7cfc00"); button2Open = true;
                button2.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent event) {
                button3.setText("EMPTY"); button3.setStyle("-fx-background-color: #7cfc00"); button3Open = true;
                button3.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
            }
        });
        button4.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent event) {
                button4.setText("EMPTY"); button4.setStyle("-fx-background-color: #7cfc00"); button4Open = true;
                button4.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
            }
        });
        button5.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent event) {
                button5.setText("EMPTY"); button5.setStyle("-fx-background-color: #7cfc00"); button5Open = true;
                button5.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
            }
        });
        button6.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent event) {
                button6.setText("EMPTY"); button6.setStyle("-fx-background-color: #7cfc00"); button6Open = true;
                button6.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
            }
        });
        button7.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent event) {
                button7.setText("EMPTY"); button7.setStyle("-fx-background-color: #7cfc00"); button7Open = true;
                button7.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
            }
        });
        button8.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent event) {
                button8.setText("EMPTY"); button8.setStyle("-fx-background-color: #7cfc00"); button8Open = true;
                button8.setStyle("-fx-background-color: #7cfc00; -fx-border-color: #000000; -fx-border-width: 1px;");
            }
        });
        evacuateButton.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent event) {
                button1.fire(); button2.fire(); button3.fire(); button4.fire(); button5.fire(); button6.fire();
                button7.fire(); button8.fire();
            }
        });
        dockingButton.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent event) {
                String textGot = textfield.getText();
                if (textGot != null && !textGot.trim().equals("") && choicebox.getValue() != null) {
                    if (button1Open) {
                        button1.setText(textGot + "\n" + choicebox.getValue()); button1Open = false;
                        textfield.setText("");
                        button1.setStyle("-fx-background-color: #ff0000; "
                            + "-fx-border-color: #000000; -fx-border-width: 1px;");
                    } else if (button2Open) {
                        button2.setText(textGot + "\n" + choicebox.getValue());
                        button2.setStyle("-fx-background-color: #ff0000; "
                            + "-fx-border-color: #000000; -fx-border-width: 1px;");
                        button2Open = false; textfield.setText("");
                    } else if (button3Open) {
                        button3.setText(textGot + "\n" + choicebox.getValue()); button3Open = false;
                        textfield.setText("");
                        button3.setStyle("-fx-background-color: #ff0000; "
                                + "-fx-border-color: #000000; -fx-border-width: 1px;");
                    } else if (button4Open) {
                        button4.setText(textGot + "\n" + choicebox.getValue());
                        button4.setStyle("-fx-background-color: #ff0000; "
                            + "-fx-border-color: #000000; -fx-border-width: 1px;"); button4Open = false;
                        textfield.setText("");
                    } else if (button5Open) {
                        button5.setText(textGot + "\n" + choicebox.getValue());
                        button5.setStyle("-fx-background-color: #ff0000; -fx-border-color: "
                            + "#000000; -fx-border-width: 1px;"); button5Open = false; textfield.setText("");
                    } else if (button6Open) {
                        button6.setText(textGot + "\n" + choicebox.getValue());
                        button6.setStyle("-fx-background-color: #ff0000; "
                            + "-fx-border-color: #000000; -fx-border-width: 1px;"); button6Open = false;
                        textfield.setText("");
                    } else if (button7Open) {
                        button7.setText(textGot + "\n" + choicebox.getValue()); textfield.setText("");
                        button7.setStyle("-fx-background-color: #ff0000; "
                            + "-fx-border-color: #000000; -fx-border-width: 1px;"); button7Open = false;
                    } else if (button8Open) {
                        button8.setText(textGot + "\n" + choicebox.getValue()); textfield.setText("");
                        button8.setStyle("-fx-background-color: #ff0000; "
                            + "-fx-border-color: #000000; -fx-border-width: 1px;"); button8Open = false;
                    } else {
                        alertShow();
                    }
                    textfield.setText("");
                }
            }
        });

        textfield.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textfield.setText("");
            }
        });
        Scene scene = new Scene(rootPane, 750, 600);
        primaryStage.setScene(scene); primaryStage.setTitle("Starbase Command");
        primaryStage.setMinHeight(600); primaryStage.setMinWidth(750);
        primaryStage.setMaxHeight(600);
        primaryStage.setMaxWidth(750);
        primaryStage.show();
    }
    /**
     * Opens the alert box when called.
     */
    public static void alertShow() {
        Stage alertBox = new Stage();
        alertBox.setTitle("No Docks Available!");
        ImageView alertImage = new ImageView(new Image("Alert.png"));
        alertImage.setFitHeight(100); alertImage.setFitWidth(100); BorderPane alert = new BorderPane();
        alert.setCenter(alertImage); Label alertLabel = new Label(); alert.setTop(alertLabel);
        alert.setMargin(alertLabel, new Insets(50, 0, 25, 30));
        alertLabel.setText("Please wait for a dock to open up!");
        Scene scene1 = new Scene(alert, 250, 250);
        alertBox.setScene(scene1);
        alertBox.setMinHeight(250);
        alertBox.setMinWidth(250);
        alertBox.setMaxHeight(250);
        alertBox.setMaxWidth(250);
        alertBox.show();
    }
}
