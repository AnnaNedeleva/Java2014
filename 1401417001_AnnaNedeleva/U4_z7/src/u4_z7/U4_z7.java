/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4_z7;
import java.util.Random;
/**
 *
 * @author User
 */
public class U4_z7 {
    
     public static int randomNumberFromInterval (int intervalStart, int intervalEnd){
       int randomNumber = intervalStart + (int)(Math.random() * ((intervalEnd - intervalStart) + 1));
       return randomNumber;
    }
    
    public static void initiateArray(int[] array){
        for (int index = 0; index < array.length; index++) {
            array[index]=randomNumberFromInterval(-100,100);
        }
    }
     
    public static double средноКвадратичноОтИнтервал(int m[]) {
        double suma = 0;
        int n=0;
        for (int i = 0; i < m.length; i++){
            if (m[i]>=-20 && m[i]<=20){
                suma += Math.pow(m[i], 2);
                n=n+1;
            }
        }
        suma=suma/ n;
        System.out.println("Средно квадратично: " + Math.sqrt(suma));
        return Math.sqrt(suma);   
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rand = new Random();
       
        int[] array1 = new int[rand.nextInt(20)+1];
        System.out.println("razmernost na 1-q masiv - " + array1.length);
        initiateArray(array1);
        for (int element:array1) {
            System.out.println(element);
        }
        средноКвадратичноОтИнтервал(array1);
        
        int[] array2 = new int[rand.nextInt(20)+1];
        System.out.println("razmernost na 2-q masiv - " + array2.length);
        initiateArray(array2);
        for (int element:array2){
            System.out.println(element);
        }
        средноКвадратичноОтИнтервал(array2);
        
        int[] array3 = new int[rand.nextInt(20)+1];
        System.out.println("razmernost na 2-q masiv - " + array3.length);
        initiateArray(array3);
        for (int element:array3){
            System.out.println(element);
        }
        средноКвадратичноОтИнтервал(array3);
        // TODO code application logic here
    }
    
}
