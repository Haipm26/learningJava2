/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class movablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public movablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public movablePoint pointAfter(int n){
        return new movablePoint(this.x + this.xSpeed * n, this.y + this.ySpeed * n, this.xSpeed, this.ySpeed);
    }
    
    public String toString(){
        return super.toString() + "\n" + "X Speed : " + String.format("%.2f", this.xSpeed) + "\n" + "Y Speed : " + String.format("%.2f", this.ySpeed) + "\n-------------------";
    }
}
