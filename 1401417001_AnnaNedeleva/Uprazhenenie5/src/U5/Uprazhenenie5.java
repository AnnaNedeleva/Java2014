package U5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class Uprazhenenie5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person girl = new Person();
        Person boy = new Person();
        Person man = new Person();
        System.out.println(boy);
        //man = null;
        
        System.out.println(man);
        
        /*girl.name= "Anna";
        girl.surname="Nedeleva";
        girl.age=27;*/
        
        boy.setName("Ivan");
        boy.setSurname("Ivanov");
        boy.setAge(33);
        
            
        System.out.printf("Hello! My name is %s %s and I'm %d old. %n",
        girl.name, girl.surname, girl.age);
        
        boy.Introduce();
        System.out.printf("Girls's age is %d.%n",girl.getAge());
        
        Person woman = new Person("Sara","Smith", 55);
        woman.Introduce();
        
    }
    
}
