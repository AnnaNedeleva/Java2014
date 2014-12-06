/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u5_z12;

/**
 *
 * @author User
 */
public class U5_z12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyObject A = new MyObject("1st");
        MyObject B = new MyObject("2nd");
        MyObject C = new MyObject ("3rd");
        System.out.printf("Object count is %d.",MyObject.objectCount);
    }
    
}
