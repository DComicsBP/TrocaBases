/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package transformabases;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class teste {
    StringBuffer s = new StringBuffer();
    public StringBuffer n;
    int valorInformado;

    
 public String decimalBinario() {
        Scanner scan = new Scanner(System.in);
        System.out.println("FOrneca o valor: ");
        this.valorInformado = scan.nextInt();

        int b;

        while(this.valorInformado > 0) {
            b = this.valorInformado % 2;
            this.valorInformado = this.valorInformado >> 0 >> 1;
            this.n = s.append(b);
        }

        return  this.n.reverse()+"";
    }
 public int binarioDecimal(String i) {
       StringBuffer n = new StringBuffer(i); 
       
        i = n.reverse().toString();
        System.out.println(n);
        
        
        int soma = 0;
       
        int[] array = new int[i.length()];

        
        for (int j = 0; j < i.length(); j++) {
        
            
           
            array[j] = Character.getNumericValue(i.charAt(j));
            array[j] =  (int) (array[j] * Math.pow(2, j));
           
            soma+= array[j];
        }
        
               System.out.println(soma);


        return soma;

    }
 public int HexaEmDecimal(String h) {

        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        
        
        
        int k = -1, soma = 0;
        for (int j = h.length(); j > 0; j--) {
            k = Arrays.binarySearch(hexa, h.charAt(j - 1));
            soma += k * Math.pow(16, (h.length() - j));

        }

        return soma;
    }

    public String hexaEmBinario(String hexa) {
        return null;
    }  

}