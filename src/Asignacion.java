import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Asignacion {
    private Alumno alumno;
    private List<Curso> cursos;

    public Asignacion(Alumno alumno) {
        this.alumno = alumno;
        this.cursos = new ArrayList<>();
    }

    public void addCurso(Curso curso) {
        if (curso.verificaEspacio()) {
            cursos.add(curso);  // Agrega el curso a la lista de cursos del alumno
            curso.agregarAlumno(alumno);  // Agrega el alumno al curso
            System.out.println("Curso " + curso.getTitulo() + " agregado para el alumno " + alumno.getNombre());
        } else {
            System.out.println("No hay espacio en el curso " + curso.getTitulo());
        }
    }

}
