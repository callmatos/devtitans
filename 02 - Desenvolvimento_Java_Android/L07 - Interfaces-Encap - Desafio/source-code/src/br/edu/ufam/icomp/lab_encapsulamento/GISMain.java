package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.ArrayList;
import java.util.Vector;

public class GISMain {

    static Localizavel vetorLocalizaveis[] = new Localizavel[9];


    public static void main(String[] args) {
        
        Posicao ps = new Posicao(-3.160000, -60.120000, 15.0);
        // System.out.println(ps.toString());

        Localizavel c1 =new Celular(55, 92, 981994455);
        Localizavel c2 =new Celular(55, 92, 981994466);
        Localizavel c3 =new Celular(55, 92, 981994477);
        Localizavel c4 =new Celular(55, 92, 981994488);

        // System.out.println(c1.getPosicao());
        // System.out.println(c2.getPosicao());
        // System.out.println(c3.getPosicao());
        // System.out.println(c4.getPosicao());

        Localizavel cc1 = new CarroLuxuoso("PHJ-4455");
        Localizavel cc2 = new CarroLuxuoso("PIJ-4855");
        Localizavel cc3 = new CarroLuxuoso("PHJ-4465");
        Localizavel cc4 = new CarroLuxuoso("PUJ-2155");
        Localizavel cc5 = new CarroLuxuoso("PKJ-5255");

        

        vetorLocalizaveis[0] = c1;
        vetorLocalizaveis[1] = c2;
        vetorLocalizaveis[2] = c3;
        vetorLocalizaveis[3] = c4;
        vetorLocalizaveis[4] = cc1;
        vetorLocalizaveis[5] = cc2;
        vetorLocalizaveis[6] = cc3;
        vetorLocalizaveis[7] = cc4;
        vetorLocalizaveis[8] = cc5;
        // Vector<Localizavel> vetorLocalizaveis = new Vector<>();
        
        // vetorLocalizaveis.add(c1);
        // vetorLocalizaveis.add(c2);
        // vetorLocalizaveis.add(c3);
        // vetorLocalizaveis.add(c4);
        // vetorLocalizaveis.add(cc1);
        // vetorLocalizaveis.add(cc2);
        // vetorLocalizaveis.add(cc3);

        for (int i = 0; i < vetorLocalizaveis.length; i++) {
            
            System.out.println(vetorLocalizaveis[i].getPosicao());
        }

    }
}
