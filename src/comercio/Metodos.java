/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercio;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciaalvarez
 */
public class Metodos {
    static String numeroVenta;
    static String referenciaProducto;
    static String referenciaPrecio;
    static String nombre;
    static float precio;
    static float cantidad; 
    
    public static void crear(Ventas array_ventas[], Producto array_productos[], Precio array_precios[], Ticket array_ticket[]){

        for(int i=0;i<array_ventas.length;i++){
            numeroVenta=array_ventas[i].getNumeroVenta();
            array_ticket[i].setNumeroVenta(numeroVenta);
            referenciaProducto=array_ventas[i].getReferenciaProducto();
            cantidad=array_ventas[i].getCantidade();
            for(int u=0;u<array_productos.length;u++){
                if(referenciaProducto.equals(array_productos[u].getReferenciaProducto())){
                    nombre=array_productos[u].getNombreProducto();
                    referenciaPrecio=array_productos[u].getReferenciaPrecio();
                    array_ticket[i].setNombre(nombre);
                    for(int x=0;x<array_precios.length;x++){
                        if(referenciaPrecio.equals(array_precios[x].getReferenciaPrecio())){
                            precio=array_precios[x].getPrecio();
                            array_ticket[i].setPrecioTotal(precio*cantidad);
                        }
                    }
                }
            }
            System.out.println("Ticket "+(i+1)+": "+(array_ticket[i].toString()));
        }
    }  

    public static void nombrePrecio(Ventas array_ventas[], Producto array_productos[], Precio array_precios[]){
        
        numeroVenta=JOptionPane.showInputDialog("inserte número venta:");
        
        for(int i=0;i<array_ventas.length;i++){
            if(numeroVenta.equals(array_ventas[i].getNumeroVenta())){
                referenciaProducto=array_ventas[i].getReferenciaProducto();
                for(int u=0;u<array_productos.length;u++){
                     if(referenciaProducto.equals(array_productos[u].getReferenciaProducto())){
                        nombre=array_productos[u].getNombreProducto();
                        referenciaPrecio=array_productos[u].getReferenciaPrecio();
                        for(int x=0;x<array_precios.length;x++){
                            if(referenciaPrecio.equals(array_precios[x].getReferenciaPrecio())){
                                precio=array_precios[x].getPrecio();
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Producto de nombre "+nombre+" con un precio de "+precio);
}
}