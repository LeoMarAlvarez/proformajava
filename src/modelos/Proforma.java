/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author leo
 */
public class Proforma {
    private Date fechaCreacion;
    private double montoTotal;
    private double montoBruto;
    private double descuento;
    private String observacion;
    
    //una proforma conoce 1 a muchos Detalle
    //oneToMany
    private List<Detalle> detalles;

    public Proforma() {
        this.detalles = new ArrayList<>();
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getMontoBruto() {
        return montoBruto;
    }

    public void setMontoBruto(double montoBruto) {
        this.montoBruto = montoBruto;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getDetalle() {
        return observacion;
    }

    public void setDetalle(String detalle) {
        this.observacion = detalle;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }
    
    //agrego objetos Detalle a mi lista de detalles
    public void agregarDetalle(Detalle detalle)
    {
        this.detalles.add(detalle);
    }
    
    public Detalle buscarDetalle(String nombre)
    {
        for (Detalle detalle : this.detalles) {
            // 'coca' == 'coca' => true: false;
            if(detalle.getProducto().getNombre().contains(nombre))
            {
                return detalle;
            }
        }
        return null;
    }
    
    public boolean borrarDetalle(int id)
    {
        for(Detalle detalle: this.detalles)
        {
            if(id == detalle.getProducto().getId())
            {
                return this.detalles.remove(detalle);
            }
        }
        
        return false;
    }
    
}
