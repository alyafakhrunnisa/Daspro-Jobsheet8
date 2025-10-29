import java.util.Scanner;
public class NilaiKelompok02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, nilai, kelompokTertinggi=0;
        float totalNilai, rataNilai, maxRataNilai=0;


        
        i = 1;
        while (i <= 3) { 
            System.out.println("\nKelompok " + i);
            totalNilai = 0;

            
            for (j = 1; j <= 5; j++) { 
                System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                while (!sc.hasNextInt()) {
                    System.out.println("Input tidak valid. Masukkan angka bulat.");
                    sc.next(); 
                    System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                }
                nilai = sc.nextInt();
                totalNilai += nilai; 
            }
            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);
            if (rataNilai > maxRataNilai) {
                maxRataNilai = rataNilai;      
                kelompokTertinggi = i;         
            }

            
            i++;
        }
        System.out.println("Kelompok dengan rata-rata nilai tertinggi adalah " + "Kelompok " + kelompokTertinggi + " dengan rata-rata " + maxRataNilai);

        
}
}

