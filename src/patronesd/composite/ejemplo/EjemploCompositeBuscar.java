package patronesd.composite.ejemplo;

import patronesd.composite.Archivo;
import patronesd.composite.Directorio;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");

        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));

        Directorio stream = new Directorio("Api Stream");

        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java);

        doc.addComponente(new Archivo("cv.docx"));

        doc.addComponente(new Archivo("logo.jpg"));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("Encontrado? " + encontrado);

        encontrado = doc.buscar("Api Stream");
        System.out.println("encontrado = " + encontrado);
        //System.out.println(doc.mostrar(0));

        encontrado = doc.buscar("cv.dox");
        System.out.println("encontrado = " + encontrado);


    }
}
