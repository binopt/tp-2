import java.util.Scanner;

public class Matematika {
    public static void main(String[] args) {
        // Initial variable
        Scanner input = new Scanner(System.in);

        while (true) {
            // Title
            System.out.println("Belajar Deret Aritmatika, Geometri dan menghitung Faktorial");
            System.out.println("===========================================================");

            // Input banyak angka
            System.out.print("Masukkan banyak angka yang mau dicetak [2...10]: ");
            int banyakAngka = input.nextInt();
            if (banyakAngka < 2 || banyakAngka > 10) {
                System.out.println("Banyak angka harus diantara 2 sampai 10 \n");
                continue;
            }

            // Input beda angka
            System.out.print("Masukkan beda masing-masing angka [2...9]: ");
            int bedaAngka = input.nextInt();
            if (bedaAngka < 2 || bedaAngka > 9) {
                System.out.println("Beda angka harus diantara 2 sampai 9 \n");
                continue;
            }

            // Menghitung deret aritmatika
            deretAritmatika(banyakAngka, bedaAngka);

            // Menghitung deret geometri
            deretGeometri(banyakAngka, bedaAngka);

            // Menghitung faktorial
            faktorial(banyakAngka);

            // Konfirmasi keluar program
            System.out.print("\n Anda mau ulang? [y/t]: ");
            String keluar = input.next();
            if (keluar.toLowerCase().equals("y")) {
                break;
            }
        }

        // Close scanner
        input.close();
    }

    // Method untuk menghitung deret aritmatika
    public static void deretAritmatika(int banyakAngka, int bedaAngka) {
        int angka = 1;
        System.out.println("Deret aritmatika: ");
        for (int i = 0; i < banyakAngka; i++) {
            System.out.print(angka + " ");
            angka += bedaAngka;
        }
        System.out.println("\n");
    }

    // Method untuk menghitung deret geometri
    public static void deretGeometri(int banyakAngka, int bedaAngka) {
        int angka = 1;
        System.out.println("Deret geometri: ");
        for (int i = 0; i < banyakAngka; i++) {
            System.out.print(angka + " ");
            angka *= bedaAngka;
        }
        System.out.println("\n");
    }

    // Method untuk menghitung faktorial
    public static void faktorial(int angka) {
        int hasil = 1;
        System.out.println("Faktorial dari " + angka + " adalah :");
        for (int i = angka; i > 0; i--) {
            System.out.print(i + " ");
            hasil *= i;

            if (i > 1) {
                System.out.print("* ");
            }
        }
        System.out.println("= " + hasil);
    }
}
