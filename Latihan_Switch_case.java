/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;


/**
 *
 * @author izzaa
 */
import java.util.Scanner;
public class Latihan_Switch_case {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int jumlah, pilihanmenu,pilihansubmenu, kartumember;
        double diskon, harga = 0,hargatotal, hargafinal;
        
        System.out.println("PILIHAN MENU");
        System.out.println("1.Sate");
        System.out.println("    [1.1] Sate Ayam    : [1500] per tusuk");
        System.out.println("    [1.2] Sate Kambing : [3000] per tusuk");
        System.out.println("2. Pecel     :");
        System.out.println("    [2.1] Lauk Ayam    : [13000] per porsi");
        System.out.println("    [2.2] Lauk Empal   : [15000] per porsi");
        System.out.println("3. Penyetan     :");
        System.out.println("    [3.1] Lauk Tahu / Tempe : [5000]  per porsi");
        System.out.println("    [3.2] Lauk Telur        : [7000]  per porsi");
        System.out.println("    [3.3] Lauk Ayam         : [10000] per porsi");
        
        
        System.out.println("------------------------------------------------");
        
        
        System.out.print("Pilih Menu yang ingin anda beli : ");
        pilihanmenu = input.nextInt();
        
        if (pilihanmenu>3){
            System.out.println("MOHON MAAF, MENU YANG ANDA PILIH TIDAK TERSEDIA");
            System.exit(0);
        }
        
        System.out.print("Pilih Sub Menu [tanpa tanda titik] : ");
        pilihansubmenu = input.nextInt();
        
        switch (pilihanmenu) {
            case 1 -> {
                if (pilihansubmenu==11){
                    harga = 1500;
                } else if (pilihansubmenu==12){
                    harga = 3000;
                } else {
                    System.out.println("MOHON MAAF, SUB MENU YANG ANDA PILIH TIDak tersedia");
                    System.exit(0);
                }
            }
                
            case 2 -> {
                if (pilihansubmenu==21){
                    harga = 13000;
                } else if (pilihansubmenu==22){
                    harga = 15000;
                } else {
                    System.out.println("MOHON MAAF, SUB MENU YANG ANDA PILIH TIDak tersedia");
                }
            }
                
            case 3 -> {
                switch (pilihansubmenu){
                    case 31 :
                        harga = 5000;
                        break;
                    case 32 :
                        harga = 7000;
                        break;
                    case 33 :
                        harga = 10000;
                        break;
                    default:
                        System.out.println("MOHON MAAF, SUBMENU YANG ANDA PILIH TIDak tersedia");
                }
            }
        }
        
        System.out.print("Jumlah    : ");
        jumlah = input.nextInt();
        
        hargatotal = harga*jumlah;
        System.out.println("harga total  : " + hargatotal);
        
        
        System.out.println("---------------------------------------");
       
        
        System.out.println("Apakah Anda Memiliki Kartu Member IYA/TIDAK?");
        System.out.println("[1. IYA]");
        System.out.println("[2. TIDAK]");
        System.out.print("Pilih [1, 2] : ");
        kartumember = input.nextInt();
        
        System.out.println();
        
        if (kartumember == 1){
            System.out.println("SELAMAT ANDA MENDAPATKAN DISKON SEBESAR [5%]");
            diskon = 0.05*hargatotal;
            System.out.println("Diskon : " + diskon);
            hargafinal = hargatotal - diskon;
            System.out.println("harga setelah diskon : " + hargafinal);
            
        } else if (kartumember == 2){
            System.out.println("MOHON MAAF, ANDA TIDAK MENDAPATKAN DISKON");
            diskon = 0*hargatotal;
            hargafinal=hargatotal-diskon;
            System.out.println("harga total  : " + hargafinal);
            
        } else {
            System.out.println("MOHON COBA LAGI");
        }
    }
}
        
    

