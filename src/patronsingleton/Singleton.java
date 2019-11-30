package patronsingleton;

public class Singleton {

    private static Singleton INSTANCIA = null;

    private Singleton() {
    }

    public static Singleton getInstancia() {

        if (INSTANCIA == null) {
            synchronized (Singleton.class) {
                if (INSTANCIA == null) {
                    INSTANCIA = new Singleton();
                }
            }
        }

        return INSTANCIA;
    }

    public void conectar() {
        System.out.println("Conexión exitosa");
    }

    public void desconectar() {
        System.out.println("Se ha desconectado correctamente");
    }

}
