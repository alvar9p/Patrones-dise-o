package patronesd.factory;

import patronesd.factory.producto.PizzaNewYorkItaliana;
import patronesd.factory.producto.PizzaNewYorkPepperoni;
import patronesd.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo) {
            case "vegetariana":
                producto = new PizzaNewYorkVegetariana();
                break;
            case "pepperoni":
                producto = new PizzaNewYorkPepperoni();
                break;
            case "italiana:":
                producto = new PizzaNewYorkItaliana();
                break;
        }
        return producto;
    }
}
