/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u5_z8;

import U5.Person;

/**
 *
 * @author User
 */
public class U5_z8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student number1 = new Student();
        number1.UspehOfStudent();
        
        number1.setName("Ivan Ivanov");
        number1.setUspeh(5.5);
        number1.UspehOfStudent();
        
        Person boy = new Person();
        boy.Introduce();
                
        
    }
    
}
