public class Jardin {
    
    public static void main(String[] args) {
        
        Planta naranjo = new PlantaFrutal("Naranjo", 2.5, 5, "Dulce");
        Planta pino = new PlantaConifera("Pino", 5.0, 10);
        Planta hortensia = new PlantaFloral("Hortensia", 1.5, 3, "Azul");
        Planta ciricote = new PlantaFrutal("Ciricote", 3.0, 7, "Ácido");

        // Planta frutal naranjo
        naranjo.crecer();
        naranjo.fotosintetiza();
        ((PlantaFrutal)naranjo).darFrutos();
        ((PlantaFrutal)naranjo).darFlores();
        ((PlantaFrutal)naranjo).darSemillas();
        naranjo.mostrar();

        //Planta conifera pino
        pino.crecer();
        pino.fotosintetiza();
        ((PlantaConifera)pino).darSemillas();
        pino.mostrar();

        //Planta floral hortensia
        hortensia.crecer();
        hortensia.fotosintetiza();
        ((PlantaFloral)hortensia).darSemillas();
        ((PlantaFloral)hortensia).darFlores();
        hortensia.mostrar();

        //Planta frutal ciricote
        ciricote.crecer();
        ciricote.fotosintetiza();
        ((PlantaFrutal)ciricote).darFrutos();
        ((PlantaFrutal)ciricote).darFlores();
        ((PlantaFrutal)ciricote).darSemillas();
        ciricote.mostrar();

    }
}
