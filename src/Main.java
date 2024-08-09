import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear catedráticos
        Catedratico cat1 = new Catedratico("Walter Cordero", "Zona 1, ciudad Guatemala", "12345678", "Ingeniero");
        Catedratico cat2 = new Catedratico("Juan Daniel", "Zona 5, Jutiapa", "87654321", "Licenciado");
        Catedratico cat3 = new Catedratico("Heber BuenaFe", "Zona 10, Suchitepequez", "45671234", "Doctor");

        // Crear cursos
        Curso curso1 = new Curso(1, "Base de Datos II", 5, cat2, 5);
        Curso curso2 = new Curso(2, "Fisica I", 5, cat3, 5);
        Curso curso3 = new Curso(3, "Programacion II", 5, cat1, 2);

        // Crear alumnos
        Alumno alumno1 = new Alumno("Bryan Steven", "Jutiapa", "12345678", 27);
        Alumno alumno2 = new Alumno("Josue Benjamin", "Ciudad Guatemala", "87654321", 25);
        Alumno alumno3 = new Alumno("Melani Carla", "Zona 5, Mixco", "45671234", 26);

        // Crear Asignaciones
        curso3.agregarAlumno(alumno1);
        curso1.agregarAlumno(alumno2);
        curso2.agregarAlumno(alumno3);

        // Crear maximo de asiganaciones curso Programacion II
        curso3.agregarAlumno(alumno2);
        curso3.agregarAlumno(alumno3);

      /*  // Crear maximo de asiganaciones curso Base de Datos II
        curso1.agregarAlumno(alumno1);
        curso1.agregarAlumno(alumno3);
        curso1.agregarAlumno(alumno2);
        curso1.agregarAlumno(alumno1);
        curso1.agregarAlumno(alumno3);*/

        // Imprimir datos
        cat1.imprimirDatos();
        alumno1.imprimirDatos();

        // Listar alumnos en curso
        curso1.listarAlumnos();
        curso2.listarAlumnos();
        curso3.listarAlumnos();
    }

}