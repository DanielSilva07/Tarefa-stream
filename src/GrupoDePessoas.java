import java.io.OutputStream;
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
            grupoFeminino.add("");
        }
        else if (genero.equalsIgnoreCase("masculino")){
            grupoMasculino.add("");
        }
        System.out.println(grupoFeminino.size() );
        System.out.println(grupoMasculino.size());



    }








}



