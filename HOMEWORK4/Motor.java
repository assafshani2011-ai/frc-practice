public class Motor {
    private double power;
    public Motor(){
        power = 0;
    }
    public void stop(){
        power = 0;
    }
    public void setPower(double power){
        if (power >1){
            this.power = 1;
        }   
        else if(power<-1){
            this.power = -1;
        }
        else{
            this.power = power;
        }
    }
            
    

}
