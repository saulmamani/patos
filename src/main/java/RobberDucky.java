public class RobberDucky extends Duck implements Quackable {
    public void quack() {
        System.out.println("\tEl pato hace quack quack");
    }

    @Override
    protected void display() {
        super.display();
        System.out.println("de Goma: solo es de goma");
        quack();
        swim();
    }
}
