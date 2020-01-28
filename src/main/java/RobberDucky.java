import fly.FlyNoWay;
import quack.Squeak;

public class RobberDucky extends Duck{
    public RobberDucky() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    protected void display() {
        super.display();
        System.out.println("de Goma: solo es de goma");
        quack();
        swim();
        fly();
    }
}
