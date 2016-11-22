/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abel
 */
public class Archivos {

    /**
     * crear un archivo llamado holamundo.txt
     * crear la ruta para el txt 
     *  guardar el archivo holamundo.txt en la ruta anterior 
     * verificar si existe sino crearlo
     * leer cadena en consola y guardarla en el archivo
     * 
     * leer el archivo e imprimirlo
     */
    
    
    public static void main(String[] args) throws IOException {
        InputStreamReader leer =new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(leer);
        
        
        String ruta="C:\\Users\\Abel\\Documents\\NetBeansProjects\\TALLER JAVAEE\\Archivos\\holaMundo.txt";
        
        File archivo= new File(ruta);
        BufferedWriter bw;
        if (archivo.exists()){
            bw = new BufferedWriter(new FileWriter(archivo));
        }else{
            bw=new BufferedWriter(new FileWriter(archivo));
        }
        if (archivo.isDirectory()){
            System.out.println("Es un directorio");
        }else{
            System.out.println("No es un directorio");
        }
        
        System.out.println("Ingresa el texto a escribir en el archivo:");
        String texto;
        texto = in.readLine();
        
        bw.write(texto);
        bw.close();
        
        String cadena;
        FileReader f=new FileReader (archivo);
        BufferedReader BF=new BufferedReader(f);
        while((cadena = BF.readLine())!=null) {
          System.out.println(cadena);
        }
        BF.close();
    }
    
}
