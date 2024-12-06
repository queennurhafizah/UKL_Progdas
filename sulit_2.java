import java.util.Scanner;;
public class sulit_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jumlah indeks : ");
        int jumlah = input.nextInt();
        
        int[] array = new int[jumlah];

        for (int i = 0; i <jumlah; i++){
            System.out.print("masukkan angka di indeks ke " + i + " = ");
            array[i] = input.nextInt();
        }
        
        boolean duplikat= false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Array memiliki elemen duplikat bilangan: " + array[i]);
                    duplikat = true;
                }
            }
        }

        // Jika tidak ada duplikat
        if (!duplikat) {
            System.out.println("Array tidak memiliki elemen duplikat.");
        }
    }
}