
package modelo;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class PedidoPlato{
    
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key idPedidoPlato;
	@Persistent
	private Plato plato;
	@Persistent
    private int cantidad;
	@Persistent
    private float total;

    public PedidoPlato() {
    }

    public PedidoPlato(Plato ped_plato, int cantidad) {
        super();
        this.plato=ped_plato;
        this.cantidad=cantidad;
        this.total=(float) (ped_plato.getPrecio()*cantidad);
    }

    public String getIdPedidoBebida() {
        return KeyFactory.keyToString(idPedidoPlato);
    }

    public void setIdPedidoBebida(String idPedidoPlato) {
    	Key keyPedidoPlato = KeyFactory.stringToKey(idPedidoPlato);
		this.idPedidoPlato= KeyFactory.createKey(keyPedidoPlato,PedidoPlato.class.getSimpleName(), java.util.UUID.randomUUID().toString());
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }
    
}
