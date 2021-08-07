/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturas;

import java.text.DecimalFormat;

/**
 *
 * @author Usuario
 */
public class ClaseDatos {
    public static final int MaxFila = 5;
    public static final int MaxColumnas = 8;
    private int totalFilas = 0;
    
    private static String [][] complemento = new String  [5][8]; 
     private static  double  [][] arrayNumero = new double[5][8];
     private static double  [][] arrayNumero2 = new double[5][8];
     private static double  [][] arrayNumero3 = new double[5][8];
     private static double  [][] controlar = new double[5][8];
    
    private static final int NumeroUnidades =1;
    private static final int NombreProducto =0;
    private static final int PrecioUnitario =2;
    private static final int Kilogramos =3;
    private static final int ValorFactura =2;
    private static final int GastoValor =3;
    private static final int GastoPrecio =4;
    private static final int CostoPorUnidad =5;
    private static final int CostoTotal =6;
    private int filaActual = 0;
    
    private static DecimalFormat f = new DecimalFormat("0.00");
    
    
   
    public double Suma = 0;
    public double [] centinela1 = new double [9];
    public double [] centinela2 = new double [9];

    
    
    
  
    
     public void AgregaVendedores (ClaseComplemento Datos){
        
            complemento[4][0]="Total Final";
           for (int i = 1; i <8; i ++){
              complemento [4][i] = "";
           }
            
            complemento[filaActual][NombreProducto] = Datos.NombreProducto; 
            complemento[filaActual][NumeroUnidades] = Datos.NumeroUnidades+"";
            complemento[filaActual][PrecioUnitario] =  Datos.PrecioUnitario+"";
            complemento[filaActual][Kilogramos] =  ClaseComplemento.Kilogramos+"";
        filaActual++;
        
        
      
        
  
    }
     
