package ufrgs.seletiva;

import java.util.*;

public class SeletivaUFRGS2023 {
    public void mMatheusEMaria() {
        // Registrando entradas
        Scanner input = new Scanner(System.in);
        short countPalavras = Short.parseShort(input.nextLine());

        String[] mensagens = new String[countPalavras];
        for (int i = 0; i < countPalavras; i++) {
            mensagens[i] = input.nextLine();
        }

        // Tratamento das mensagens
        for (String mensagem : mensagens) {
            int square = (int)Math.sqrt(mensagem.length());
            int round, position;
            round = position = (square - 1) * square;
            HashMap<Integer, String> transcribed = new HashMap();
            int[] correctOrder = new int[mensagem.length()];

            for (int i = 0; i < mensagem.length(); i++) {
                transcribed.put(position, String.valueOf(mensagem.charAt(i)));
                correctOrder[i] = position;
                position -= square;
                if (position < 0) {
                    round++;
                    position = round;
                }
            }

            // Posicionando as letras
            Arrays.sort(correctOrder);

            // Imprimindo as mensagens
            String mensagemFinal = "";
            for (int i = 0; i < mensagem.length(); i++) {
                mensagemFinal += transcribed.get(correctOrder[i]);
            }
            System.out.println(mensagemFinal);
        }
    }
    public void mMatheusEMariaChat(){
        Scanner input = new Scanner(System.in);
        int countPalavras = Integer.parseInt(input.nextLine());

        for (int i = 0; i < countPalavras; i++) {
            String mensagem = input.nextLine();
            int square = (int) Math.sqrt(mensagem.length());
            char[] transcripted = new char[mensagem.length()];

            int position = 0;
            for (int col = 0; col < square; col++) {
                for (int row = square - 1; row >= 0; row--) {
                    transcripted[position++] = mensagem.charAt(row * square + col);
                }
            }

            System.out.println(new String(transcripted));
        }
    }


}
