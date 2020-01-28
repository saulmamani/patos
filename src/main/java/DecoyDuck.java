public class DecoyDuck extends Duck{
    @Override
    protected void quack() {
        System.out.println("\tNo grazna, es de de madera");
    }

    @Override
    protected void fly() {
        System.out.println("\tNo vuela, es de madera");
    }

    @Override
    protected void display() {
        super.display();
        System.out.println("de Goma: solo es un pato senuelo de madera");
        behaivor();
    }
}
