public class baseshoter {
    protected double velocity;
    protected double angle;
    public baseshoter(){
        velocity = 0;
        angle = 0;
    }
    public boolean isready(){
        return false;
    }
    public void stop(){
        velocity = 0;
    }
    public void shoot (){}
    public void setVelocityAndAngle(double velocity,double angle){
        this.velocity = velocity;
        this.angle = angle;
        System.out.println("base robot" + velocity + angle);
    }
}



        


