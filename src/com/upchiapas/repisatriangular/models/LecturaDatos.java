package com.upchiapas.repisatriangular.models;

import java.util.Scanner;

public class LecturaDatos {
    double ladoA;
    double ladoB;
    double ladoC;
    public LecturaDatos() {

    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void leerDatos(){
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.println("Ingrese la Longitud del lado A: ");
            ladoA=entrada.nextInt();
            System.out.println("Ingrese la Longitud del lado B: ");
            ladoB=entrada.nextInt();
            System.out.println("Ingrese la Longitud del lado C: ");
            ladoC=entrada.nextInt();
            if(evaluarDatos(ladoA,ladoB,ladoC))
                System.out.println("** Error. Solo ingrese longitudes positivas **\n");
        }while (evaluarDatos(ladoA,ladoB,ladoC));

    }
    private boolean evaluarDatos(double a, double b, double c){
        boolean bandera=false;
        if(a<=0 || b<=0 || c<=0)
            bandera=true;
        return bandera;
    }
}
