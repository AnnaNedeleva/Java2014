/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u7_z1;

/**
 *
 * @author User
 */
public class U7_z1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automatic newCar = new Automatic("eight-speed", "car","BMW");
        Driver smMan = new Driver( newCar,"John");
        smMan.inAction();
        
        Mechanical oldCar = new Mechanical ("six-speed", "bus", "Mercedes");
        smMan.setVehicle(oldCar);
        smMan.inAction();
               
    }
    
}
