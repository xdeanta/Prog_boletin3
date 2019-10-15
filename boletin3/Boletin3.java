/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

import java.util.Scanner;

/**
 *
 * @author xdeantabelisario
 */
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche audi;
        Coche wv;
        float dist, litros, vMed, precio;
        Scanner sc;
        sc=new Scanner(System.in);
        audi=new Coche();
        audi.mostrar();
        audi.setLitros(50);
        audi.setPGas(1.57f);
        dist=sc.nextFloat();
        litros=sc.nextFloat();
        vMed=sc.nextFloat();
        precio=sc.nextFloat();
        wv=new Coche(dist, litros, vMed, precio);
        System.out.println("Consumo: " + wv.consumoMedio() + " Litros por 100 km");
        litros=sc.nextFloat();
        wv.setLitros(litros);
        System.out.println("Velocidad media: " + wv.getvMed());
    }
    
}
