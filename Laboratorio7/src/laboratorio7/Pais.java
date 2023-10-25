package laboratorio7;

import java.util.ArrayList;

public class Pais implements IComponente{
    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Pais(String nombre) {
        this.nombre = nombre;
        ciudades = new ArrayList();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public String mostrarInfo(){
        String info = "Nombre: "+this.nombre+"\nCiudades: \n";
        for (Ciudad ciudad : ciudades) {
            info += ciudad.mostrarInfo()+"\n";
        }
        return info;
    }
    public void add(Ciudad componente){
        ciudades.add(componente);
    }
    public double calcularCostoTotal() {
        double costoTotal = 0;
        for (Ciudad ciudad : ciudades) {
            costoTotal += ciudad.calcularCostoTotal();
        }
        return costoTotal;
    }
    public double calcularDuracionTotal() {
        double duracionTotal = 0;
        for (Ciudad ciudad : ciudades) {
            duracionTotal += ciudad.calcularDuracionTotal();
        }
        return duracionTotal;
    }
}
