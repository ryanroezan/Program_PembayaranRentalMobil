package DataMobil;
import DataMobil.RentalMobil;
import DataPembayaran.*;
import java.util.Scanner;
//Class main
//penggunan final keyword
final class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lanjut;
        //Objek
        RentalMobil Rental = new RentalMobil();
        HondaJazz Jazz = new HondaJazz("Honda Jazz", 200000);
        KijangInova Inova = new KijangInova("Kijang Inova", 250000);
        ToyotaAvanza Avanza = new ToyotaAvanza("Toyota Avanza", 300000);
        ToyotaFortuner Fortuner = new ToyotaFortuner ("Toyota Fortuner", 450000);
        ToyotaAlphard Alphard = new ToyotaAlphard ("Toyota Alphard", 500000);
        
        //Pemanggilan Method Oleh Objek
        //Penggunaan Do while
        do{
            Rental.TampilanHome();
            System.out.print("Masukkan Pilihanmu : ");
            int PilihMenu = input.nextInt();
            switch(PilihMenu){
                case 1 :
                    Rental.DaftarMobil();
                break;
                case 2 : 
                    Rental.DaftarMobil();
                    System.out.print("Masukkan Pilihanmu : ");
                     int PilihMobil = input.nextInt();
                     if (PilihMobil==1){
                         Jazz.InputUser();
                         Jazz.DetailTransaksi();
                     }
                     else if (PilihMobil==2){
                         Inova.InputUser();
                         Inova.DetailTransaksi();
                     }
                     else if (PilihMobil==3){
                         Avanza.InputUser();
                         Avanza.DetailTransaksi();
                     }
                     else if (PilihMobil==4){
                         Fortuner.InputUser();
                         Fortuner.DetailTransaksi();
                     }
                     else if (PilihMobil==5){
                         Alphard.InputUser();
                         Alphard.DetailTransaksi();
                     }
                    break;
                case 3 :
                    break;
                default :
                    System.out.println("Pilihan yang anda masukkan tidak tersedia");
                            break;
            }
System.out.println("");
System.out.println("Apakah anda ingin melanjutkan");
System.out.println("1.Lanjut\n2.Tidak");
System.out.print("Masukkan pilihanmu : ");
lanjut=input.nextInt();
System.out.println("");                
                }
while(lanjut==1);
    }
}                   