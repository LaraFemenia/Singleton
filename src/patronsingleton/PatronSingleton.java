package patronsingleton;

public class PatronSingleton {

    public static void main(String[] args) {

        Singleton conexion = Singleton.getInstancia();

        conexion.conectar();
        conexion.desconectar();

    }

}
