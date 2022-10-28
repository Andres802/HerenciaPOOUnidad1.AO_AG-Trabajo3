/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect3;

/**
 *
 * @author ochoa
 */
public class Proyect3 {
    
    public static void main(String[] args) {
        
         System.out.println("\n1.PRIMER INFORMACION DE PAIS, PROVINICA Y CIUDAD");
         
        var pais = new Pais("Ecuador",170000,"Espanol");
        var ciudad = new Ciudad("Quito","Humberto",30000);
        var provincia = new Provincia("Pichincha",ciudad,1554,pais);
       
        System.out.println("" + pais.mostrarInfoPais());
        System.out.println("\nCIUDAD");
        System.out.println("" + ciudad.mostrarInfoCiudad());
        System.out.println("\nPROVINCIA");
        System.out.println(""+ provincia.mostrarInfoProvincia());
        
         System.out.println("\n2.SEGUNDA INFORMACION DE PAIS, PROVINICA Y CIUDAD");
        
        var pais1 = new Pais("Francia",50430000,"Frances");
        var ciudad1 = new Ciudad("Paris","Guinsert",1850);
        var provincia1 = new Provincia("Isla Francesa",ciudad1,122203,pais1);
        
        System.out.println("" + pais1.mostrarInfoPais());
        System.out.println("\nCIUDAD");
        System.out.println("" + ciudad1.mostrarInfoCiudad());
        System.out.println("\nPROVINCIA");
        System.out.println(""+ provincia1.mostrarInfoProvincia());
        
        System.out.println("\n3.TERCERA INFORMACION DE PAIS, PROVINICA Y CIUDAD");
        
        var pais2 = new Pais("Senegal",50430000,"Frances");
        var ciudad2 = new Ciudad("Dakar","Thierry Sabine",353000);
        var provincia2 = new Provincia("Dakar",ciudad2,1430,pais2);
        
        System.out.println("" + pais2.mostrarInfoPais());
        System.out.println("\nCIUDAD");
        System.out.println("" + ciudad2.mostrarInfoCiudad());
        System.out.println("\nPROVINCIA");
        System.out.println(""+ provincia2.mostrarInfoProvincia());
    }
    
}
