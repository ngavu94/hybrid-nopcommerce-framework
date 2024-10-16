package nonFactoryPatten;

public class EndUser {
    public static void main(String[] args) {
        //Sáng ngày 20/4 đi đến hãng Honda để xem và đặt xe lái thử
        //Đi đến địa chỉ hãng: huyện Cẩm Lệ
        HondaHead hondaHead = new HondaHead();
        //Xem
        hondaHead.viewCar();
        //Book
        hondaHead.bookHondaCar();
        //Lái
        hondaHead.driveHondaCar();
        //Chiều ngày 20/4 đi đến hãng Ford để xem và đặt xe lái thử
        //Đi đến địa chỉ hãng: huyện Sơn Trà
        FordHead ford = new FordHead();
        ford.viewCar();
        ford.driveFordCar();
        ford.bookFordCar();
        //Sáng ngày 21/4 đi đến hãng Huyndai để xem và đặt xe lái thử
        //Đi đến địa chỉ hãng: huyện Liên Chiểu
        HuyndaiHead huyndai = new HuyndaiHead();
        huyndai.viewCar();
        huyndai.driveHuyndaiCar();
        huyndai.bookHuyndaiCar();
    }
}
