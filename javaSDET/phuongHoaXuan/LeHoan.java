package phuongHoaXuan;

public class LeHoan {
    public static void main(String[] args) {


        DinhBoLinh dinhBoLinh = new DinhBoLinh();
//        dinhBoLinh.empressor="ABC";
        dinhBoLinh.setEmpressor("ABC");
        System.out.println(dinhBoLinh.getEmpressor());
        dinhBoLinh.setCapuchino("Capuchino");
        System.out.println(dinhBoLinh.getCapuchino());
        System.out.println(dinhBoLinh.cherry);
        System.out.println(dinhBoLinh.getCherry());

        DinhBoLinh.orangeJuice ="abc";
    }
}
