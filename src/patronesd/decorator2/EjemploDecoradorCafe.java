package patronesd.decorator2;

import patronesd.decorator2.decorador.ConChocolateDecorador;
import patronesd.decorator2.decorador.ConCremaDecorador;
import patronesd.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Configurable cafe = new Cafe(7, "Café Mocha");
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChoco = new ConChocolateDecorador(conLeche);
        System.out.println("\nEl precio del café moca es: " + conChoco.getPrecioBase());
        System.out.println("Los ingredientes: " + conChoco.getIngredientes());

        Configurable capuccino = new Cafe(4, "Café Capuccino");
        conCrema = new ConCremaDecorador(capuccino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("\nEl precio del capuccino es: " + conLeche.getPrecioBase());
        System.out.println("Los ingredientes: " + conLeche.getIngredientes());

        Configurable expresso = new Cafe(3, "Café expresso");
        System.out.println("\nEl precio del café espresso: " + expresso.getPrecioBase());
        System.out.println("Los ingredientes: " + expresso.getIngredientes());
    }
}
