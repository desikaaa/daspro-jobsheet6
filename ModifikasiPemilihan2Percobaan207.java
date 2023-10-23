import java.util.Scanner;
public class ModifikasiPemilihan2Percobaan207 {

    public static void main(String[] args){
        Scanner input07 = new Scanner(System.in);
        int sudut1, sudut2, sudut3, totalSudut;
        System.out.println("Masukkan Sudut 1");
        sudut1 = input07.nextInt();
        System.out.println("Masukkan Sudut 2");
        sudut2 = input07.nextInt();
        System.out.println("Masukkan Sudut 3");
        sudut3 = input07.nextInt();
        totalSudut = sudut1 + sudut2 + sudut3;
        if (totalSudut == 180){
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3))
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else 
            System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else 
        System.out.println("Bukan Segitiga");
        
        }
}