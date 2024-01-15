import java.util.ArrayList;
import java.util.Scanner;

public class UAS1A {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner;
        int[] kapasitas_mesin = new int[3];
        // definisiii arrrraayyyyyyyy dan lanthaiiiiiiiiiiiiiiii

        kapasitas_mesin[0] = 1000;//dalam cc
        kapasitas_mesin[1] = 1500;//dalam cc
        kapasitas_mesin[2] = 2500;//dalam cc

        int[] lantai = new int[3];
        lantai[0] = 3;
        lantai[1] = 2;
        lantai[2] = 1;

        // jumlah kendaraan di lantaii
        int vehicleCountLantai1 = 0;
        int vehicleCountLantai2 = 0;
        int vehicleCountLantai3 = 0;

        int maxCapacityLantai1 = 2000;
        int maxCapacityLantai2 = 1800;
        int maxCapacityLantai3 = 1500;


        System.out.println(" PERHATIAN");
        System.out.println(" ANDA HARUS MEMASUKAN KAPASITAS MESIN ANDA UNTUK MENGETAHUI LANTAI DIMANA ANDA MEMARKIRKAN KENDARAAN ANDA ");
        for (int i = kapasitas_mesin[0]; i <= kapasitas_mesin[1]; i++) {
            arrayList.add(i);
        }

        // Meminta pengguna memasukkan nilai INPOOOT
        while (true) {
            System.out.println(" Masukkan nilai kapasitas mesin di sini(CC) = ");
            scanner = new Scanner(System.in);
            int nilai = scanner.nextInt();


            // menambahkan pernyataannn
            if (nilai >= kapasitas_mesin[0] && nilai <= 1200) {
                System.out.println("KENDARAAN ANDA DILETAKKAN DI LANTAI " + lantai[0]);
                System.out.println("TERIMAKASIH ATAS KUNJUNGAN ANDA ");
                vehicleCountLantai3++;
                System.out.println("JUMLAH KENDARAAN DI LANTAI 3 : " + vehicleCountLantai3);
                System.out.println("JUMLAH KENDARAAN DI LANTAI 2 : " + vehicleCountLantai2);
                System.out.println("JUMLAH KENDARAAN DI LANTAI 1 : " + vehicleCountLantai1);
                System.out.println("KAPASITAS DI LANTAI 3 ADALAH : " + maxCapacityLantai3 );
                maxCapacityLantai3 -= 1;
                System.out.println("KAPASITAS TERSISA ADALAH : " + maxCapacityLantai3) ;
                System.out.println("KAPASITAS DI LANTAI 2 ADALAH : " + maxCapacityLantai2 );
                System.out.println("KAPASITAS TERSISA ADALAH : " + maxCapacityLantai2) ;
                System.out.println("KAPASITAS DI LANTAI 1 ADALAH : " + maxCapacityLantai1 );
                System.out.println("KAPASITAS TERSISA ADALAH : " + maxCapacityLantai1) ;

            } else if (nilai >= kapasitas_mesin[1] && nilai <= 2000) {
                System.out.println("KENDARAAN ANDA DILETAKKAN DI LANTAI " + lantai[1]);
                System.out.println("TERIMAKASIH ATAS KUNJUNGAN ANDA ");
                vehicleCountLantai2++;
                System.out.println("JUMLAH KENDARAAN DI LANTAI 3 : " + vehicleCountLantai3);
                System.out.println("JUMLAH KENDARAAN DI LANTAI 2 : " + vehicleCountLantai2);
                System.out.println("JUMLAH KENDARAAN DI LANTAI 1 : " + vehicleCountLantai1);
                System.out.println("KAPASITAS DI LANTAI 2 ADALAH : " + maxCapacityLantai2 );
                maxCapacityLantai2 -= 1;
                System.out.println("KAPASITAS TERSISA ADALAH : " + maxCapacityLantai2) ;
                System.out.println("KAPASITAS DI LANTAI 1 ADALAH : " + maxCapacityLantai1 );
                System.out.println("KAPASITAS TERSISA ADALAH : " + maxCapacityLantai1) ;
                System.out.println("KAPASITAS DI LANTAI 3 ADALAH : " + maxCapacityLantai3 );
                System.out.println("KAPASITAS TERSISA ADALAH : " + maxCapacityLantai3);
            } else if (nilai >= kapasitas_mesin[2]) {
                System.out.println("KENDARAAN ANDA DILETAKAN DI LANTAI " + lantai[2]);
                System.out.println("TERIMAKASIH ATAS KUNJUNGAN ANDA ");
                vehicleCountLantai1++;
                System.out.println("JUMLAH KENDARAAN DI LANTAI 3 : " + vehicleCountLantai3);
                System.out.println("JUMLAH KENDARAAN DI LANTAI 2 : " + vehicleCountLantai2);
                System.out.println("JUMLAH KENDARAAN DI LANTAI 1 : " + vehicleCountLantai1);
                System.out.println("KAPASITAS DI LANTAI 1 ADALAH : " + maxCapacityLantai1 );
                maxCapacityLantai1 -= 1;
                System.out.println("KAPASITAS TERSISA ADALAH : " + maxCapacityLantai1) ;
                System.out.println("KAPASITAS DI LANTAI 2 ADALAH : " + maxCapacityLantai2 );
                System.out.println("KAPASITAS TERSISA ADALAH : " + maxCapacityLantai2) ;
                System.out.println("KAPASITAS DI LANTAI 3 ADALAH : " + maxCapacityLantai3 );
                System.out.println("KAPASITAS TERSISA ADALAH : " + maxCapacityLantai3);

            } else {
                System.out.println("INPUT NILAI KAPASITAS TIDAK VALID");
                System.out.println("MASUKKAN KEMBALI NILAI ");
                System.out.println("JUMLAH KENDARAAN DI LANTAI 3 : " + vehicleCountLantai3);
                System.out.println("KAPASITAS TERSISA ADALAH : " + maxCapacityLantai3);
                System.out.println("JUMLAH KENDARAAN DI LANTAI 2 : " + vehicleCountLantai2);
                System.out.println("KAPASITAS TERSISA ADALAH : " + maxCapacityLantai2);
                System.out.println("JUMLAH KENDARAAN DI LANTAI 1 : " + vehicleCountLantai1);
                System.out.println("KAPASITAS TERSISA ADALAH : " + maxCapacityLantai1) ;


            }


        }
    }
}