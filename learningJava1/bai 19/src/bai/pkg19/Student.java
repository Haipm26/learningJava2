/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg19;

/**
 *
 * @author Pham Minh Hai
 */


public class Student implements Comparable<Student> {
    private String name;
    private int diem;

    public Student(String name, int diem) {
        this.name = name;
        this.diem = diem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    
    
    @Override
    public int compareTo(Student o) {
        if (this.diem < o.getDiem()) return -1;
        else if (this.diem > o.getDiem()) return 1;
        else return 0;
    }
    
    
}
