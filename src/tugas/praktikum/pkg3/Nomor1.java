package tugas.praktikum.pkg3;
import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,10,12,14,16,18,20};
        int cari = 12;
        int ketemu = 0;
        System.out.println("Data Yang ada : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("\nMasukan Data Yang Akan Dicari : ");
        cari=sc.nextInt();
        for(int i = 0; i<a.length; i++){
            if (a[i] == cari){
             ketemu = 1;
             System.out.print("Data " + cari + " Berada Di Indeks Ke - " + i);
            }
        }
         System.out.print(" ");
         System.out.print(" ");
            
            if (ketemu == 1)
                System.out.println("\nKesimpulan data : Data DItemukan ");
            else
                System.out.println("\nKesimpulan Data : Data Tidak Ditemukan");
    }
    
}
