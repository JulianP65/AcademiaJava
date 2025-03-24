public class PlantaFloral extends Planta implements Semillero, Floreciente {
    private String color;
    
    public PlantaFloral(String nombre, double alto, int edad, String color) {
        super(nombre, alto, edad);
        this.color = color;
    }
    
    @Override
    public void darSemillas() {
        System.out.println("La planta " + this.getNombre() + " ha dado semillas.");
    }
    
    @Override
    public void darFlores() {
        System.out.println("La planta " + this.getNombre() + " ha dado flores.");
    }

    
    public void mostrar() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Alto: " + this.getAlto());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Color: " + this.color);
    }
    
}
