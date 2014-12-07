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
public class Animal implements Noisable{
    
    /**
     *
     */
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        
    }
       
    
    @Override
    public void makeNoise(){
        System.out.printf("Animal named %s makes some noise. %n", name);
    }
    
}
