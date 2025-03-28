/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2;

/**
 *
 * @author Pham Minh Hai
 */
public class MyTime {
    private int hour = 0;
    private int min = 0;
    private int sec = 0;

    public MyTime(String time) {
        String []s = time.split(":");
        this.hour = Integer.parseInt(s[0]);
        this.min = Integer.parseInt(s[1]);
        this.sec = Integer.parseInt(s[2]);
    }
    
    public MyTime(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public MyTime nextSec(){
        int tmp = this.sec;
        if (tmp + 1 > 59){
            tmp = 0;
        }else{
            tmp++;
        }
        
        return new MyTime(this.hour, this.min, tmp);
    }
    
    public MyTime nextMin(){
        int tmp = this.min;
        if (tmp + 1 > 59){
            tmp = 0;
        }else{
            tmp++;
        }
        return new MyTime(this.hour, tmp, this.sec);
    }
    
    public MyTime nextHour(){
        int tmp = this.hour;
        if (tmp + 1 == 24){
            tmp = 0;
        }else{
            ++tmp;
        }
        return new MyTime(tmp, this.min, this.sec);
    }
    
    public MyTime prevSec(){
        int tmpSec = sec;
        int tmpMin = min;
        int tmpHour = hour;
        if (tmpSec - 1 < 0){
            tmpSec = 59;
            if (tmpMin - 1 < 0){
                tmpMin = 59;
                if (tmpHour - 1 < 0){
                    tmpHour = 23;
                }else
                tmpHour--;
            }else
            tmpMin--;
        }else tmpSec--;
        return new MyTime(tmpHour, tmpMin, tmpSec);
    }
    
    public MyTime prevMin(){
        int tmpMin = this.min;
        int tmpHour = this.hour;
        if (min - 1 < 0){
            tmpMin = 59;
            if (tmpHour - 1 < 0){
                tmpHour = 23;
            }else
            tmpHour--;
        }else
        tmpMin--;
        return new MyTime(tmpHour, tmpMin, this.sec);
    }
    
    public MyTime prevHour(){
        int tmpHour = this.hour;
        if (tmpHour - 1 < 0){
            tmpHour = 0;
        }else{
            tmpHour--;
        }
        return new MyTime(tmpHour, this.min, this.sec);
    }
    
    public String toString(){
        return String.format("%02d", hour) + ":" + String.format("%02d", min) + ":" + String.format("%02d", this.sec); 
    }
}
