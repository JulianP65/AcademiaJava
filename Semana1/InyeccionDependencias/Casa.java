package InyeccionDependencias;

public class Casa {
    
    private Reparador reparador;
    String nombre;
    
    public Casa(Reparador reparador, String nombre){
        this.reparador = reparador;
        this.nombre = nombre;
    }
    
    public void reparar(){
        System.out.println("Trabajando en la casa " + nombre);
        reparador.reparar();
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
