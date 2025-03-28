/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Person3 {
    private String id;
    private String name;
    private String birth;
    private String diaChi;

    public Person3(String id, String name, String birth, String diaChi) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.diaChi = diaChi;
    }
    
     public void chuanHoa(){
        StringBuilder ngaySinh = new StringBuilder(birth);
        String ten = "";
        String []s = name.toLowerCase().split(" ");
        for (int i =0 ;i < s.length; i++){
            ten += Character.toUpperCase(s[i].charAt(0));
            ten += s[i].substring(1);
            ten += " ";
        }
        name = ten.trim();
        if (ngaySinh.charAt(1) == '/') ngaySinh.insert(0, "0");
        if (ngaySinh.charAt(4) == '/') ngaySinh.insert(3, "0");
        birth = ngaySinh.toString();
    }

    public String getId() {
        return id;
    }
     
     public String toString(){
         chuanHoa();
         return id + " " + name + " " + birth + " " + diaChi; 
     }
     
}
