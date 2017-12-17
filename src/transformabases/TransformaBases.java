package transformabases;

import java.util.Arrays;

public class TransformaBases {

    StringBuffer s = new StringBuffer();
    public StringBuffer n;
    long valorInformado;

    public String decimalBinario(String i) {
        String valor = i;
        this.valorInformado = Long.parseLong(i);
        if (this.valorInformado <= 0) {
            return "0";
        }

        long b;

        while (this.valorInformado > 0) {
            b = this.valorInformado % 2;
            this.valorInformado = this.valorInformado >> 1;
            this.n = s.append(b);
        }

        return this.n.reverse() + "";
    }

    public String binarioDecimal(String i) {
        StringBuffer n = new StringBuffer(i);

        i = n.reverse().toString();
        
        long soma = 0;

        long[] array = new long[i.length()];

        for (int j = 0; j < i.length(); j++) {

            array[j] = Character.getNumericValue(i.charAt(j));
            array[j] = (long) (array[j] * Math.pow(2, j));

            soma += array[j];
        }

       
        return soma + "";

    }

    public String HexaEmDecimal(String h) {

        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        long k, soma = 0;
        for (int j = h.length(); j > 0; j--) {
            k = Arrays.binarySearch(hexa, h.charAt(j - 1));
            soma += k * Math.pow(16, (h.toUpperCase().length() - j));

        }

        return soma + "";
    }

    public String HexaEmBinario(String hexa) {

        return this.decimalBinario(this.HexaEmDecimal(hexa));

    }

    public String decimalEmHexa(String decimal) {
        String b = "";
        StringBuffer sb = new StringBuffer(b);

        long[] resto = new long[decimal.length()];
        long a = Long.parseLong(decimal);

        String[] posicao = new String[decimal.length()];
        for (int i = 0; i < resto.length; i++) {
            if (a == 0 && resto[i] == 0) {
                break;
            }
            resto[i] = a % 16;
            a = a / 16;

            posicao[i] = String.valueOf(resto[i]);

            switch (posicao[i]) {
                case "10":
                    posicao[i] = "A";
                    break;
                case "11":
                    posicao[i] = "B";
                    break;
                case "12":
                    posicao[i] = "C";
                    break;
                case "13":
                    posicao[i] = "D";
                    break;
                case "14":
                    posicao[i] = "E";
                    break;
                case "15":
                    posicao[i] = "F";
                    break;

            }

            b += posicao[i];
        }
        b = sb.append(b).reverse().toString();

        return b;
    }
    
    public String binarioEmHexa(String bin){
        String a; 
       a = decimalEmHexa(this.binarioDecimal(bin)); 
        
        return a;
    }

}
