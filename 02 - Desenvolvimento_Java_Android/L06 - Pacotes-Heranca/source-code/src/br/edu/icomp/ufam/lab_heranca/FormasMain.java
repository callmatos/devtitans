package br.edu.icomp.ufam.lab_heranca;

import java.util.ArrayList;

public class FormasMain {
    
    public static void main(String[] args) {
        
        ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();

        //Circulo
        Circulo c1 = new Circulo(2, 3, 2);
        Circulo c2 = new Circulo(5, 6, 4);
        Circulo c3 = new Circulo(3, 3, 5);
        formas.add(c1);
        formas.add(c2);
        formas.add(c3);

        Retangulo req1 = new Retangulo(2, 3, 3, 3);
        Retangulo req2 = new Retangulo(5, 6, 2, 2);
        Retangulo req3 = new Retangulo(3, 3, 6, 6);
        formas.add(req1);
        formas.add(req2);
        formas.add(req3);
        
        Quadrado q1 = new Quadrado(8, 9, 6);
        Quadrado q2 = new Quadrado(1, 2, 4);
        Quadrado q3 = new Quadrado(10, 10, 8);

        formas.add(q1);
        formas.add(q2);
        formas.add(q3);

        for (FormaGeometrica formaGeometrica : formas) {
            System.out.println(formaGeometrica.toString());
        }
    }
}
