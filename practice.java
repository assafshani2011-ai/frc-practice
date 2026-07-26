public class practice {
    public class Intake {
    private Motor rolleMotor;
    private Motor openmotor;
    private BallSensor front;
    private BallSensor back;
    private LimitSensor open;
    private LimitSensor closed;
    public intake(){
        rolleMotor = new Motor();
        openmotor = new Motor();
        front = new BallSensor();
        back = new BallSensor();
        open = new LimitSensor();
        closed = new LimitSensor();
    }
    public void startIntake(){
        while (!open.atLimit()) {
            openmotor.setPower(0.5);
        }
        openmotor.stop();
        while (!front.haveBall()) {
            rolleMotor.setPower(1);
        }
        while (!back.atLimit()) {
            rolleMotor.setPower(0.1);
        }
        rolleMotor.stop();
        while (!closed.atLimit()){
            openmotor.setPower(-0.5);
        }
        openmotor.stop();
       

    }



}

}
