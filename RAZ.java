public class RAZ {
    public static double calculateMotorPower(double volltage,double current){
        return volltage *current;
    }
    public static double limitSpeed(double wantedSpeed,double maxSpeed){
        if (wantedSpeed >maxSpeed){
            return maxSpeed; 
        }
        else if (wantedSpeed< -maxSpeed){
            return -maxSpeed;
        }
        else{
            return wantedSpeed;
        }
    }





    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}