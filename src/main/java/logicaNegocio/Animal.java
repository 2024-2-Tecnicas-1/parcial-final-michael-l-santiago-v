package logicaNegocio;

public abstract class Animal {
    String Sonido;
    String Dieta;
    TipoHabitat Habitat;

    public Animal(String Sonido, String Dieta) {
        this.Sonido = Sonido;
        this.Dieta = Dieta;
    }
    public Animal(){}
    
    public abstract String emitirSonido();
    {
        
    }
    public abstract String obtenerDieta();
    {
        
    }

    public TipoHabitat getHabitat() {
        return Habitat;
    }

    public void setHabitat() {
        this.Habitat = Habitat;
    }
    
    
}
