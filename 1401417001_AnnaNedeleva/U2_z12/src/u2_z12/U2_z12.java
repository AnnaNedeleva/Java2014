/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2_z12;

/**
 *
 * @author User
 */
public class U2_z12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m[] = {1, 5, - 4, 20, -9, 33, 1, 4, 7, 8};

        for(int i=0; i<m.length; i++){
            if(m[i]<30)
                System.out.println("m[" + i + "] = " + m[i]);
            else
            break;
        }
        // TODO code application logic here
    }
    
}
