/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercio;

/**
 *
 * @author ggarciaalvarez
 */
public class Producto {
   private String referenciaProducto,nombreProducto,referenciaPrecio;

    public Producto(){
    }

    public Producto(String referenciaProducto, String nombreProducto, String referenciaPrecio){
        this.referenciaProducto=referenciaProducto;
        this.nombreProducto=nombreProducto;
        this.referenciaPrecio=referenciaPrecio;
    }

    public String getReferenciaProducto(){
        return referenciaProducto;
    }

    public void setReferenciaProducto(String referenciaProducto){
        this.referenciaProducto=referenciaProducto;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto){
        this.nombreProducto=nombreProducto;
    }

    public String getReferenciaPrecio(){
        return referenciaPrecio;
    }

    public void setReferenciaPrecio(String referenciaPrecio){
        this.referenciaPrecio=referenciaPrecio;
    }

    @Override
    public String toString(){
        return "referenciaProducto="+referenciaProducto+", nombreProducto="+nombreProducto+", referenciaPrecio="+referenciaPrecio;
}
}