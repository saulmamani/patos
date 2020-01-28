import fly.FlyWithWings;
import quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    protected void display() {
        super.display();
        System.out.println("Mallard:\n" +
                "\tNombre científico: Anas platyrhynchos\n" +
                "\tPromedio de vida: 5 – 10 años (En libertad)\n" +
                "\tClase: Aves");
        quack();
        swim();
        fly();
    }
}
