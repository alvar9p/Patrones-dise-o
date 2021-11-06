package patronesd.factory.ejemplo;

import patronesd.factory.PizzaProducto;
import patronesd.factory.PizzeriaCaliforniaFactory;
import patronesd.factory.PizzeriaNewYorkFactory;
import patronesd.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {

        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Andrés ordena una " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Alvaro quiere " + pizza.getNombre());

        pizza = california.ordenarPizza("pepperoni");
        System.out.println("Pepe ordenó " + pizza.getNombre());

        System.out.println("pizza = " + pizza);


    }
}
