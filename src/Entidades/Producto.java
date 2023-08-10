/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Dell
 */
public class Producto {
    


    public Producto() {
    }
    String Nombre;
    String Cantidad;
    String Costo;
    char Almacen;

    public Producto(String Nombre, String Cantidad, String Costo, char Almacen) {
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Costo = Costo;
        this.Almacen = Almacen;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getCosto() {
        return Costo;
    }

    public void setCosto(String Costo) {
        this.Costo = Costo;
    }

    public char getAlmacen() {
        return Almacen;
    }

    public void setAlmacen(char Almacen) {
        this.Almacen = Almacen;
    }
    
    
    
    
   
}
