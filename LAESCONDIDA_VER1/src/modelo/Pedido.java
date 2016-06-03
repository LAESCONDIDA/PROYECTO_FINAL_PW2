package modelo;

import java.util.ArrayList;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

public class Pedido{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key idPedido;
	@Persistent
    private int fechaAnio;
	@Persistent
    private int fechaMes;
	@Persistent
    private int fechaDia;
	@Persistent
    private float total;
	@Persistent
	private Usuario user;
	@Persistent
	private ArrayList<PedidoPlato> platos;
	@Persistent
	private ArrayList<PedidoBebida> bebidas;
	@Persistent
	private int entregaHora;
	@Persistent
    private int entregaMinutos;

    public Pedido() {
    
    }
    public Pedido(Usuario user,int fechaAnio,int fechaMes,int fechaDia,int entregaHora,int entregaMinutos) {
        super();
    	this.user = user;
    	this.fechaAnio = fechaAnio;
    	this.fechaMes = fechaMes;
    	this.fechaDia = fechaDia;
    	this.entregaHora = entregaHora;
    	this.entregaMinutos = entregaMinutos;
    	
    	platos = new ArrayList<PedidoPlato>();
    	bebidas = new ArrayList<PedidoBebida>();
    	
    }

    public int getFechaAnio() {
        return fechaAnio;
    }

    public void setFechaAnio(int fechaAnio) {
        this.fechaAnio = fechaAnio;
    }

    public int getFechaMes() {
        return fechaMes;
    }

    public void setFechaMes(int fechaMes) {
        this.fechaMes = fechaMes;
    }

    public int getFechaDia() {
        return fechaDia;
    }

    public void setFechaDia(int fechaDia) {
        this.fechaDia = fechaDia;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Usuario getUsuario() {
        return user;
    }

    public void setUsuario(Usuario usuario) {
        this.user = usuario;
    }
    public void setEntergaHora(int hora){
    	this.entregaHora=hora;
    }
    public int getEntregaHora(){
    	return entregaHora;
    }
    public void setEntergaMinuto(int min){
    	this.entregaMinutos=min;
    }
    public int getEntregaMinuto(){
    	return entregaMinutos;
    }
}
