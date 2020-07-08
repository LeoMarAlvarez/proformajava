/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.util.List;
import modelos.*;

/**
 *
 * @author leo
 */
public class ControladorPrincipal {
    private List<Marca>marcas;
    private List<Proforma> presupuestos;
    private List<Producto> productos;
    
    public ControladorPrincipal(){};

    //metodos de Marca
    public List<Marca> getMarcas() {
        return marcas;
    }

    public void setMarcas(List<Marca> marcas) {
        this.marcas = marcas;
    }
    
    public boolean nuevaMarca(String n)
    {
        Marca m = new Marca(n);
        this.marcas.add(m);
        return true;
    }

    public List<Proforma> getPresupuestos() {
        return presupuestos;
    }

    public void setPresupuestos(List<Proforma> presupuestos) {
        this.presupuestos = presupuestos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
    
}
