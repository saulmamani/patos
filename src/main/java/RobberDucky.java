public class RobberDucky extends Duck {
    @Override
    protected void quack() {
        System.out.println("\tNo grazna, es de goma");
    }

    @Override
    protected void display() {
        super.display();
        System.out.println("de Goma: solo es de goma");
        behaivor();
    }
}
