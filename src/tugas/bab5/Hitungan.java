/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAPORAN;

/**
 *
 * @author TEGAR
 */
public class Hitungan {
 public static void Penjumlahan(int a,int b){
int nilai = a+b;
System.out.println("nilai penjumlahan adalah : "+nilai);

}
public void Perkalian(int a, int b){
int nilai = a*b;
System.out.println("nilai perkalian adalah : "+nilai);

}

public static void Pengurangan(int a, int b){
int nilai = a-b;
System.out.println("nilai pengurangan adalah :"+nilai);
}

public void Pembagian (int a, int b){
    int nilai=a/b;
    System.out.println("nilai pembagian adalah : "+nilai);
}
public void Sederhana(int a,int b){
    int temp1 = a;
       int temp2 = b; 

        while (a != 0 && b != 0){
     if(a > b){
        a = a % b;
     int n3 = temp1 / b ;
      int n4 = temp2 / b ;

     

      System.out.println("Hasil Penyederhanaannya adalah "+n3 + "/" + n4 );
     }else{
        b = b % a;
        int n3 = temp1 / a ;
      int n4 = temp2 / a ;

     

      System.out.println("Hasil Penyederhanaannya adalah "+n3 + "/" + n4 );
     }
   }     
    }     
    }     
  



