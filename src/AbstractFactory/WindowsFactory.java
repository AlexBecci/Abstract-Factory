package AbstractFactory;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createdButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createdCheckbox() {
        return new WindowsCheckbox();
    }

}
