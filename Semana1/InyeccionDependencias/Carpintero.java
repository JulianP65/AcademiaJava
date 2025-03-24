package InyeccionDependencias;

public class Carpintero implements Reparador{
    
    @Override
    public void reparar() {
        System.out.println("Carpintero reparando");
    }
    
}
