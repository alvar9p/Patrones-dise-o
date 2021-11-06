package patronesd.decorator.decorador;

import patronesd.decorator.Formateable;

public class SubrayadoDecorador extends TextoDecorador {

    public SubrayadoDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        int largo = texto.darFormato().length();
        StringBuilder sb = new StringBuilder(texto.darFormato());
        sb.append("\n");
        for (int i = 0; i < largo; i++) {
            // por cada caracter un subrayado
            sb.append("_");
        }
        return sb.toString();
    }
}
