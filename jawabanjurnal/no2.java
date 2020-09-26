import java.util.Scanner;

public class Jurnal{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan NILAI");

        int nilai = input.nextInt();
        int pangkat = 2;
        double hasil ;

        hasil = Math.pow(nilai,pangkat);
        System.out.println(hasil);


    }
}