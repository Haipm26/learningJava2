/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai17;

/**
 *
 * @author Pham Minh Hai
 */
public class Student extends Person{
    private String lop, id;

    public Student(String lop, String id, String name, String birth) {
        super(name, birth);
        this.lop = lop;
        this.id = id;
    }
    
    public void in(){
        super.toString();
        super.getBirth();
    }
    
    
//    public String toString(){
////        return lop + " " + id + " " + super.toString();
//        return lop + " " + id + " " + this.name + " " + this.birth;
//    }

    public String getLop() {
        return lop;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }
}
