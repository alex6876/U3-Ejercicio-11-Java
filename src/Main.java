public class Main {
    public static void main(String[] args) {
        LibretaCalificaciones libreta = new LibretaCalificaciones("Juan");

        libreta.agregarNotas(5);
        libreta.agregarNotas(8);
        libreta.agregarNotas(10);
        libreta.agregarNotas(7);
        libreta.agregarNotas(9);
        libreta.agregarNotas(6);
        libreta.agregarNotas(5);
        libreta.agregarNotas(8);
        libreta.agregarNotas(10);
        libreta.agregarNotas(7);

        System.out.println("Estudiante: " + libreta.getNombreEstudiante());
        System.out.println("Promedio de notas: " + libreta.obtenerPromedio());
    }
}