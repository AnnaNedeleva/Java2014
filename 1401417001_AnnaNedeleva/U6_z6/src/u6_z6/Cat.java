/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u6_z6;

/**
 *
 * @author User
 */
public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }
    
    
       
    @Override
    public void makeNoise(){
       System.out.printf( "Cat named %s makes some \"Mia-mia\". %n", name);
    }
    
}
