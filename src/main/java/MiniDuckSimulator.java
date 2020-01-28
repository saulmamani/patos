import fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args)
    {
        Duck mallar = new MallardDuck();
        mallar.display();

        Duck redHead = new RedheadDuck();
        redHead.display();

        Duck domestic = new DomesticDuck();
        domestic.display();

        Duck robber = new RobberDucky();
        robber.display();

        Duck decoy = new DecoyDuck();
        decoy.display();


        System.out.println("\nModel Duck: ");
        Duck model = new ModelDuck();
        model.fly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.fly();
    }
}
