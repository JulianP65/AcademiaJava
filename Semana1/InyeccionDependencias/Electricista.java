package InyeccionDependencias;

public class Electricista implements Reparador{
    
    @Override
    public void reparar() {
        System.out.println("Electricista reparando");
    }
    
}
