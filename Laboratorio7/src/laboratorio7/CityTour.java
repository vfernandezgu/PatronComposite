package laboratorio7;

public class CityTour implements IComponente{
    private String nombre;
    private String descripcion;
    private double costo;
    private int duracion;
    public CityTour(String nombre, String descripcion, double costo, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.duracion = duracion;
    }
    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getCosto() {
        return this.costo;
    }

    public int getDuracion() {
        return this.duracion;
    }
    public String mostrarInfo(){
        return "Nombre: "+this.nombre+"\nDescripcion: "+this.descripcion+"\nCosto: "+this.costo+"\nDuracion: "+this.duracion;
    }
}
