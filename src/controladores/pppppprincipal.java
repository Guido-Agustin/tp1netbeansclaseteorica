/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
package producto.modelos;
import producto.modelos.producto;

/**
 *
 * @author gabri
 */
public class pppppprincipal {
    public static void main(String[] args) {
        producto unProducto = new producto();
        unProducto.descripcion = "mesejante descripcion chango";
        
        System.out.println(unProducto.vector.size());
        unProducto.vector.add(2);
        unProducto.vector.add(3);
        unProducto.vector.add(4);
        unProducto.vector.add(5);
        unProducto.vector.add(6);
        System.out.println(unProducto.vector.size());
       for(int i : unProducto.vector){
            System.out.println(i);
                                    }
}
}
