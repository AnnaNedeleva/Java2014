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
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }
    
    @Override
    public void makeNoise(){
       System.out.printf( "Dog named %s makes some \"Bow-bow\". %n", name);
    }
}
