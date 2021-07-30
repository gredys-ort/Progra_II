/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gredys
 */
public class Tarea3 {
    public static String[][] comisiones = new String[3][6];
    public static Scanner sc = new Scanner(System.in);

    public static void LlenarTabla() {
        comisiones[0][0] = "Gredys Morales";
        comisiones[0][1] = "20";
        comisiones[0][2] = "15";
        comisiones[0][3] = "35";

        comisiones[1][0] = "Alejandro Leon";
        comisiones[1][1] = "13";
        comisiones[1][2] = "23";
        comisiones[1][3] = "10";

        comisiones[2][0] = "Brandon Valdez";
        comisiones[2][1] = "19";
        comisiones[2][2] = "21";
        comisiones[2][3] = "15";

        System.out.println("Tabla de Ventas");
    }

    public static void imprimirDecorado(String[][] ma) {
        for (int x = 0; x < ma.length; x++) {
            System.out.print("|");
            for (int y = 0; y < ma[x].length; y++) {
                System.out.print(ma[x][y]);
                if (y != ma[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }

    public static void CalculoTotalPorMes() {
        int AcumMes;
        int AcumFila;
        int[] TotalMes = new int[comisiones.length];

        for (int columna = 1; columna < comisiones[0].length - 1; columna++) {
           
            AcumMes = 0;
            AcumFila = 0;

            for (int fila = 0; fila < comisiones.length; fila++) {

                AcumMes += Integer.parseInt(comisiones[fila][columna]);
            }

            System.out.println("Totales de la columna " + columna + " son " + AcumMes);
        }
    }

    public static void TotalPromedioMes() {

        String name = "";
        int AcumuladordeMes;
        int CantidadMes;
        double Promedio;

        for (int fila = 0; fila < comisiones.length; fila++) {
            
            CantidadMes= 0;
            
            AcumuladordeMes= 0;
            Promedio = 0;

            for (int columna = 1; columna < comisiones[fila].length - 2; columna++) {
               

                
                AcumuladordeMes+= Integer.parseInt(comisiones[fila][columna]);
                CantidadMes++;

                Promedio = AcumuladordeMes / CantidadMes;

            }

            comisiones[fila][comisiones[fila].length - 2] = String.valueOf(AcumuladordeMes);
            comisiones[fila][comisiones[fila].length - 1] = String.valueOf(Promedio);

           
        }

    }

    public static void VentasMaximasMes(String mes) {
        int ValorFila;
        int ColumnaMes;

       
        int MaxVentas = 0;

       
        int MinVentas = 9999;

        
        String nombreMaxVentas = "";
        String nombreMinVentas = "";

        switch (mes.toLowerCase()) {
            case "enero":
                ColumnaMes = 1;
                break;

            case "febrero":
                ColumnaMes= 2;
                break;

            case "marzo":
                ColumnaMes = 3;
                break;

            default:
                System.out.println("Mes no valido");
               
                return;
        }

        for (int fila = 0; fila < comisiones.length; fila++) {
            ValorFila = Integer.parseInt(comisiones[fila][ColumnaMes]);

            if (ValorFila > MaxVentas) {
                MaxVentas = ValorFila;
                nombreMaxVentas = comisiones[fila][0];
            } else if (ValorFila < MinVentas) {
                MinVentas = ValorFila;
                nombreMinVentas = comisiones[fila][0];
            }

        }

        System.out.println(nombreMinVentas + " tuvo las ventas minimas con " + MinVentas + " venta(s) en " + mes);
        System.out.println(nombreMaxVentas + " tuvo las ventas maximas con " + MaxVentas + " venta(s) en " + mes);

    }

    public static void maxVentasTotales() {
        int valorFila;
        int minVentasTotales = 9999;
        int maxVentasTotales = 0;
        String nombreMaxVentas = "";
        String nombreMinVentas = "";

        for (int fila = 0; fila < comisiones.length; fila++) {
            valorFila = Integer.parseInt(comisiones[fila][4]);

            if (valorFila > maxVentasTotales) {
                maxVentasTotales = valorFila;
                nombreMaxVentas = comisiones[fila][0];
            } else if (valorFila < minVentasTotales) {
                minVentasTotales = valorFila;
                nombreMinVentas = comisiones[fila][0];
            }
        }

        System.out.println("VENTAS MAXIMAS - " + nombreMaxVentas + " tuvo un total de " + maxVentasTotales + " ventas.");
        System.out.println("VENTAS MINIMAS - " + nombreMinVentas + " tuvo un total de " + minVentasTotales + " ventas.");
    }

   
    public static void main(String[] args) {
        LlenarTabla();
        TotalPromedioMes();
        imprimirDecorado(comisiones);
        CalculoTotalPorMes();
        VentasMaximasMes("enero");
        VentasMaximasMes("febrero");
        VentasMaximasMes("marzo");
        maxVentasTotales();
       
    }

}

    

