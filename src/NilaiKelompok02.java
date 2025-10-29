import java.util.Scanner;
public class NilaiKelompok02 {
    public static void main(String[] args) {
        //Buat deklarasi Scanner dengan nama variabel sc di dalam fungsi main()
        Scanner sc = new Scanner(System.in);

        //Deklarasi variabel sesuai pada flowchart
        int i, j, nilai;
        float totalNilai, rataNilai;

        // Mengulang proses memasukkan nilai untuk 6 kelompok (Outer Loop menggunakan while)
        i = 1;
        while (i <= 6) { // Pengulangan untuk 6 Kelompok
            System.out.println("\nKelompok " + i); // Tampilkan Kelompok ke-i

            //totalNilai direset ke 0 sebelum memulai pengulangan inner loop 
            totalNilai = 0;

            //Struktur perulangan for (inner loop) untuk memasukkan 5 nilai
            for (j = 1; j <= 5; j++) { // Pengulangan untuk 5 Penilai
                //Perintah untuk memasukkan 5 nilai dan menghitung total
                System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                // Memastikan input adalah integer
                while (!sc.hasNextInt()) {
                    System.out.println("Input tidak valid. Masukkan angka bulat.");
                    sc.next(); // Buang input yang salah
                    System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                }
                nilai = sc.nextInt();
                totalNilai += nilai; // totalNilai = totalNilai + nilai;
            }

            //Hitung rata-rata
            //Menggunakan (float)5 agar pembagian menghasilkan float, karena totalNilai juga float
            rataNilai = totalNilai / 5;

            //Tampilkan hasil (output rataNilai)
            //Tambahkan narasi keterangan untuk kebutuhan masukan dan luaran
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);

            // Increment i (i++) untuk lanjut ke kelompok berikutnya
            i++;
        }

        
}
}

