package phuongHoaXuan;

public class DinhBoLinh {
    //Có access modifier là private thì chỉ đc phép sd cho chính class chứa nó
    //variables/ Property

    //Hàm getter, Setter
    public String empressor;
    //Default
    String capuchino;
    void setCapuchino(String capuchino){
        this.capuchino = capuchino;
    }
    String getCapuchino(){
        return capuchino;
    }
    //Protected
    protected String cherry;
    protected String getCherry(){
        return cherry;
    }

    public void setEmpressor(String empressor) {
        this.empressor = empressor;
    }

    public String getEmpressor() {
        return empressor;
    }

    public static String orangeJuice ;
    public static String getOrangeJuice(){
        return orangeJuice;
    }

    public static void main(String[] args) {
        //Hàm là static không thể gọi trực tiếp đến hàm/ biến non-static khác
        DinhBoLinh dinhBoLinh = new DinhBoLinh();
        dinhBoLinh.capuchino= "Capuchino";
        System.out.println(dinhBoLinh.getCapuchino());
        dinhBoLinh.empressor= "Empressor";
        System.out.println(dinhBoLinh.getEmpressor());
        dinhBoLinh.cherry = "Cherry";
        System.out.println(dinhBoLinh.getCherry());
        //DinhBoLinh.orangeJuice;
        getOrangeJuice();
    }

    //Method/ Function
}
