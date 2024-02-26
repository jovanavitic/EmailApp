/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

/**
 *
 * @author jovan
 */
public class EmailApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Email em1 = new Email("Jovana", "Vitic");
        
        em1.setAlternativeEmail("j.v@gmail.com");
        System.out.println("Alternative email is: " + em1.getaltEmail());
        
        System.out.println(em1.showInfo());
        
        
    }
    
}
