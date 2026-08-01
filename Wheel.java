public class Wheel {

    private double diameter;
    private double velocity;
    private double position;
    private String name;

    public Wheel(String name,double diameter){
        this.name = name; 
        this.diameter = diameter;
        velocity = 0;
        position = 0;
    }

    public void setVelocity(double rps){
        velocity = rps; 
    }
    public double getLinearVelocity(){
        return velocity*diameter*Math.PI;
    }
    public void addRotation(double rotaition){
        position += rotaition;
    }
    public double getDistance(){
        return position*diameter*Math.PI;
    }
    public void reset(){
        velocity = 0;
        position = 0;
    }
    public double getVelocityInRps(){
        return velocity;
    }
    public String name(){
        return name;
    }

       
}
