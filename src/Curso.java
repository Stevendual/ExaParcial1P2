public class Curso {
    private int id;
    private String titulo;
    private int creditos;
    private Catedratico profesor;
    private int numMaxAlumnos;
    private Alumno[] alumnos;
    private int numAlumnosActual = 0;

    public Curso(int id, String titulo, int creditos, Catedratico profesor, int numMaxAlumnos) {
        this.id = id;
        this.titulo = titulo;
        this.creditos = creditos;
        this.profesor = profesor;
        this.numMaxAlumnos = numMaxAlumnos;
        this.alumnos = new Alumno[numMaxAlumnos];
    }

    public boolean verificaEspacio() {
        return numAlumnosActual < numMaxAlumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        if (verificaEspacio()) {
            alumnos[numAlumnosActual++] = alumno;
        } else {
            System.out.println("No hay espacio en el curso " + titulo);
        }
    }

    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumMaxAlumnos() {
        return numMaxAlumnos;
    }

    public void setNumMaxAlumnos(int numMaxAlumnos) {
        this.numMaxAlumnos = numMaxAlumnos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }


    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public void listarAlumnos() {
        System.out.println("\nAlumnos inscritos en el curso " + titulo + ":");
        for (int i = 0; i < numAlumnosActual; i++) {
            System.out.println("- " + alumnos[i].getNombre());
            //si hay alumnos inscritos en el curso despues del maximo de alumnos escribir un mensaje

            if (i == numMaxAlumnos - 1) {
                System.out.println("...Alumnos ya no podran ser inscritos en el curso "+titulo+" por limite de espacio");
            }
        }
    }
}