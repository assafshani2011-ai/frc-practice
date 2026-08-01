public class Main1 {

    public static void main(String[] args) {
        GameController controller1 = new GameController();

        ServoMotor motor1 = new ServoMotor("servomotor1");
        ServoMotor motor2 = new ServoMotor("servomotor2");
        for(int i = 0;i<41;i++){
            if (controller1.is_pressed(0) == true ){
                motor1.moveToAngle(0);
                motor2.moveToAngle(180);
                System.out.println("button num 0 is pressed");
            } 
            if (controller1.is_pressed(1) == true ){
                motor2.moveToAngle(45);
            System.out.println("button num 1 is pressed");
        }
        if (controller1.is_pressed(2) == true ){
                motor1.moveToAngle(135);
               System.out.println("button num 2 is pressed"); 
    }
    if (controller1.is_pressed(3) == true ){
                motor1.moveToAngle(90);
                motor2.moveToAngle(90);
                System.out.println("button num 3 is pressed");
    }
    motor1.periodicUpdate();
    motor2.periodicUpdate();
    System.out.println( "cycle:" + i + "|motor1 angle:" + motor1.getAngle() + "|motor2 angle:" + motor2.getAngle());

        }
    }
}