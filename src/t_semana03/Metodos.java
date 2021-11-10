/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_semana03;

public class Metodos {

    public static void main(String[] args) {

        //1.LLmada al Metodo n°01 
        System.out.println("El resultado de 2^5 : " + exponente(2, 5) + "\n");
        
        //2.LLmada al Metodo n°02
        int[] a = {10, 9, 5, 11, 6};
        System.out.println("El valor máximo de [10-9-5-11-6] es : " + valorMaximo(0, a, -1) + "\n");

        //3.LLmada al Metodo n°03
        System.out.println("El indice del valor pasado como parametro 9 es : ");
        System.out.println("[0]=10 , [1]=9 , [2]=5 , [3]=11 , [4]=6 --> " + econtrarIndice(a, 9,0) + "\n");

    }

    public static int exponente(int x, int a) {
        if (a == 0) {
            return 1;
        } else {
            return x * exponente(x, a - 1);
        }
    }

    public static int valorMaximo(int pos, int[] arreglo, int maximo) {

        if (pos < arreglo.length - 1) {
            if (arreglo[pos] > maximo) {
                maximo = arreglo[pos];
            }

            return valorMaximo(pos + 1, arreglo, maximo);
        }
        return maximo;
    }


    public static int econtrarIndice(int[] a, int x, int pos) {
        if (a == null || a.length == 0) {
            return -1;
        }
        if (a[pos] == x) {
            return pos;
        }
        if (pos == a.length - 1) {
            return -1;
        } else {
            return econtrarIndice(a, x, pos + 1);
        }

    }


}
