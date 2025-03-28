/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class MovableCircle implements Movable {
    
    private int radius;
    private MovablePoint1 center;

    public MovableCircle(int radius, MovablePoint1 center) {
        this.radius = radius;
        this.center = center;
    }
    
    
    
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
    
    public String toString(){
        return center.getX() + " " + center.getY();
    }
}
