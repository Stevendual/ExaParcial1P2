public class Alumno {
    public int carnet;
    public String nombre;
    public String direccion;
    public String telefono;
    public int edad;

    //construcctor
    public Alumno(String nombre, String direccion, String telefono, int edad) {
        this.carnet = (int) (Math.random() * 10000000) + 1;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    //imprimir datos
    public void imprimirDatos() {
        System.out.println("\nDatos del alumno:");
        System.out.println("Carnet: " + carnet + "\nNombre: " + nombre + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nEdad: " + edad);
    }

    //getters y setters
    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
