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
     * @param stage The JavaFX Stage class is the top level JavaFX container
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        String msg = getParameters().getRaw().get(0);
        Text greeting = new Text(msg);
        
        StackPane root = new StackPane();
        root.getChildren().add(greeting);

        Scene scene = new Scene(root, 300, 250);

        stage.setTitle("Holi");
        stage.setScene(scene);
        stage.show();
    }

}
