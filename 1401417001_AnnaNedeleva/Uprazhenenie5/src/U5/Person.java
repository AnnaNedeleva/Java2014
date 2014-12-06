package U5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Person {
    // Field name, surname, age
    public String name;
    public String surname;
    public int age;
    
    //Getter & Setter
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
        public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    
    //Default constructor
    public Person (){
        this.name="No name";
        this.surname="No surname";
        this.age=0;
    }
    
    // Constructor with parameters
    public Person (String name, String surname, int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    
    // Methord Introducion
    public void Introduce(){
        System.out.printf("Hello! My name is %s %s and I'm %d old. %n",name, surname, age);
    }
}
