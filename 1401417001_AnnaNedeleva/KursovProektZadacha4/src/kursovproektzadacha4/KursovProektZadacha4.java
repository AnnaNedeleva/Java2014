/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Задача 4. Елементите на масив са имена на населени места, започващи с главна буква. Да се съставят ППГ за:
//а) въвеждане на елементите на масива (не повече от 50).
//з) намиране на максимална дължина на име на населено място и 
//извеждане на екрана на всички населени места, чиито имена са с тази максимална дължина;
package kursovproektzadacha4;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class KursovProektZadacha4 {
    public static Scanner input = new Scanner(System.in, "windows-1251");
    
    public static void InitiateArray (String [] list){
        for (int index = 0; index < list.length; index++) {
            System.out.printf("Въведете име на населена място с номер %d : %n", (index+1));
            list[index]=input.next();
            System.out.printf("a[%d]=%s %n",(index+1), list[index]);    
        }
    }
    
    public static void MaxLength( String [] list){
        int max=0;
        for (String element : list) {
            if (element.length() > max) {
                max = element.length();
            }
        }
        System.out.println("Населени места, чиито имена са с максимална дължина:");
        for (String element: list){
            if (element.length()==max)
                System.out.println(element);
            }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Моля, въведетe броя на населени места(не повече от 50):");
        int listLength=input.nextInt();
        
         while (listLength<=0 | listLength>50) {
            System.out.println("Въведохте недоспустима брой.");
            System.out.println("Моля, въведете броя на населени места отново(не повече от 50): ");
            listLength=input.nextInt();
        }
       
        String [] locations = new String [listLength];
        InitiateArray(locations);
        MaxLength(locations);       
    }    
}
