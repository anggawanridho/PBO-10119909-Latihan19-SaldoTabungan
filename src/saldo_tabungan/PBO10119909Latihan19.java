package saldo_tabungan;

/**
 *
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10119909Latihan19 {

    public static void main(String[] args) {
        double saldo_awal = 2500000;
        for (double i = 1; i <= 6; i++) {
            saldo_awal += Math.floor(saldo_awal * 0.15);
            System.out.printf("Saldo di bulan ke-%1$.0f Rp. %2$,.0f%n",i,saldo_awal);
        }
    }
}
