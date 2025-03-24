package InyeccionDependencias;

public class Plomero implements Reparador{
    
    @Override
    public void reparar() {
        System.out.println("Plomero reparando");
    }
    
}
