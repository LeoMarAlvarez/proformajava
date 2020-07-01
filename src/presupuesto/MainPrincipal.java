/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presupuesto;

import java.util.ArrayList;
import java.util.List;
import modelos.*;
import vistas.FrmHome;

/**
 *
 * @author leo
 */
public class MainPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Marca coca = new Marca("CocaCola");
        Marca mana = new Marca("Manaos");
        Marca lev = new Marca("Levite");
        
        Producto uno = new Producto(1,"CocaCola x2.25L", 20, 125);
        Producto dos = new Producto(2,"Manaos Cola x 3L", 50, 100);
        Producto tres = new Producto(3,"Levite pomelo x3L", 35, 130);
        
        uno.setMarca(coca);
        dos.setMarca(mana);
        tres.setMarca(lev);
        
        Detalle unDetalle = new Detalle();
        unDetalle.setCantidad(4);
        unDetalle.setProducto(uno);
        unDetalle.setPrecioUnitario( uno.getPrecioUnitario() );
        //unDetalle.setPrecioUnitario( unDetalle.getProducto().getPrecioUnitario() );
        
        Detalle ddos = new Detalle(3, dos.getPrecioUnitario(), dos);
        
        Proforma unaProforma = new Proforma();
        
        //porque set List
//        ArrayList<Detalle> laListaDeDetalles = new ArrayList<>();
//        
//        laListaDeDetalles.add(unDetalle);
//        laListaDeDetalles.add(ddos);
//        
//        unaProforma.setDetalles(laListaDeDetalles);
//        

        
        //System.out.println( unaProforma.getDetalles().size() );
        
        //unaProforma.this.detalles.add(unDetalle);
        unaProforma.agregarDetalle(ddos);
        unaProforma.agregarDetalle(unDetalle);
        
        Detalle buscado = unaProforma.buscarDetalle("Coca");
        
        System.out.println(" "+buscado.getProducto().getNombre());
//        System.out.println("Recorro lista");
//        for (Detalle det : unaProforma.getDetalles()) {
//            System.out.println(det.getProducto().getNombre()+" "+det.getCantidad());
//        }
//        System.out.println("Fin Recorrido");
        
        System.out.println(unaProforma.borrarDetalle(1));
        System.out.println(unaProforma.getDetalles().size());
        
//        System.out.println(uno.getNombre());
//        System.out.println(uno.getMarca().getNombre());
//        coca.setNombre("Sprite");
//        uno.getMarca().setNombre("Fanta");
//        System.out.println(uno.getMarca().getNombre());
//        System.out.println(coca.getNombre());

        FrmHome miForm = new FrmHome();
        miForm.setVisible(true);
    }
    
}
