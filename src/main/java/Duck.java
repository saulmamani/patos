public abstract class Duck {
    protected void quack(){
        System.out.println("\tEl pato hace quack quack");
    };

    protected void swim(){
        System.out.println("\tEl pato nada");
    };

    protected void fly()
    {
        System.out.println("\tEl pato esta volando");
    }

    protected void display(){
        System.out.print("\nCaracteristicas del pato ");
    };

    protected void behaivor()
    {
        quack();
        swim();
        fly();
    }
}
