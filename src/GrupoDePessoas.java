import java.util.Arrays;
import java.util.Scanner;

public class GrupoDePessoas {

    public static void main(String[] Args) {

      Scanner s = new Scanner(System.in);

        String genero1= "masculino";
        String genero2 = "Masculino";
        String genero3 = "feminino";
        String genero4 = "Feminino";

        String listaDeNomes;
        String genero;

        System.out.println("Digite seu nome ; ");
        listaDeNomes = s.nextLine();

        System.out.println("Digite seu genero ; ");
        genero = s.nextLine();

        if (genero.equalsIgnoreCase(genero2)){
            System.out.println("Você faz parte do grupo de pessoas do sexo masculinas : " + listaDeNomes + " - " + genero1 );
        }
        else if (genero.equalsIgnoreCase(genero3)) {
            System.out.println("Você faz parte do grupo de pessoas do sexo femininas : " + listaDeNomes + " - " + genero4 );
        }







    }
}


