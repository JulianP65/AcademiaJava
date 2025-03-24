public class PlantaConifera extends Planta implements Semillero {
    
    public PlantaConifera(String nombre, double alto, int edad) {
        super(nombre, alto, edad);
        
    }
    
    @Override
    public void darSemillas() {
        System.out.println("La planta " + this.getNombre() + " ha dado semillas.");
    }
    
    
    public void mostrar() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Alto: " + this.getAlto());
        System.out.println("Edad: " + this.getEdad());
    }

    
}
