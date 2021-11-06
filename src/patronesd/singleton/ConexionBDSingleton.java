package patronesd.singleton;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;

    // primera regla: constructor privado
    private ConexionBDSingleton() {
        System.out.println("Conectándose algún motor de base de datos......");
    }

    // método estático que nos devuelva la instancia (referencia)
    public static ConexionBDSingleton getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }
}
