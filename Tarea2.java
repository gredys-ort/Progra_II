/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gredys Morales
 */
public class Tarea2 {
    
    public static String letraAscii(String palabra, int numero) {
        String palabraCodificada = "";
        char letras;

        for (int i = 0; i < palabra.length(); i++) {
            
            if (palabra.charAt(i) != ' ') {
                letras = (char) palabra.charAt(i);
                letras += numero;
                palabraCodificada += letras;
            } else {
                palabraCodificada += " ";
            }
        }

        return palabraCodificada;
    }

    public static String Ejecuta(String palabra, int numero) {
        String palabraDecodificada = "";
        char letra;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != ' ') {
                letra = (char) palabra.charAt(i);
                letra -= numero;
                palabraDecodificada += letra;
            } else {
                palabraDecodificada += " ";
            }
        }
        return palabraDecodificada;
    }
    
    
        public static void main(String args[]) {
        String resultado = letraAscii("Hola Bienvenido a Programacion 2", 9);
        System.out.println(resultado);

        String decodificar = Ejecuta(resultado, 9);
        System.out.println(decodificar);

    }
    
}
