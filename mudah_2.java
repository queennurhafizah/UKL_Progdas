import java.util.Scanner;
public class mudah_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan = 0;
        
        System.out.print("masukkan jumlah bilangan yang masu anda ketahaui ganjil - genapnya :");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++){
            System.out.print("masukkan bilangan ke " + i + " = ");
            bilangan = input.nextInt();

            if (bilangan %2 == 0) {
                System.out.println(bilangan + " adalah bilangan genap \n");
            }else {
                System.out.println(bilangan + " adalah bilangan ganjil \n");
            }
        }
    }

}