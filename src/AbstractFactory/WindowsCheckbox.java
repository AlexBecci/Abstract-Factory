//Todas las familias de productos tienen las mismas variedades (MacOS/Windows).Se trata de una variante de una Checkbox
package AbstractFactory;

public class WindowsCheckbox implements Checkbox {

    public void paint() {
        System.out.println("You have created WindowsCheckbox");
    }

}
