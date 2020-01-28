public class DecoyDuck extends Duck{

    @Override
    protected void display() {
        super.display();
        System.out.println("de Goma: solo es un pato senuelo de madera");
        swim();
    }
}
