/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Задача 4. Елементите на масив са имена на населени места, започващи с главна буква. Да се съставят ППГ за:
//а) въвеждане на елементите на масива (не повече от 50).
//з) намиране на максимална дължина на име на населено място и 
//извеждане на екрана на всички населени места, чиито имена са с тази максимална дължина;
package kpzadacha4.variant2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class KPzadacha4Variant2 {
    public static Scanner input = new Scanner(System.in, "windows-1251");
    /**
     * @param args the command line arguments
     */
    public static void initiateList(ArrayList <String> list){
        System.out.print("Моля, въведетe имена на населени места(не повече от 50).");
        System.out.println("След като приключите, въведет дума \"Край\".");
        int count=0; // за преброяване на елементи на масива
        System.out.printf("Въведете име на населена място с номер %d : %n", (count+1));
        String element=input.nextLine();
        
        while (element.equalsIgnoreCase("Край")!=true){
            if (count>50){
                System.out.println("Не можете да въведете повече от 50 имена.");
                break;
            }
            list.add(element);
            count+=1;
            System.out.printf("Въведете име на населена място с номер %d : %n", (count+1));
            element=input.nextLine();
        }
    }
    
    public static void maxLength( ArrayList <String> list){
    int max=0;
    for (String element : list) {
        if (element.length() > max) {
            max = element.length();
        }
    }
    System.out.println("Населени места, чиито имена са с максимална дължина:");
    for ( int i=0; i<list.size();i++){
        if (list.get(i).length()==max)
            System.out.println(list.get(i));
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String> locations = new ArrayList<>();
        initiateList(locations);
        maxLength(locations); 
    }
    
}
