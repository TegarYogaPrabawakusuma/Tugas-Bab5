/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAPORAN;

import java.util.Scanner;

/**
 *
 * @author TEGAR
 */
public class MainJaket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jaket wow=new Jaket();
        String answer;
        Scanner in=new Scanner(System.in);
        System.out.println("              CV LABKOMDAS");
        System.out.println("         JUAL BERBAGAI MACAM JAKET");
        System.out.println("Jaket berbahan dasar A : Rp 100.000 per item");
        System.out.println("Jaket berbahan dasar B : Rp 125.000 per item");
        System.out.println("Jaket berbahan dasar C : Rp 175.000 per item");
        System.out.println("DISKON BULAN INI AKAN BERLAKU DENGAN KETENTUAN: ");
        System.out.println("membeli Jaket A lebih dari 100 buah maka harga menjadi 95.000 per item ");
        System.out.println("membeli Jaket B lebih dari 100 buah maka harga menjadi 120.000 per item ");
        System.out.println("membeli C lebih dari 100 buah maka harga menjadi 160.000 per item ");
        System.out.println("Silahkan membeli");
       
        do{
             System.out.println("=============PEMBELIAN JAKET================");
        System.out.println("1. Jaket Apik           :Rp 100,000 ");
        System.out.println("2. Jaket Bagus          :Rp 125,000 ");
        System.out.println("3. Jaket Good           :Rp 175,000 ");
        System.out.println("4. Berapa harga total yang harus saya bayar?");
        System.out.println("5.Keluar");
        System.out.print("Masukkan pilihan Anda: ");
        int pilih = in.nextInt();
        switch (pilih){
            
            
         default:
                System.out.println("Mohon Maaf, Pilihan anda Tidak Ditemukan");      
        }
        System.out.print("Melanjutkan Transaksi? (Y/N) ");
        answer = in.next();
    }while(answer.equalsIgnoreCase("Y"));
        System.out.println("TERIMAKASIH,SILAHKAN KEMBALI LAGI LAIN KALI");
    }   
}
    


