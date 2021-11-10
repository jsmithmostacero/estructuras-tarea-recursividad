/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package semana03;

/**
 *
 * @author Jsmith
 */
public class prueba {
    
    public static void main(String[] args) {
//        digitar(10);
        int[] a = {1,2,5,8,7};
        System.out.println(digitarNormal(0, a));
    }
    
    public static void digitar(int i){
        //i--;
        System.out.println(i);

        if(i>0){
            digitar(i-1);
        }
        
    }
    
    public static int digitar2(int i){

        if(i==1)
            return 1;
        
        return i*digitar2(i-1);

        
        
    }
    public static int digitarReversa(int con,int[] n){
        int suma=0;
        //suma+=n[con-1];

        if(con>1){
            return suma+=digitarReversa(con-1,n);
        }else{
            return suma;
        }
            
    }
    
    public static int digitarNormal(int length,int[] n){
        if(length<n.length-1){
            return n[length] + digitarNormal(length+1,n);
        }
        
        return n[length];
    }
    
}
