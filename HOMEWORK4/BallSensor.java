public class BallSensor extends BaseSensor{
    public BallSensor (){
        super();
    }
    public boolean haveBall(){
        return getReading() > 0.9;
    }
    

}
