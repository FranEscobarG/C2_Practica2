package com.upchiapas.repisatriangular.models;

public class OperacionesMetodos {
    double p;
    double area;

    public void calcularP(double a, double b, double c){
        p=(a+b+c)/2;
        calcularArea(a,b,c,p);
    }
    public void calcularArea(double a, double b, double c,double p){
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double getArea() {
        return area;
    }
}
