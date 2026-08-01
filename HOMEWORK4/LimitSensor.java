public class LimitSensor extends BaseSensor {
    public  LimitSensor(){
        super();
    }
    public boolean atLimit(){
        return getReading() > 0.9;
    }
    

}
