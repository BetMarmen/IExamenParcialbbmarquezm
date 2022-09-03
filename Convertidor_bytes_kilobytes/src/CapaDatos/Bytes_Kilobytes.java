/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;

/**
 *
 * @author JADPA-18
 */
public abstract class Bytes_Kilobytes implements I_menu {
    public static void bytesKilobytes( String bytes){
    Double kilobytes;
    try{
    Double Bytes=  Double.parseDouble(bytes);
    kilobytes = Bytes/1000;
        if(Bytes==0){
            System.out.println("No puede ser cero");
        }
        else{
            System.out.println("Sus Kilobytes son:" +kilobytes);
        }
    }
    catch(Exception variable){
        System.out.println(variable.getMessage());
    }
    }
    
    public static void kilobytesMegabytes( String kilobytes){
        Double megabytes;
        try{
        Double Kilobytes = Double.parseDouble(kilobytes);
        megabytes= Kilobytes*0.001;
        if (Kilobytes==0){
            System.out.println("No puede ser cero");
        }
        else{
            System.out.println("Sus Megabytes son"+megabytes);
        }
        }
        catch(Exception variable){
            System.out.println(variable.getMessage());
        }
    }
}
   
