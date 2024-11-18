package logicaNegocio;

public interface Domestico {
    default String interactuarConHumano()
    {
        String Mensaje="El perro mueve la cola y ladra de felicidad";
        return Mensaje;
    }
}
