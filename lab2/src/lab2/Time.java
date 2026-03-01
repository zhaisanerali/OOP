package lab2;

import prepareingToMidterm.Time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Invalid input!");
        }
    }


    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }


    public String toStandard() {
        int h = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String period = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", h, minute, second, period);
    }


    public void add(Time t2) {
        int totalSeconds = this.second + t2.second;
        this.second = totalSeconds % 60;
        
        int totalMinutes = this.minute + t2.minute + (totalSeconds / 60);
        this.minute = totalMinutes % 60;
        
        this.hour = (this.hour + t2.hour + (totalMinutes / 60)) % 24;
    }

  
    public static void main(String[] args) {
  
        Time t = new Time(23, 5, 6);
        
        System.out.println(t.toUniversal()); 
        System.out.println(t.toStandard());  
        
        Time t2 = new Time(4, 24, 33); 
        t.add(t2); 
        
        System.out.println("After add: " + t.toUniversal());
        
        
        
        System.out.println("new new new");
        Time t1 = new Time(23, 45, 59);
		System.out.println(t1.toUniversal());
		System.out.println(t1.toStandard());
		Time t3 = new Time(23, 48, 1);
		t1.add(t3);
		System.out.println(t1.toUniversal());
		System.out.println(t1.toStandard());
    }
}
