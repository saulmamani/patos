public class DomesticDuck extends Duck {
    @Override
    protected void display() {
        super.display();
        System.out.println("Domestic:\n" +
                "\tNombre científico: Anas platyrhynchos domesticus\n" +
                "\tNúmero de huevos: Cairina moschata: 8 – 16\n" +
                "\tAltura: Pato corredor indio: 50 – 76 cm\n" +
                "\tLongitud: Cairina moschata: 76 cm");
        swim();
    }
}
