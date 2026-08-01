public class DoubleFlywheelShooter extends baseshoter {
    public  DoubleFlywheelShooter (){
        super();
    }
    @Override
    public void setVelocityAndAngle(double velocity,double angle){
        this.velocity = velocity;
        this.angle = angle;
        System.out.println("DoubleFlywheelShooter" + velocity + angle);
    }

    
}
