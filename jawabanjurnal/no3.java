import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.print("Praktikum = ");
        double praktikum = Input.nextDouble();
        
        System.out.print("Assesmen 1 = ");
        double asesmen1 = Input.nextDouble();

        System.out.print("Assesmen 2 = ");
        double asesmen2 = Input.nextDouble();

        double NilaiAkhir = 0.25 * praktikum + 0.35 * asesmen1 + 0.40 * asesmen2;

        System.out.println(" Nilai akhir : " +NilaiAkhir );

    }
}
