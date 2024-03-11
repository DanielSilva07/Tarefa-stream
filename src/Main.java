import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite 4 nomes  " );
        String listaDeNomes1 = s.next();
        String listaDeNomes2 = s.next();
        String listaDeNomes3 = s.next();
        String listaDeNomes4 = s.next();

        List< String > lista = new ArrayList< String>();
        lista.add(listaDeNomes1);
        lista.add(listaDeNomes2);
        lista.add(listaDeNomes3);
        lista.add(listaDeNomes4);
        Collections.sort(lista);


        System.out.println(lista);





    }





}