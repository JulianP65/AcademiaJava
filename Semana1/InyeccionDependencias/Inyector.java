package InyeccionDependencias;

public final class Inyector {

    public static void crearCasa(String tipoTrabajador, String nombreCasa) {

        Reparador reparador = switch (tipoTrabajador.toLowerCase()) {
            case "plomero" -> new Plomero();
            case "electricista" -> new Electricista();
            case "pintor" -> new Pintor();
            case "carpintero" -> new Carpintero();
            case "albanil" -> new Albanil();
            default -> throw new IllegalArgumentException("Tipo de trabajador no válido");
        };

        Casa casa = new Casa(reparador, nombreCasa);
        casa.reparar();
    }
}
