package beecrowd.obi;

import java.util.Scanner;

public class OBI2014 {
    public void Bee1929() {
        /*
        Título: Triângulo
    Entrada = A,B,C,D entre 1 e 100
    Saída = S -> Forma o triângulo min, N -> Não forma um triângulo min
    - a^2 = B^2 + C
    * */
        double soma, diferenca;
        Scanner input = new Scanner(System.in);
        String[] values = input.nextLine().split(" ");

        for (int i = 0; i < values.length; i++) {
            int valorI = Integer.parseInt(values[i]);

            for (int j = 0; j < values.length; j++) {
                int valorJ = Integer.parseInt(values[j]);

                if (valorI != valorJ) {
                    soma = valorI + valorJ;
                    diferenca = valorI - valorJ;
                    if (diferenca < 0) diferenca *= -1;

                    for (String value : values) {
                        if (!value.equals(values[i]) && !value.equals(values[j]) && Double.parseDouble(value) < soma && Double.parseDouble(value) > diferenca) {
                            System.out.println("S");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("N");
    }
}
