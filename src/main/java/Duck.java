import fly.FlyBehavior;
import quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    protected void fly(){
        flyBehavior.fly();
    };

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    protected void quack(){
        quackBehavior.quack();
    };

    protected void swim(){
        System.out.println("\tEl pato nada");
    };

    protected void display(){
        System.out.print("\nCaracteristicas del pato ");
    };
}
