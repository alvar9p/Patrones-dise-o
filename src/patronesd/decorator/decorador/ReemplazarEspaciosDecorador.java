package patronesd.decorator.decorador;

import patronesd.decorator.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecorador {

    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
