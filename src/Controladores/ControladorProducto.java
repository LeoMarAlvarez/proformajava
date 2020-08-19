/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.util.ArrayList;
import java.util.List;
import modelos.Producto;

/**
 *
 * @author leo
 */
public class ControladorProducto {
    private List<Producto> productos;
    //private ControladoraProducoJPA productoJpa;
    
    public ControladorProducto(){
        this.productos = new ArrayList<>();
    };
    
    public void nuevoProducto(String nombre, int stock, double precio, String calidad)
    {
        Producto p = new Producto(stock, nombre, stock, precio);
        this.productos.add(p);
    }
    
    //editarProducto(int id, String nombre, double precio)
    //actualizarStock(int id, int stock)
    //bajaProducto(int id)
    
    public List<Producto> getProductos()
    {
        return this.productos;
    }
    
    //todas las cosas del producto
}
