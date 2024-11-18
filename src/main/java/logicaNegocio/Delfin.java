package logicaNegocio;

public class Delfin extends Animal {
TipoHabitat Habitat = TipoHabitat.ACUATICO;
    String Sonido = "Chirrido";
    String Dieta = "Pescado";
    public Delfin(String Sonido, String Dieta) {
        super(Sonido, Dieta);
    }
    public Delfin(){}
    

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
