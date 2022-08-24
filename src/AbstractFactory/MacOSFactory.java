//Cada fábrica concreta extiende la fábrica básica y es responsable de crear productos de una sola variedad.
package AbstractFactory;

import AbstractFactory.MacOSButton;
import AbstractFactory.MacOSCheckbox;
//Cada fábrica concreta extiende la fábrica básica y es responsable de crear productos de una sola variedad.

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createdButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createdCheckbox() {
        return new MacOSCheckbox();
    }

}
