public class Alumnos {
    private String matricula;
    private String nombre;
    private double estructuras;
    private double ingles;
    private double iot;
    private double promedio;

    //constructor
    public Alumnos(String m, String n) {
        this.matricula = m;
        this.nombre = n;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstructuras() {
        return estructuras;
    }

    public void setEstructuras(double estructuras) {
        this.estructuras = estructuras;
    }

    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public double getIot() {
        return iot;
    }

    public void setIot(double iot) {
        this.iot = iot;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = (this.estructuras + this.ingles + this.iot) / 3;
    }

    @Override
    public String toString() {
        return "Alumnos [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }

    
}
