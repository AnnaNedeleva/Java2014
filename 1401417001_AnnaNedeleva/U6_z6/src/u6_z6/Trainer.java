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
public class Trainer {
    
    Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
      
    void makeNoise(){
        animal.makeNoise();
    }
    
}
