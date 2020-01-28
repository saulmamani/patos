package quack;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("\tPato que no hace ningun sonido, <<SILENCIO>>!");
    }
}