         public void Funcion (ClaseComplemento Datos){
        

        double  P1,Colum1,Colum2,Colum3,Colum4,Colum11,Colum22,Colum33,Colum44,P5,Colum81,Colum82,Colum83,Colum84,Total1,Total2,Total3,Total4,GranTotal5;
        
       
    for(int columna=1;columna<complemento.length;columna++)
    {    P1 = 0;  Colum1 = 0; Colum2 = 0; Colum3 = 0; Colum4 = 0; P5 = 0; Colum81 = 0; Colum82 = 0; Colum83 = 0; Colum84 = 0; Colum11 = 0; Colum22 = 0; Colum33 = 0; Colum44 = 0; Total1 = 0; Total2 = 0; Total3 = 0; Total4 = 0; GranTotal5 = 0;
        for(int fila=0;fila<complemento.length-1;fila++)
        {
            
            double gastoalvalor = 8700;
            double gastoalpeso = 7500;
              arrayNumero[fila][columna]=Double.valueOf(complemento[fila][1]);   
              arrayNumero2[fila][columna]=Double.valueOf(complemento[fila][2]); 
              P1 += arrayNumero[fila][columna] * arrayNumero2[fila][columna]; 
              
            
              
              arrayNumero[fila][columna] = Double.valueOf(complemento[0][2]);
              Colum1 = arrayNumero[fila][columna] * (gastoalvalor / P1);
              complemento[0][4] = f.format(Colum1)+"";
              
              arrayNumero[fila][columna] = Double.valueOf(complemento[1][2]);
              Colum2 = arrayNumero[fila][columna] * (gastoalvalor / P1);
               complemento[1][4] = f.format(Colum2)+"";
              
              arrayNumero[fila][columna] = Double.valueOf(complemento[2][2]);
              Colum3 = arrayNumero[fila][columna] * (gastoalvalor / P1);
               complemento[2][4] = f.format(Colum3)+"";
              
              arrayNumero[fila][columna] = Double.valueOf(complemento[3][2]);
              Colum4 = arrayNumero[fila][columna] * (gastoalvalor / P1);
               complemento[3][4] = f.format(Colum4)+"";
               
               arrayNumero[fila][columna]=Double.valueOf(complemento[fila][1]);   
              arrayNumero2[fila][columna]=Double.valueOf(complemento[fila][3]); 
              P5 += arrayNumero[fila][columna] * arrayNumero2[fila][columna]; 
              
              
              
              
              arrayNumero[fila][columna] = Double.valueOf(complemento[0][3]);
              Colum11 = arrayNumero[fila][columna] * (gastoalpeso / P5);
              complemento[0][5] = f.format(Colum11)+"";
              
              arrayNumero[fila][columna] = Double.valueOf(complemento[1][3]);
              Colum22 = arrayNumero[fila][columna] * (gastoalpeso / P5);
               complemento[1][5] = f.format(Colum22)+"";
              
              arrayNumero[fila][columna] = Double.valueOf(complemento[2][3]);
              Colum33 = arrayNumero[fila][columna] * (gastoalpeso / P5);
               complemento[2][5] = f.format(Colum33)+"";
              
              arrayNumero[fila][columna] = Double.valueOf(complemento[3][3]);
              Colum44 = arrayNumero[fila][columna] * (gastoalpeso / P5);
               complemento[3][5] = f.format(Colum44)+"";
               
               
                arrayNumero[fila][columna]=Double.valueOf(complemento[0][2]);
              Colum81 = Colum1 + Colum11 + arrayNumero[fila][columna];
              complemento[0][6] = f.format(Colum81)+"";
              
              arrayNumero[fila][columna]=Double.valueOf(complemento[1][2]);
              Colum82 = Colum2 + Colum22 + arrayNumero[fila][columna];
              complemento[1][6] = f.format(Colum82)+"";
              
              arrayNumero[fila][columna]=Double.valueOf(complemento[2][2]);
              Colum83 = Colum3 + Colum33 + arrayNumero[fila][columna];
              complemento[2][6] = f.format(Colum83)+"";
              
              arrayNumero[fila][columna]=Double.valueOf(complemento[3][2]);
              Colum84 = Colum4 + Colum44 + arrayNumero[fila][columna];
              complemento[3][6] = f.format(Colum84)+"";
              
              
              
              arrayNumero[fila][columna]=Double.valueOf(complemento[0][1]);
              Total1 = arrayNumero[fila][columna] * Colum81;
              complemento[0][7] = "Q"+f.format(Total1)+""; 
              
              arrayNumero[fila][columna]=Double.valueOf(complemento[1][1]);
              Total2 = arrayNumero[fila][columna] * Colum82;
              complemento[1][7] = "Q"+f.format(Total2)+"";
              
              arrayNumero[fila][columna]=Double.valueOf(complemento[2][1]);
              Total3 = arrayNumero[fila][columna] * Colum83;
              complemento[2][7] = "Q"+f.format(Total3)+"";
              
              arrayNumero[fila][columna]=Double.valueOf(complemento[3][1]);
              Total4 = arrayNumero[fila][columna] * Colum84;
              complemento[3][7] = "Q"+f.format(Total4)+"";
              
        
              GranTotal5 = Total1 + Total2 + Total3 +Total4;
              complemento[4][7] = "Q"+f.format(GranTotal5)+"";
              
          
              
              
         
   
        }   
        
        
        
    }
}
        
       
       
    
    

     

      public  void imprimirDecorado(){
       
       for (int x = 0; x < complemento.length; x++) {
            System.out.print("|");
            for (int y = 0; y < complemento[x].length; y++) {
                System.out.print(complemento[x][y]);
                if (y != complemento[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
   }
   
    
        public double sumaColum(int colum){
            
        double total = 0.0;
        for(int y = 0; y <filaActual; y ++){
            String col = complemento[y][colum];
            total = total + Double.valueOf(col);
        }
        centinela1[colum] = total;


        return colum;
    }
    
}
