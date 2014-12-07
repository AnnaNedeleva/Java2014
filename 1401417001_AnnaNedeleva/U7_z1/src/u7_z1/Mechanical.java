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
public class Mechanical extends Vehicle implements Drivable{
    
    String transmissionType;

    public Mechanical(String transmissionType, String type, String brand) {
        super(type, brand);
        this.transmissionType = transmissionType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
    
    /**
     *
     */
    @Override
        public void driving(){
        System.out.println(" Start,  Stop, Shift Geer, Straight, Right, Left");
    };

}
