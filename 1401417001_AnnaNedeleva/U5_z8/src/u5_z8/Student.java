/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u5_z8;

/**
 *
 * @author User
 */
public class Student {
  public String name;
  public double uspeh;
  
  
//Getter & Setter
public String getName() {
    return this.name;
}
public double getUspeh(){
    return this.uspeh;
}

public void setName(String n){
    this.name=n;
}
public void setUspeh(double u){
    this.uspeh=u;
}

public Student(){
    this.name="no name";
    this.uspeh=0;
}

public Student(String n, double u){
    this.name=n;
    this.uspeh=u;
}

public void UspehOfStudent(){
    System.out.printf("Uspeh of %s is %f. %n" , name, uspeh);
}

}
