package com.upchiapas.repisatriangular;

import com.upchiapas.repisatriangular.models.*;

public class Main {
    public static void main(String[] args) {
        LecturaDatos leer = new LecturaDatos();
        leer.leerDatos();

        OperacionesMetodos operacion=new OperacionesMetodos();
        operacion.calcularP(leer.getLadoA(),leer.getLadoB(),leer.getLadoC());

        Impresion mostrar=new Impresion();
        mostrar.imprimirResultado(operacion.getArea());
    }
}
