/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author xdeantabelisario
 */
public class Coche {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    public Coche(){
        km=0;
        litros=0;
        vMed=0;
        pGas=0;
    }
    public Coche(float dist, float cons, float vMedia, float precio){
        km=dist;
        litros=cons;
        vMed=vMedia;
        pGas=precio;
    }
    public float getTiempo(){
        return km/vMed;
    }
    public float consumoMedio(){
        return 100*litros/km;
    }
    public void setKms(float dist){
        km=dist;
    }
    public void setLitros(float lit){
        litros=lit;
    }
    public void setPGas(float precio){
        pGas=precio;
    }
    public void setvMed(float vel){
        vMed=vel;
    }
    public float getvMed(){
        return vMed;
    }
    public void mostrar(){
        System.out.println("Kms recorrido: " +km +"\nLitros consumidos: " +litros+"\nVelocidad media: "+ vMed + "\nPrecio de gasolina: "+ pGas);
    }
}
