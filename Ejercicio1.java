
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gredys el pana fresco
 */
public class Ejercicio1 {
    public static void main(String arg[]){
        
        Scanner lector = new Scanner(System.in);

        

        double Quetzales = 0,Dolares = 7.50, Euros = 9.15, Yuanes = 1.20;
        int Saldo;
        String Name;
        
        System.out.println("Por favor, ingrese tu nombre: ");
                
        Name = lector.nextLine();
        
        System.out.println();
        
        System.out.println("\t Bienvenido al convertidor de moneda de quetzales");
        
        System.out.println("Por favor, ingrese la cantidad de dinero que desa convertir: ");
                
        Quetzales = lector.nextDouble();
        
        System.out.println("OK, ahora a que moneda quieres convertir los Q." + Quetzales 
                + "\nDe Quetzal a Dolares  !1!"
                + "\nDe Quetzal a Euros    !2!"
                + "\nDe Quetzal a Yuanes   !3!"
                + "\nIngrese el numero de la opcion que desea convertir:  ");
        
        Saldo = lector.nextInt();
        
        switch(Saldo){
            case 1:
                Quetzales = Quetzales / Dolares;
                break;
            case 2:
                Quetzales = Quetzales / Euros;
                break;
            case 3:
                Quetzales = Quetzales / Yuanes;
                break;
            default: System.out.println("El numero ingresado no esta en el rango de las opciones.");     
        }
        System.out.println();
        System.out.println("Mucho Gusto: "+ Name);
        System.out.println("El resultado de la conversion es de " + Quetzales);
    }
}