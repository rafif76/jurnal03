import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nama matkul");
        String namaMatkul = input.next();
        System.out.println("masukan jumlah jam");
        int jumlahJam = input.nextInt();

        int hasil ;

        hasil = (jumlahJam*2);
        System.out.println("Aku suka kuliah "+namaMatkul+"");
        System.out.println("kuliah "+jumlahJam+" jam perminggu rasanya kurang");
        System.out.println("tambahin dong jadi "+hasil+" jam perminggu");


    }
}