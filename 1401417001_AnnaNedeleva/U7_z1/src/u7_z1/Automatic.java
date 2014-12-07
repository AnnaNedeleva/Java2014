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
public class Automatic extends Vehicle implements Drivable{
    
    String transmissionBrand;

    public String getTransmissionBrand() {
        return transmissionBrand;
    }

    public void setTransmissionBrand(String transmissionBrand) {
        this.transmissionBrand = transmissionBrand;
    }

    public Automatic(String transmissionBrand, String type, String brand) {
        super(type, brand);
        this.transmissionBrand = transmissionBrand;
    }

      
    
    @Override
    public void driving(){
      System.out.println("Left, Right, Straight, Start,  Stop")  ;
    };
    
}
