
public class ServoMotor {
    private double currentAngle;
    private double targetAngle;
    private String motorName ;
    private int velocity;

    public ServoMotor(String name){
        motorName = name;
        currentAngle = 90;
        targetAngle = 90;
        velocity = 0;
    }
    public double getAngle(){
        return currentAngle;
    }
    public void moveToAngle(double angle){
        if (angle>180){
            targetAngle = 180;
        }
        else if (angle<0){
            targetAngle = 0;
        }
        else {
            targetAngle = angle;
        }
        if (targetAngle == currentAngle){
            velocity = 0;
        }
        else{
            velocity = (targetAngle> currentAngle) ? 90 : -90;
        }
    }

    public boolean isAtTarget(){
        return targetAngle == currentAngle;
    }
    public void periodicUpdate(){
      currentAngle=currentAngle + velocity*0.1;
        if (targetAngle>currentAngle){
            
            velocity = 90;
        }
         else if (targetAngle<currentAngle) {

        velocity = -90;
    }
        else{ 
        velocity = 0;    
    }
    }
}
    
