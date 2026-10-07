import java.util.Scanner;

public class StudiKasus225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen: ");
        int jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Peringkat juara (1/2/3, 0 jika bukan juara): ");
            int peringkat = sc.nextInt();

            if (jumlahDokumen == 4) {
                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
                }
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            int statusPKM = sc.nextInt();

            if (jumlahDokumen == 4) {
                if (statusPKM == 1) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
                }
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }

        } else {
            System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }

        sc.close();
    }
}