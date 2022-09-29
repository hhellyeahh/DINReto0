/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import dinreto0.ui.SwingView;

/**
 *
 * @author ZuliLeire
 */
public class ViewSwingImplementation implements View {

    /**
     * Implementation for de swing view
     * @param greeting 
     */
    @Override
    public void showGreeting(String greeting) {
        SwingView swing = new SwingView(greeting);
        swing.setVisible(true);
    }
}
