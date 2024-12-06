import java.util.Scanner;
public class sedang_2 {
    public static void hitung_volume_tabung (int r, int t) {
        double phi = 3.14;
        double result = phi * r * r * t;
        System.out.println("Volume tabung :" +result);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan jari - jari tabung : ");
        int r = input.nextInt();
        System.out.println("masukkan tinggi tabung : ");
        int t = input.nextInt();

        hitung_volume_tabung (r, t);
    }
    
}
