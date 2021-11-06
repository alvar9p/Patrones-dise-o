package patronesd.decorator;

import patronesd.decorator.decorador.MayusculaDecorador;
import patronesd.decorator.decorador.ReemplazarEspaciosDecorador;
import patronesd.decorator.decorador.ReversaDecorador;
import patronesd.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Andrés!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);

        ReversaDecorador reversa = new ReversaDecorador(mayuscula);

        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);

        ReemplazarEspaciosDecorador reemplazar = new ReemplazarEspaciosDecorador(subrayar);

        System.out.println(reemplazar.darFormato());
    }
}
