
package co.vinni.poo.datos;

import java.util.List;

/**
 *
 * @author Vinni
 */
public class Vehiculo {
    
    private String placa;
    private int modelo;
    private long precio;
    private String marca;
    
    private Propietario elPropietario; 
    
    private List<Seguro> seguros;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Propietario getElPropietario() {
        return elPropietario;
    }

    public void setElPropietario(Propietario elPropietario) {
        this.elPropietario = elPropietario;
    }

    public List<Seguro> getSeguros() {
        return seguros;
    }

    public void setSeguros(List<Seguro> seguros) {
        this.seguros = seguros;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", modelo=" + modelo + '}';
    }
    
    
}
