public class PlantaFrutal extends Planta implements Semillero, Frutal, Floreciente {
    private String sabor;

    public PlantaFrutal(String nombre, double alto, int edad, String sabor) {
        super(nombre, alto, edad);
        this.sabor = sabor;
    }
    
    @Override
    public void darFrutos() {
        System.out.println("La planta " + super.getNombre() + " da frutos");
    }

    @Override
    public void darFlores() {
        System.out.println("La planta " + super.getNombre() + " da flores");
    }

    @Override
    public void darSemillas() {
        System.out.println("La planta " + super.getNombre() + " da semillas");
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Alto: " + alto);
        System.out.println("Edad: " + edad);
        System.out.println("Sabor: " + sabor);
    }
}
