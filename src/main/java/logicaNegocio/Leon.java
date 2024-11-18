package logicaNegocio; 
public class Leon extends Animal {
    TipoHabitat Habitat = TipoHabitat.TERRESTRE;
    String Sonido = "Rugido";
    String Dieta = "Carnívoro";
    
    public Leon(String Habitad, String Sonido, String Dieta) {
        super(Sonido, Dieta);
        this.Habitat = Habitat;
    }
    public Leon(){}

    
    
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
