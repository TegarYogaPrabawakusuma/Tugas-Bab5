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
public class Jaket {
     
    public int jumbar;
            
            public static int total1,total2,total3;
    public final int jkt1=100000,   jkt2=125000,    jkt3=175000;
    
    
      public int jkt1(int banyak){
        
        total1 = banyak * jkt1 + total1;
        return total1;
    } 
    
    public int jkt2(int banyak){
         
        total2 = banyak * jkt2 + total2;
        return total2;
    }
    
    public int jkt3(int banyak){
         
        total3 = banyak * jkt3 + total3;
        return total3;
    }
     public void Diskon(int banyak){
        if (banyak > 100){
           total1 = total1 - (banyak*5000); 
           
        }else {}
    }
    public void Diskon2(int banyak){
        if (banyak > 100){
           total2 = total2 - (banyak*5000); 
           
        }else {}
    
    }
    public void Diskon3(int banyak){
        if (banyak > 100){
            total3=total3-(banyak*15000);
    }else{}
}
   public static void Hatot(){
        System.out.println("//////////||||||||||\\\\\\\\\\");
        System.out.println("total harga yang harus anda bayarkan adalah : "+(total1+total2+total3));
        System.out.println("----------||||||||||----------");
    }
    
   
}