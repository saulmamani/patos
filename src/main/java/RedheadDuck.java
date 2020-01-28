public class RedheadDuck extends Duck implements Flyable, Quackable{
    public void fly() {
        System.out.println("\tEl pato esta volando");
    }

    public void quack() {
        System.out.println("\tEl pato hace quack quack");
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
