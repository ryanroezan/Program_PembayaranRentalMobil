package DataMobil;
//Abstract Class
abstract class Mobil {
    //Abstract Method
    abstract void TampilanHome();
    abstract void DaftarMobil();
    }
//Class Rental mobil mengimplementasi class abstract Mobil
public class RentalMobil extends Mobil{
    //Overriding Method
    //Memberi bentuk kongkrit dari Abstract Method
    public void TampilanHome(){
    System.out.println("========================================");
    System.out.println("\tPEMBAYARAN RENTAL MOBIL");
    System.out.println("\t\tALFINA");
    System.out.println("========================================");
     System.out.println("\nMenu");
    System.out.println("1. Lihat Daftar Mobil");
    System.out.println("2. Rental Mobil");
    System.out.println("3. Keluar");
}
    //overriding Method
    public void DaftarMobil(){
    System.out.println("");
    System.out.println("----------------------------------------");
    System.out.println("\t   Daftar Mobil");
    System.out.println("----------------------------------------");
    System.out.println("1. Honda Jazz      | Rp 200000 per hari |");
    System.out.println("2. Kijang Inova    | Rp 250000 per hari |");
    System.out.println("3. Toyota Avanza   | Rp 300000 per hari |");
    System.out.println("4. Toyota Fortuner | Rp 450000 per hari |");  
    System.out.println("5. Toyota Alphard  | Rp 500000 per hari |");
    }
}
