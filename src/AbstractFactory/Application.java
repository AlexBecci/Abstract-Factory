package AbstractFactory;
import AbstractFactory.Button;
import AbstractFactory.Checkbox;
import AbstractFactory.GUIFactory;
//A los usuarios de las fábricas no les importa qué fábrica concreta utilizan, ya que trabajan con las fábricas y los productos a través de interfaces abstractas.

public class Application {

    private Button button;
    private Checkbox checkbox;
    
    public Application(GUIFactory factory)
    {
       button = factory.createdButton();
       checkbox = factory.createdCheckbox();
    }
    public void paint()
    {
        button.paint();
        checkbox.paint();
    }
}
