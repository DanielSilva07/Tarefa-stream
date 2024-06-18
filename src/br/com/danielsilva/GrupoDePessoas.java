package br.com.danielsilva;

import java.util.*;

public class GrupoDePessoas {

    public static void main(String Args[]) {

      Scanner s = new Scanner(System.in);

        String listaDeNomes;
        String genero;

        System.out.println("Digite seu nome ; ");
        listaDeNomes = s.nextLine();

        System.out.println("Digite seu genero ; ");
        genero = s.nextLine();

        List<String> grupoFeminino= new ArrayList<>();

        List<String> grupoMasculino = new ArrayList<>();

        if(genero.equalsIgnoreCase("feminino")){
            grupoFeminino.add(listaDeNomes);
        }
        else if (genero.equalsIgnoreCase("masculino")){
            grupoMasculino.add(listaDeNomes);
        }

        long stream = grupoFeminino.stream()
                .filter(gene -> genero.equalsIgnoreCase("feminino"))
                .count();
        System.out.println(stream);

//        System.out.println(grupoFeminino );
//        System.out.println(grupoMasculino );
          System.out.println(stream);

    }








}



