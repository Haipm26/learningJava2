/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codelinhtinh;

/**
 *
 * @author Pham Minh Hai
 */
public class Stat {
    private int power;
    private int blood;
    private String trangThai;

    public Stat(String power, String blood, String trangThai) {
        String []s = power.split(" ");
        this.power = Integer.parseInt(s[2]);
        String []a = blood.split(" ");
        this.blood = Integer.parseInt(a[2]);
        this.trangThai = trangThai;
    }
    
    
    public void mushroom(){
        blood -= 15;
        power -= 2;
        if (blood <= 0 || power <= 0){
            trangThai = "DEAD";
            power = 0;
            blood = 0;
        }
    }
    
    public void pea(){
        blood += 10;
        power += 2;
        
    }
    
    public void witch(int n){
        if (n >= power){
            trangThai = "DEAD";
            blood = 0;
            power = 0;
        }else{
            power += 5;
        }
    }
    
    public void solider(int n){
        if (n >= power){
            trangThai = "DEAD";
            blood = 0;
            power = 0;
        }else{
            blood += 5;
            power += 7;
        }
    }

    public String getTrangThai() {
        return trangThai;
    }

    public int getPower() {
        return power;
    }

    public int getBlood() {
        return blood;
    }

    public String toString(){
        return "POWER : " + this.power + "\n" + "BLOOD : " + this.blood + "\n" + this.trangThai + "\n" + "--------------------";
    }
    
}
