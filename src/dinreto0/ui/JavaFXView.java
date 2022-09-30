package dinreto0.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Zuli;
 */
public class JavaFXView extends Application {

    /**
     * start JAVAFX components
     * When you launch the JavaFX aplication 
     * you take the string that you send on the launch
     * and create a new text object, then you build the panel 
     * with the messages, set a new scene and build it
     * @param stage The JavaFX Stage class is what we can call the window
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        String msg = getParameters().getRaw().get(0); //get the first string on the launch method
        Text greeting = new Text(msg); //set a Text object w/ the msg.
        StackPane stack = new StackPane(); 
        stack.getChildren().add(greeting); //adds the text to the panel
        Scene scene = new Scene(stack, 300, 250); //build the scene
        stage.setTitle("Holi");
        stage.setScene(scene);
        stage.show();
    }

}
