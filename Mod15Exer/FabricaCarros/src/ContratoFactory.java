public class ContratoFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Bugatti();
    }
}
