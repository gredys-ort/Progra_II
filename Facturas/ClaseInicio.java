/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturas;

import java.util.Scanner;

/**
 *
 * @author Gredys
 */
public class ClaseInicio {

  public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        String nombre = "";
        
        ClaseDatos Com = new ClaseDatos();
        ClaseComplemento Datos = new ClaseComplemento();
        

        System.out.println(" ");
        System.out.println("");
        
        
        Datos.NombreProducto = "Bolas de cemento";
        
        Datos.NumeroUnidades = 50;
        
        Datos.PrecioUnitario = 60;
        
        Datos.Kilogramos = 50;
        
        Com.AgregaVendedores(Datos);
        
        
        
        Datos.NombreProducto = "Bolsas de Cal    ";
        Datos.NumeroUnidades = 150;
        Datos.PrecioUnitario = 40;
        Datos.Kilogramos = 20;
        
        Com.AgregaVendedores(Datos);
        
        Datos.NombreProducto = "Tubos de PC      ";
        Datos.NumeroUnidades = 200;
        Datos.PrecioUnitario = 55;
        Datos.Kilogramos = 10;
        
        Com.AgregaVendedores(Datos);
        
        Datos.NombreProducto = "Quintales de hierro";
        Datos.NumeroUnidades = 50;
        Datos.PrecioUnitario = 350;
        Datos.Kilogramos = 50;
        
        Com.AgregaVendedores(Datos);
        
        
               

        
        Com.Funcion(Datos);
        
        Com.imprimirDecorado();

    
        
        
        
        
        
    }
}

