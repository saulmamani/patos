package quack;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Pato que no hace ningun sonido, no puede graznar o chirrar!");
    }
}
