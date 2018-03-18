
public class Car {

    private int speed;
    private String make;
    
    public Car() {
        speed = 0;
        make = "unknown";
    }
    public Car(int sp, String mak) {
    speed = sp;
    make = mak;
    }
    public void setSpeed(int sp) {
        speed = sp;
}
    
    public int getSpeed(int sp, String mak) {
        return speed;
    }
    
    public void setMake(String mak) {
        make = mak;
    }
    
    public String getMake() {
        return make;
    }
}


/* array line
    for (int index =0; index < anArray.length, index ++) {
        System.out.println(anArray[index]);
     }   
    */    
    
