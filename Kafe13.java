import java.util.Scanner;

    public class Kafe13 {
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            boolean keanggotann;
            int jmlKopi, jmlTeh, jmlRoti;
            double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
            float diskon = 10 / 100f;

            System.out.print("Masukkan keanggotann (true/false): ");
            keanggotann = input.nextBoolean();
            System.out.print("Masukkan jumlah pembelian kopi: ");
            jmlKopi = input.nextInt();
            System.out.print("Masukkan jumlah pembelian teh: ");
            jmlTeh = input.nextInt();
            System.out.print("Masukkan jumlah pembelian roti: ");
            jmlRoti = input.nextInt();

            totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
            nominalBayar = totalHarga - (diskon * totalHarga);
            
            System.out.println("Keanggotaan pelanggan: " + keanggotann);
            System.out.println("Item pembelian " + jmlKopi + " Kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
            System.out.println("Nominal bayar Rp " + nominalBayar);
        }
    }
