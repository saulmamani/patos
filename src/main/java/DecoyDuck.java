import fly.FlyNoWay;
import quack.MuteQuack;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    protected void display() {
        super.display();
        System.out.println("de Goma: solo es un pato senuelo de madera");
        quack();
        swim();
        fly();
    }
}
