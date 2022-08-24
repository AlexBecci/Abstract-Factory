//Todas las familias de productos tienen las mismas variedades (MacOS/Windows).Se trata de una variante de una Checkbox
package AbstractFactory;

public class MacOSCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox");
    }
    
}
