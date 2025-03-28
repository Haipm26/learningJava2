/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg19;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Pham Minh Hai
 */
public class Bai19 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
//        GeometricObject a = new Circle(30, "red", "hhe");
//        GeometricObject b = new rectangle(30, 25, "red", "ee");
//        Dog x = new Dog();
//        x.howToEat();
//        Bird q = new Bird();
//        q.fly();
//        q.run();
//        


        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student("Teo", 3));
        arr.add(new Student("HE", 4));
        arr.add(new Student("Lo", 1));
        Collections.sort(arr, new SortStudentByName());
        for (Student x : arr){
            System.out.println(x.getName() + " " + x.getDiem());
        }
    }
    
}
