/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;

/**
 *
 * @author Francisco Florian
 */
public class Principal {
    public static void main(String[] args) {
        String ruta = new String("D:/UNIBE/Teoria de Compiladores/Francisco Florian/FranciscoFlorian_EjerciciosJFlex/Ejercicio3/src/codigo/Lexer.flex");
        generarLexer(ruta);
    }
    
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
    
}
