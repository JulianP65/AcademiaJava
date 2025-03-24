public abstract class Planta implements ComportamientoPlanta {

    String nombre;
    double alto;
    int edad;

    public Planta(String nombre, double alto, int edad) {
        this.nombre = nombre;
        this.alto = alto;
        this.edad = edad;
    }

    public void crecer() {
        System.out.println("La planta " + this.getNombre() + " crece");
    }

    public void fotosintetiza() {
        System.out.println("La planta " + this.getNombre() + " realiza la fotosíntesis");
    }

    public abstract void mostrar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
