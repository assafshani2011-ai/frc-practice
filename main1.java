import Wheel;
public class main1 {
    public static void main(String[] args) {
        Wheel[] wheels = {new Wheel("BackLeft", 0.0254*4), new Wheel("Backright",0.0254*4),new Wheel("Frontleft", 0.0254*4),new Wheel("Frontright",0.0254*4)};
        for (Wheel v : wheels){
            v.setVelocity(Math.random()*10);
            System.out.println(v.getLinearVelocity);
        }
    }
}
