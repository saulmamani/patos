public class MallardDuck extends Duck implements Flyable, Quackable{
    public void fly() {
        System.out.println("\tEl pato esta volando");
    }

    public void quack() {
        System.out.println("\tEl pato hace quack quack");
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
