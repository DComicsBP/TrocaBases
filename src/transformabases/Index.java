package transformabases;

import java.util.Scanner;

public class Index {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TransformaBases t = new TransformaBases();
        String valor = null, resp = null;

        System.out.println("===============================================");
        System.out.println("\t\tTRANSFORMA BASES\t\t");
        System.out.println("===============================================");

        System.out.println("QUAL CONVERSAO VOCÊ DESEJA FAZER? ");
        System.out.println("DIGITE [1] PARA TRANSFORMAR DE BINARIO PARA DECIMAL: ");
        System.out.println("DIGITE [2] PARA TRANSFORMAR DE DECIMAL PARA BINARIO: ");
        System.out.println("DIGITE [3] PARA TRANSFORMAR DE HEXADECIMAL PARA DECIMAL: ");
        System.out.println("DIGITE [4] PARA TRANSFORMAR DE HEXADECIMAL PARA BINARIO: ");
        System.out.println("DIGITE [5] PARA TRANSFORMAR DE DECIMAL PARA HEXADECIMAL: ");
        System.out.println("DIGITE [6] PARA TRANSFORMAR DE BINARIO PARA HEXADECIMAL: ");
        int e = scan.nextInt();
        switch (e) {
            case 1:
                System.out.println("Digite o numero que você deseja converter: ");
                valor = scan.next();
                System.out.println("VALOR EM BINARIO: " + valor);
                System.out.println("VALOR EM DECIMAL: " + t.binarioDecimal(valor));
                System.out.println("Deseja conferir o valor em outras bases?[s/n]");
                System.out.println("VOCÊ DESEJA VER A CONVERSÃO PARA  AS OUTRAS BASES?[s/n]");
                resp = scan.next();
                if (resp.equalsIgnoreCase("s")) {
                    System.out.println("VALOR EM BINARIO " + valor);
                    System.out.println("VALOR EM HEXADECIMAL: " + t.binarioEmHexa(valor));
                }

                break;
            case 2:
                System.out.println("Digite o numero que você deseja converter: ");
                valor = scan.next();
                System.out.println("VALOR EM DECIMAL: " + valor);
                System.out.println("VALOR EM BINARIO: " + t.decimalBinario(valor));
                System.out.println("VOCÊ DESEJA VER A CONVERSÃO PARA  AS OUTRAS BASES?[s/n]");
                resp = scan.next();
                if (resp.equalsIgnoreCase("s")) {
                    System.out.println("VALOR EM DECIMAL: " + valor);
                    System.out.println("VALOR EM HEXADECIMAL: " + t.decimalEmHexa(valor));
                }

                break;
            case 3:
                System.out.println("Digite o numero que você deseja converter: ");
                valor = scan.next().toUpperCase();
                System.out.println("VALOR EM HEXADECIMAL: " + valor);
                System.out.println("VALOR EM DECIMAL: " + t.HexaEmDecimal(valor));
                System.out.println("VOCÊ DESEJA VER A CONVERSÃO PARA  AS OUTRAS BASES?[s/n]");
                resp = scan.next();
                if (resp.equalsIgnoreCase("s")) {
                    System.out.println("VALOR EM HEXADECIMAL: " + valor);
                    System.out.println("VALOR EM BINARIO: " + t.HexaEmBinario(valor));
                }

                break;

            case 4:
                System.out.println("Digite o numero que você deseja converter: ");
                valor = scan.next().toUpperCase();
                System.out.println("VALOR EM HEXADECIMAL: " + valor);
                System.out.println("VALOR EM BINARIO: " + t.HexaEmBinario(valor));
                System.out.println("VOCÊ DESEJA VER A CONVERSÃO PARA  AS OUTRAS BASES?[s/n]");
                resp = scan.next();
                if (resp.equalsIgnoreCase("s")) {
                    System.out.println("VALOR EM HEXADECIMAL: " + valor);
                    System.out.println("VALOR EM DECIMAL: " + t.HexaEmDecimal(valor));
                }

                break;
            case 5:
                System.out.println("Digite o numero que você deseja converter: ");
                valor = scan.next();
                System.out.println("VALOR EM DECIMAL: " + valor);
                System.out.println("VALOR EM HEXADECIMAL: " + t.decimalEmHexa(valor));
                System.out.println("VOCÊ DESEJA VER A CONVERSÃO PARA  AS OUTRAS BASES?[s/n]");
                resp = scan.next();
                if (resp.equalsIgnoreCase("s")) {
                    System.out.println("VALOR EM DECIMAL: " + valor);
                    System.out.println("VALOR EM BINARIO: " + t.decimalBinario(valor));
                }

                break;
            case 6:
                System.out.println("Digite o numero que você deseja converter: ");
                valor = scan.next();
                System.out.println("VALOR EM BINARIO: " + valor);
                System.out.println("VALOR EM HEXADECIMAL: " + t.binarioEmHexa(valor));
                System.out.println("VOCÊ DESEJA VER A CONVERSÃO PARA  AS OUTRAS BASES?[s/n]");
                resp = scan.next();
                if (resp.equalsIgnoreCase("s")) {
                    System.out.println("VALOR EM BINARIO: " + valor);
                    System.out.println("VALOR EM HEXADECIMAL: " + t.binarioDecimal(valor));
                }

                break;

        }

    }

}
