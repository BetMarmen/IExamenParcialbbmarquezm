/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

import CapaDatos.Bytes_Kilobytes;
import CapaDatos.I_menu;
import java.util.Scanner;

/**
 *
 * @author JADPA-18
 */
public class MenuPrincipal implements I_menu {
    @Override
    public void opciones(){
        System.out.println("1.Convertir de bytes a Kilobytes");
        System.out.println("2.Convertir de Kilobytres a Megabytes");
        System.out.println("3.Salir del Menu");
    }
    @Override
     public void seleccion(){
        System.out.println("Bienvenido a este convertidor de bytes y kilobytes");
    Scanner scan= new Scanner(System.in);
    String opc=null;
    while(!"3".equals(opc)){
        opciones();
    
        System.out.println("Ingrese la opción deseada: ");
        opc=scan.next();
        if("3".equals(opc)){
                System.out.println("Has abandonado el programa,hasta pronto!");}
                break;}
        switch(opc)
        {
            case "1" -> {
                System.out.println("Ingrese su cantidad de bytes");
                String bytes;
                bytes = scan.next();
                Bytes_Kilobytes.bytesKilobytes(bytes);
                        break;
                }
            case "2" ->{
                System.out.println("Ingrese su cantidad de kilobytes");
                String kilobytes;
                kilobytes= scan.next();
                Bytes_Kilobytes.kilobytesMegabytes(kilobytes);
                break;
              
            }
        }
        
        }
        
    
     }
   
    

