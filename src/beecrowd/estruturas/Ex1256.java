package beecrowd.estruturas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1256 {
    public void run(){
        // HashTable<key, value>[3]
        // index = key mod 13
        // key = 49 -> index = 10
        // [key, value][key, value][49, value]
        //     i 8         i 9         i 10
        // key = 88 -> index = 10
        // [key, value][key, value][49 -> 88, value]
        //     i 8         i 9         i 10 (colisão)
        // [key, value][key, value][49, value][88, value]
        //     i 8         i 9         i 10     i 11

        Scanner scanner = new Scanner(System.in);
        int quantidadeCasosTeste = scanner.nextInt();

        for (int i = 0; i < quantidadeCasosTeste; i++) {
            String primeiraLinha = scanner.next();
            int M = Integer.parseInt(primeiraLinha.split(" ")[0]);
            int C = Integer.parseInt(primeiraLinha.split(" ")[1]);

            String segundaLinha = scanner.next();
            ArrayList<Integer> keys = new ArrayList<Integer>();
            for (int j = 0; j < C; j++) {
                keys.add(Integer.parseInt(segundaLinha.split(" ")[j]));
            }

            ArrayList[][] tabela = new ArrayList[M][M];
            for (int key : keys) {
                int index = key % 13;
                if (index < tabela.length){

                    //tabela[index][] = key;
                }
            }
        }
    }
}
