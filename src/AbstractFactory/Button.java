//Primera jerarquía de productos
package AbstractFactory;
//Abstract Factory asume que usted tiene varias familias de productos,
// estructuradas en jerarquías de clases separadas (Button/Checkbox). 
// Todos los productos de la misma familia tienen la interfaz común.
//  Esta es la interfaz común para la familia de botones

public interface Button {

    void paint();
}
