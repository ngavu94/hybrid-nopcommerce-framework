package javaBasic;

import org.openqa.selenium.WebDriver;

public class Variables {
     Integer kieuSo;
     String kieuChu;
     Boolean kieuTrueFalse;
     WebDriver driver;

//    public void setKieuSo(Integer kieuSo){
//        this.kieuSo = kieuSo;
//    }

    public static void main(String[] args) {
        Variables variables = new Variables();
        //variables.setKieuSo(1);
        System.out.println(variables.kieuSo);
        System.out.println(variables.kieuChu);
        System.out.println(variables.kieuTrueFalse);
        System.out.println(variables.driver);
    }
}
