public class LibretaCalificaciones {
    private String nombreEstudiante;
    private double[] notas;
    private int cantidadNotas;

    public LibretaCalificaciones(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.notas = new double[10];
        this.cantidadNotas = cantidadNotas;
    }

    public void agregarNotas(double nota) {
        if (nota > 0 && nota <= 10) {
            if(cantidadNotas < notas.length) {
                notas[cantidadNotas] = nota;
                cantidadNotas++;

            }else{
                System.out.println("Nota Incorrecta");
            }
        }else{
            System.out.println("Libreta llena.");
        }
    }

    public double obtenerPromedio() {
        if (cantidadNotas == 0){
            return 0;
        }

        double suma = 0;
        for (int i = 0; i < cantidadNotas; i++) {
            suma += notas[i];
        }

        return suma / cantidadNotas;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }
}
