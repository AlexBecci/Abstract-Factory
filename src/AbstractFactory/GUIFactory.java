//La fábrica abstracta conoce todos los tipos de productos (abstract).
package AbstractFactory;

import AbstractFactory.Button;
import AbstractFactory.Checkbox;

public interface GUIFactory {

    Button createdButton();

    Checkbox createdCheckbox();
}
