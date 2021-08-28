/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

/**
 *
 * @author Gredys Morales
 */
public class CalculoMes {
String nombre;
    double enero;
    double febrero;
    double marzo;
    double promedio;
    double total;

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEnero() {
        return enero;
    }

    public void setEnero(double enero) {
        this.enero = enero;
    }

    public double getFebrero() {
        return febrero;
    }

    public void setFebrero(double febrero) {
        this.febrero = febrero;
    }

    public double getMarzo() {
        return marzo;
    }

    public void setMarzo(double marzo) {
        this.marzo = marzo;
    }

    public CalculoMes(String nombre, double enero, double febrero, double marzo, double promedio, double total) {
        this.nombre = nombre;
        this.enero = enero;
        this.febrero = febrero;
        this.marzo = marzo;
        this.promedio = promedio;
        this.total = total;
    }

    public void setMes(int mes, double valor) {

        switch (mes) {
            case 1:
                setEnero(valor);
                break;
            case 2:
                setFebrero(valor);

                break;
            case 3:
                setMarzo(valor);

                break;

            default:
                System.out.println("Solo números entre 1 y 3");
        }

    }
}
    
    

