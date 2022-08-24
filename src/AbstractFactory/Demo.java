//Clase de demostración. Todo se une aquí.
package AbstractFactory;

import AbstractFactory.GUIFactory;
import AbstractFactory.MacOSFactory;
import AbstractFactory.WindowsFactory;

public class Demo {
///La aplicación elige el tipo de fábrica y lo crea en tiempo de ejecución (normalmente en etapa de inicialización), dependiendo de la configuración o de las de las variables de entorno.

    public static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
