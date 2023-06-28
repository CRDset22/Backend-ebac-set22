public class AvulsoFactory implements CarFactory {

    @Override
    public Car createCar() {

        return new Fusca();
    }
}


