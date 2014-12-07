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
public class Driver {
    Vehicle vehicle;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Driver(Vehicle vehicle, String name) {
        this.vehicle = vehicle;
        this.name = name;
    }

     
    void inAction(){
        System.out.printf("Driver %s is driving %s %s in the folow way :", name, vehicle.type, vehicle.brand);
        vehicle.driving();
    }
    
}
