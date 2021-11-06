package patronesd.observer.ejemplos;

import patronesd.observer.UsuarioRepositorio;

public class EjemploObserver2 {
    public static void main(String[] args) {
        UsuarioRepositorio repositorio = new UsuarioRepositorio();
        repositorio.addObserver((o, u) -> System.out.println("Enviando un email al usuario " + u));
        repositorio.addObserver((o, u) -> System.out.println("Enviando un email al admin"));
        repositorio.addObserver((o, u) -> System.out.println("Guardando la info del usuario " +
                u + " en el logs"));

        repositorio.crearUsuario("Andrés");
    }
}
