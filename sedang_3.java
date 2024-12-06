import java.util.Scanner;
import java.util.Random;

public class sedang_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("pilih jenis kuis (pilih angkanya)");
            System.out.println("1. perkalian \n2. pembagian \n3. modulus \n4. penjumlahan \n5. pengurangan \n6. keluar");
            System.out.print("pilihan anda = ");

            int jenis = input.nextInt();

            if (jenis == 6) {
                System.out.println("terimakasih sudah bermain");
                break;
            }else if(jenis <1 || jenis >6) {
                System.out.println("terimaksih sudah bermain");
                break;
            }

            int bilangan1 = random.nextInt(10) +1;
            int bilangan2 = random.nextInt(10) +1;
            String operator = "";
            int hasil = 0;
            
            if (jenis == 1 ) {
                operator = "*";
                hasil = bilangan1 * bilangan2;
            }else if (jenis == 2 ) {
                operator = "/";
                hasil = bilangan1 / bilangan2;
            }else if (jenis == 3 ) {
                operator = "%";
                hasil = bilangan1 % bilangan2;
            }else if (jenis == 4 ) {
                operator = "+";
                hasil = bilangan1 + bilangan2;
            }else if (jenis == 5 ) {
                operator = "-";
                hasil = bilangan1 - bilangan2;
            }

            System.out.printf("%d %s %d = ", bilangan1, operator, bilangan2);
            int jawaban = input.nextInt();

            if (jawaban == hasil) {
                System.out.println("jawaban anda benar");
            }else {
                System.out.println("jawaban anda salah \n jawaban yang benar adalah " + hasil);
            }
            System.out.println("");
        }
    }
}
