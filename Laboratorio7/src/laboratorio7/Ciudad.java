package laboratorio7;

import java.util.ArrayList;

public class Ciudad implements IComponente{
    private String nombre;
    private ArrayList<CityTour> cityTours;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        cityTours = new ArrayList();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<CityTour> getCityTours() {
        return cityTours;
    }
    public void setCityTours(ArrayList<CityTour> cityTours) {
        this.cityTours = cityTours;
    }

    public String mostrarInfo(){
        String info = "Nombre: "+this.nombre+"\nCityTours: \n";
        for (CityTour cityTour : cityTours) {
            info += cityTour.mostrarInfo()+"\n";
        }
        return info;
    }
    public void add(CityTour componente){
        cityTours.add(componente);
    }
    public double calcularCostoTotal(){
        double costoTotal = 0;
        for (CityTour cityTour : cityTours) {
            costoTotal += cityTour.getCosto();
        }
        return costoTotal;
    }
    public double calcularDuracionTotal(){
        double duracionTotal = 0;
        for (CityTour cityTour : cityTours) {
            duracionTotal += cityTour.getDuracion();
        }
        return duracionTotal;
    }
}
