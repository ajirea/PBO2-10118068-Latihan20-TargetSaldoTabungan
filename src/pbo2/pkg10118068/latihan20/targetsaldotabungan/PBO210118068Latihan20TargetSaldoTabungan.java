/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan20.targetsaldotabungan;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Program menghitung saldo tabungan perbulan hingga
 * mencapai target saldo yaitu 6000000
 */
public class PBO210118068Latihan20TargetSaldoTabungan {

    public static int saldo = 3500000;
    public static final int TARGET = 6000000; // final karena tetap
    public static String textSaldo;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 1;
        
        while(saldo <= TARGET) {

            saldo = saldo + (int)((float)saldo * 0.08F);
            
            // ganti koma ke titik
            textSaldo = String.format("%,d", saldo).replace(',', '.');

            System.out.println("Saldo di bulan ke-"+i+" Rp. "+textSaldo);
            
            i++;
        }
    }
    
}
