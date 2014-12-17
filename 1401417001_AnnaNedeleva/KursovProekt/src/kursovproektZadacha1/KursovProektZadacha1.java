/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursovproektZadacha1;
import java.util.Scanner;
//Задача 1. Да се генерира по случаен начин едномерен масив от цели числа 
//принадлежащи на интервала [–100,100]. Да се намери:
//в) броят на елементите с четен индекс, които са в интервала [–30,30];
/**
 *
 * @author User
 */
public class KursovProektZadacha1 {

    /**
     * @param args the command line arguments
     */
    
    public static int randomNumberFromInterval (int intervalStart, int intervalEnd){
        int randomNumber = intervalStart + (int)(Math.random() * ((intervalEnd - intervalStart) + 1));
        return randomNumber;
    }
    
 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Моля, въведетe размерност на масива:");
        int [] array = new int [input.nextInt()];
        
        for (int index = 0; index < array.length; index++) {
            array[index]=randomNumberFromInterval(-100,100);
            System.out.printf("a[%d]=%d %n",index, array[index]);
        }
       
        int br=0;
        for (int index = 0; index < array.length; index+=2){
            if (array[index]>=-30 && array[index]<=30) {
                br+=1;
            }
        }
        
        System.out.printf("Броят на елементите с четен индекс, "
                + "които са в интервала [–30,30] e %d.%n", br);
    }
}
