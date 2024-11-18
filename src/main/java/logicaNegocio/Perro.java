package logicaNegocio;

public class Perro extends Animal implements Domestico{

TipoHabitat Habitat = TipoHabitat.TERRESTRE;
    String Sonido = "Ladrido";
    String Dieta = "Omnívoro";
    public Perro(String Habitad, String Sonido, String Dieta) {
        super(Sonido, Dieta);
        this.Habitat = Habitat;
    }
    public Perro(){};
    
    
    @Override
    public String emitirSonido() 
    {
        Sonido=this.Sonido;
        return Sonido;
    }

    @Override
    public String obtenerDieta() {
        Dieta=this.Dieta;
        return Dieta;
    }
    
    // TODO: Aquí va tu código

    public TipoHabitat getHabitat() {
        return Habitat;
    }
    public void setHabitat() {
        this.Habitat = Habitat;
    }
}
