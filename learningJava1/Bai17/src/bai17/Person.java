/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai17;

/**
 *
 * @author Pham Minh Hai
 */
public class Person {
//    private String name, birth;
    protected String name, birth;

    public Person(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }
    
    
    
    public String toString(){
        return name + " " + birth;
    }
}
