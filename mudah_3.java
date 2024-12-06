import java.util.Scanner;
public class mudah_3 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.print("masukkan bilangan awal :");
       int bilAwal = input.nextInt();
       System.out.print("masukkan bilangan akhir : ");
       int bilAkhir = input.nextInt();

        for (int i = bilAwal; i >= bilAkhir; i--) {
            if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 33");
            } else if (i % 3 == 1) {
                System.out.println(i + ". saya anak wikusama  ");
            } else if (i % 3 == 2) {
                System.out.println(i + ". saya anak moklet");
            }
        }
        
        System.out.println("1. saya senang");
    }
}

   
