/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

/**
 *
 * @author ZuliLeire
 */
public class ViewConsoleImplementation implements View {

    /**
     * It sends you a greeting and prints 
     * it to you on the console
     * @param greeting send the greeting in order to print it to console
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
}
