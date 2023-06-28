
public class Main {
    public static void main(String[] args) {

        CarFactory factory;

        // Compra avulsa (sem contrato)
        factory = new AvulsoFactory();
        Car avulsoCar = factory.createCar();
        avulsoCar.montar();


        // Compra com contrato
        factory = new ContratoFactory();
        Car contratoCar = factory.createCar();
        contratoCar.montar();
    }
}


