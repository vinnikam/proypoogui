
package co.vinni.poo.medio;

import co.vinni.poo.datos.Seguro;
import co.vinni.poo.datos.Vehiculo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Vinni
 */
public class Operaciones {
    private Map<String, Vehiculo> vehiculos;

    public Operaciones() {
        vehiculos = new HashMap<>();
    }
    
    public void crearVehiculo(String placa, String precio, String modelo){
        
    }
    public void crearVehiculo(String placa, long precio, int modelo, String marca){
        Vehiculo v = new Vehiculo();
        v.setPlaca(placa);
        v.setModelo(modelo);
        v.setMarca(marca);
        v.setPrecio(precio);
        vehiculos.put(placa, v);
    }
    public void asociarPropietarioVehiculo(String placa, String nombre, String identificacion){
        
    }
    public void asociarSeguro(String placa, Seguro seguro){
        
    }
    public List<Vehiculo> consultarVehiculos(){
        Collection<Vehiculo> values = vehiculos.values();
 
        // Creating an ArrayList
        ArrayList<Vehiculo> vehiculosLista = new ArrayList<>(values);
        return vehiculosLista;
    }
    public Vehiculo consultarVehiculo(String placa){
        return null;
    }
    
}
