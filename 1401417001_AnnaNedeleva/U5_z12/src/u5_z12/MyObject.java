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
public class MyObject {
    static int objectCount;
    String name;
    
     MyObject(String name){
        this.name=name;
        objectCount+=1;
    }
}
