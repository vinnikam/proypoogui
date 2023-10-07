
package co.vinni.poo.datos;

import java.util.Date;

/**
 *
 * @author Vinni
 */
public class Seguro {
    private String tipo;
    private Date vigencia;    
    private long valor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }
    
    
}
