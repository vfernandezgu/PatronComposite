package laboratorio7;

import java.util.ArrayList;

public class Continente implements IComponente{
    private String nombre;
    private ArrayList<Pais> paises;

    public Continente(String nombre) {
        this.nombre = nombre;
        paises = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Pais> getPaises(){
        return paises;
    }
    public void setPaises(ArrayList paises){
        this.paises = paises;
    }
    public void addPais(Pais pais){
        paises.add(pais);
    }
    public void removePais(Pais pais){
        paises.remove(pais);
    }
    public String mostrarInfo(){
        String info = "Nombre: "+this.nombre+"\nPaises: \n";
        for (Pais pais : paises) {
            info += pais.mostrarInfo()+"\n";
        }
        return info;
    }
    public void add(Pais componente){
        paises.add(componente);
    }
    public double calcularCostoTotal(){
        double costoTotal = 0;
        for (Pais pais : paises) {
            costoTotal += pais.calcularCostoTotal();
        }
        return costoTotal;
    }   
    public double calcularDuracionTotal(){
        double duracionTotal = 0;
        for (Pais pais : paises) {
            duracionTotal += pais.calcularDuracionTotal();
        }
        return duracionTotal;
    }
}
