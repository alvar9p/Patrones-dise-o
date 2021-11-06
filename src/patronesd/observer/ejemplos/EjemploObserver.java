package patronesd.observer.ejemplos;

import patronesd.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver((observable, obj) -> {
            System.out.println("Jhon " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Andrés: " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("María: " + observable);
        });
        google.modificaPrecio(2000);
    }
}
