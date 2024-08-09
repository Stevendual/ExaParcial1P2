public class Catedratico {
    public int codigoCatedratico;
    public String nombre;
    public String direccion;
    public String telefono;
    public String profesion;

    //constructor codigoCatedratico automatico
    public Catedratico(String nombre, String direccion, String telefono, String profesion) {
        this.codigoCatedratico = (int) (Math.random() * 1000) + 1;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
    }

    //imprimir datos
    public void imprimirDatos() {
        System.out.println("Datos del catedratico:");
        System.out.println("Codigo: " + codigoCatedratico + "\nNombre: " + nombre + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nProfesion: " + profesion);
    }

    //getters y setters
    public int getCodigoCatedratico() {
        return codigoCatedratico;
    }

    public void setCodigoCatedratico(int codigoCatedratico) {
        this.codigoCatedratico = codigoCatedratico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
