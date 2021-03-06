/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.persistence.*;

/**
 *
 * @author leo
 */
@Table(name="marcas")
@Entity
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 100, unique = true)
    private String nombre;
    @Column(nullable = false, insertable = true)
    private boolean estado;
    
    public Marca(String nombre){
        this.nombre = nombre;
        this.estado = true;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String n)
    {
        this.nombre = n;
    }
    
    public boolean getEstado()
    {
        return this.estado;
    }
    
    public void setEstado()
    {
        if(this.estado)
        {
            this.estado = false;
        }else{
            this.estado = true;
        }
    }
    
}
