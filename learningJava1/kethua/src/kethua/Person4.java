/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Person4 {
    private String id;
    private String name;
    private String ngaySinh;
    private String diaChi;

    public Person4(String id, String name, String ngaySinh, String diaChi) {
        this.id = id;
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    
     public void chuanHoa(){
        StringBuilder birth = new StringBuilder(ngaySinh);
        String ten = "";
        String []s = name.toLowerCase().split(" ");
        for (int i =0 ;i < s.length; i++){
            ten += Character.toUpperCase(s[i].charAt(0));
            ten += s[i].substring(1);
            ten += " ";
        }
        name = ten.trim();
        if (birth.charAt(1) == '/') birth.insert(0, "0");
        if (birth.charAt(4) == '/') birth.insert(3, "0");
        ngaySinh = birth.toString();
    }
     
     public String toString(){
         chuanHoa();
         return id + " " + name + " " + ngaySinh + " " + diaChi;
     }
}
