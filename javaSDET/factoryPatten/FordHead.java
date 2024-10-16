package factoryPatten;

public class FordHead extends CarFactory{
    @Override
    public void viewCar() {
        System.out.println("View Ford car");
    }

    @Override
    public void driveCar() {
        System.out.println("Drive Ford car");
    }

    @Override
    public void bookCar() {
        System.out.println("Book Ford car");
    }
}
