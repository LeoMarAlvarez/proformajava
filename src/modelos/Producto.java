/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * 1 Producto conoce 1 Marca
 * 
 * @author leo
 */
public class Producto {
    private int id;
    private String nombre;
    private int stock;
    private double precioUnitario;
    private String calidad;
    
    //producto conoce 1 marca
    //one to one
    private Marca marca;
    
    
    public Producto(int id, String nombre, int stock, double precio)
    {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precioUnitario = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
    
    
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public int getStock()
    {
        return this.stock;
    }
    
    public double getPrecioUnitario()
    {
        return this.precioUnitario;
    }
    
    public Marca getMarca()
    {
        return this.marca;
    }
    
    public void setMarca(Marca m)
    {
        this.marca = m;
    }
    
}
