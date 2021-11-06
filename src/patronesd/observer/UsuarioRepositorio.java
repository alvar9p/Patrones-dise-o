package patronesd.observer;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio extends Observable {
    // Cada vez que creamos un usuario vamos a informar
    private List<String> repositorio = new ArrayList<>();

    public void crearUsuario(String usuario) {
        repositorio.add(usuario);
        notifyObservers(usuario);
    }
}
