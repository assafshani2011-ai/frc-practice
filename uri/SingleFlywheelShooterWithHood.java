public class SingleFlywheelShooterWithHood extends baseshoter{
    public SingleFlywheelShooterWithHood (){
        super();
    }
@Override
    public void setVelocityAndAngle(double velocity,double angle){
        this.velocity = velocity;
        this.angle = angle;
        System.out.println("SingleFlywheelShooterWithHood" + velocity + angle);
    }
}
