// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXBookQuote1a extends Application {
    
    static final String QUOTE_TEXT = "Far out in the uncharted backwaters of the unfashionable end of the western spiral arm of the Galaxy lies a small unregarded yellow sun. Orbiting this at a distance of roughly ninety-two million miles is an utterly insignificant little blue green planet whose ape-descended life forms are so amazingly primitive that they still think digital watches are a pretty neat idea.";
    
    @Override
    public void start(Stage primaryStage) {                
        VBox root = new VBox();
        
        Label lblQuote = new Label();
        lblQuote.setText(QUOTE_TEXT);        
        lblQuote.setWrapText(true);
        root.getChildren().add(lblQuote);
        
        Scene scene = new Scene(root, 400, 250);
        
        primaryStage.setTitle("FX Book Quote 1a");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
