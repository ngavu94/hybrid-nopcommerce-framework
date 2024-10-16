package factoryPatten;

import commons.CarList;

public class EndUser {
    public static CarFactory carFactory;
    public static void main(String[] args) {
//Enduser muốn xem và lái xe honda
        carFactory = getCar("huyndai");
        carFactory.viewCar();
        carFactory.bookCar();
        carFactory.driveCar();

    }
    public static CarFactory getCar(String carName){
        CarFactory carFactory=null;
        CarList carList = CarList.valueOf(carName.toUpperCase());
        switch (carList){
            case HONDA:
                carFactory = new HondaHead();
                break;
            case HUYNDAI:
                carFactory = new HuyndaiHead();
                break;
            case FORD:
                carFactory = new FordHead();
                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + carName);
        }
        return carFactory;
    }
}
