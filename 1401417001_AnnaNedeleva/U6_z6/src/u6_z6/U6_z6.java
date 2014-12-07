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
public class U6_z6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Animal smAnimal = new Animal();
//        smAnimal.makeNoise();
        
        Cat smCat = new Cat();
        smCat.setName("Rizho");
        smCat.makeNoise();
        
        Dog smDog = new Dog("Sharo");
        smDog.makeNoise();
        
        Animal thisDog = new Dog("Bobby");
        Trainer man = new Trainer();
        man.setAnimal(thisDog);
        man.makeNoise();
        
        man.setAnimal(smCat);
        man.makeNoise();
       
        
    }
    
}
