package javaInheritance;

public class OrderPO extends SidebarPO{
    public void clickToOrderLink(){
        //sidebar
        clickToSideBar();
        //basepage
        clickToElement();
    }
}
