package modelo;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Plato {
    
    @PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key idPlato;
    @Persistent
    private String nombre;
    @Persistent
    private String descripcion;
    @Persistent
    private String categoria;
    @Persistent
    private float precio;
    @Persistent
    private String imagen;
    
    /*public Plato() {
    }*/

    public Plato(String nombre,String descrip,String categoria,float precio, String img) {
        super();
        this.nombre = nombre;
        this.descripcion = descrip;
        this.precio = precio;
        this.categoria=categoria;
        this.imagen=img;
    }

    public String getIdPlato() {
        return KeyFactory.keyToString(idPlato);
    }

    public void setIdPlato(String idPlato) {
    	Key keyPlato = KeyFactory.stringToKey(idPlato);
		this.idPlato= KeyFactory.createKey(keyPlato,Plato.class.getSimpleName(), java.util.UUID.randomUUID().toString());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getImagen(){
		return imagen;
	}
	public void setImagen(String img){
		imagen=img;
	}
}