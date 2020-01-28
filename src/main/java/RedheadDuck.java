import fly.FlyWithWings;
import quack.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    protected void display() {
        super.display();
        System.out.println("ReadHead:\n" +
                "\tNombre científico: Aythya americana\n" +
                "\tFamilia: Anatidae");
        quack();
        swim();
        fly();
    }
}
