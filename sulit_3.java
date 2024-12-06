import java.util.Scanner;
import java.util.Arrays;
public class sulit_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jumlah indeks");
        int jumlah = input.nextInt();
        
        int[] array = new int[jumlah];

        for (int i = 0; i <jumlah; i++){
            System.out.print("masukkan angka di indeks ke " + i + " = ");
            array[i] = input.nextInt();
        }
        Arrays.sort(array);

        int hitung = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                hitung++;
            } else {
                System.out.println(array[i] + " muncul " + hitung + " kali");
                hitung = 1; 
            }
        }
        System.out.println(array[array.length -1] + " muncul " + hitung + " kali");
    }
}