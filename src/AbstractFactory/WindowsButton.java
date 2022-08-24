package AbstractFactory;
//Primera jerarquía de productos

public class WindowsButton implements Button {

    public void paint() {
        System.out.println("you have created WindowsButton...");
    }
}
