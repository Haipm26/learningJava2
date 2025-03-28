/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Student extends Person {
    private int id;
    private double gpa;
    private String lop;

    public Student(String name, String birth, String diaChi, int id, String lop, double gpa) {
        super(name, birth, diaChi);
        this.id = id;
        this.lop = lop;
        this.gpa = gpa;
        
    }

    public String getsortedName() {
        chuanHoa();
        String sortedName = "";
        String []s = name.split(" ");
        sortedName += s[s.length - 1];
        sortedName += s[0];
        for (int i = 1; i < s.length - 1; i++){
            sortedName += s[i];
        }
        return sortedName;
    }
   
    
    public void chuanHoa(){
        StringBuilder ngaySinh = new StringBuilder(this.birth);
        String ten = "";
        String []s = name.toLowerCase().split(" ");
        for (int i = 0; i < s.length; i++){
            ten += Character.toUpperCase(s[i].charAt(0));
            ten += s[i].substring(1);
            ten += " ";
        }
        this.name = ten.trim();
        if (ngaySinh.charAt(1) == '/') ngaySinh.insert(0, "0");
        if (ngaySinh.charAt(4) == '/') ngaySinh.insert(3, "0");
        this.birth = ngaySinh.toString();
    }
    
    public String toString(){
        chuanHoa();
        return String.format("%04d", id) + " " + name + " " + birth + " " + diaChi + " " + lop + " " + String.format("%.2f", gpa);
    }
}
