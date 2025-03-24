package InyeccionDependencias;

public class Pintor implements Reparador{
    
    @Override
    public void reparar() {
        System.out.println("Pintor pintando la pared");
    }
}
