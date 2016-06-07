/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class Usuario{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key idUsuario;
	@Persistent
    private String nombres;
	@Persistent
    private String apellidos;
	@Persistent
    private String correo;
	@Persistent
    private String contrasenia;
	@Persistent
    private int nacAnio;
	@Persistent
    private int nacMes;
	@Persistent
    private int nacDia;
	@Persistent
    private char sexo;
	@Persistent
    private String imagen;
    
	public Usuario() {
    }

    public Usuario(String nombres, String apellidos, String correo, String contrasenia,int anio,int mes,int dia,char sex,String img) {
        super();
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.nacAnio=anio;
        this.nacMes=mes;
        this.nacDia=dia;
        this.sexo=sex;
        this.imagen=img;
    }

    public String getIdUsuario() {
        return KeyFactory.keyToString(idUsuario);
    }

    public void setIdUsuario(String idUsuario) {
    	Key keyUsuario = KeyFactory.stringToKey(idUsuario);
		this.idUsuario= KeyFactory.createKey(keyUsuario,Usuario.class.getSimpleName(), java.util.UUID.randomUUID().toString());
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getNacAnio() {
        return nacAnio;
    }

    public void setNacAnio(int nacAnio) {
        this.nacAnio = nacAnio;
    }

    public int getNacMes() {
        return nacMes;
    }

    public void setNacMes(int nacMes) {
        this.nacMes = nacMes;
    }

    public int getNacDia() {
        return nacDia;
    }

    public void setNacDia(int nacDia) {
        this.nacDia = nacDia;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getImagen(){
		return imagen;
	}
	public void setImagen(String img){
		imagen=img;
	}
    
}
