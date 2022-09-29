/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import dinreto0.ui.JavaFXView;
import javafx.application.Application;

/**
 *
 * @author 2dam
 */
public class ViewJavaFXImplementation implements View{

    @Override
    public void showGreeting(String greeting) {
        Application.launch(JavaFXView.class,greeting );
    }
    
}
