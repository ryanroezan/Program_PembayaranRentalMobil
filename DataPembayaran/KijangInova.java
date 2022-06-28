package DataPembayaran;
import java.util.Scanner;
//konsep inheritance
//Subclass
public class KijangInova extends HondaJazz {
    //Konsep Constructor
    public KijangInova(String NamaMobil, int HargaSewa){
       super (NamaMobil, HargaSewa);
    }
    //Overriding Method
      public void InputUser(){
        System.out.println("");
        System.out.println("*Memilih Mobil Kijang Inova*");
        System.out.print("Masukkan Nama Anda         : ");
        NamaCustomer=input.nextLine();
        System.out.print("Masukkan Jangka Peminjaman : ");
        jangkaPinjam=input.nextInt();
        System.out.print("Masukkan No. HP            : ");
        NoHp=input.next();
        System.out.print("Masukkan No. KTP           : ");
        NoKTP=input.next();
    }
    //Overriding Method
    public void DetailTransaksi() {
        int TotalHarga = jangkaPinjam*HargaSewa;
        System.out.println("");
        System.out.println("========================================");
        System.out.println("\t   Detail Transaksi");
        System.out.println("----------------------------------------");
        System.out.println("Nama Customer         : "+NamaCustomer);
        System.out.println("Mobil yang dipinjam   : "+NamaMobil);
        System.out.println("Nomor Hp              : "+NoHp);
        System.out.println("Nomor KTP             : "+NoKTP);
        System.out.println("Harga Sewa Mobil      : Rp "+HargaSewa+" X" +jangkaPinjam+" Jangka Pinjam");
        System.out.println("Subtotal Harga Sewa   : Rp "+TotalHarga);
        if (TotalHarga>=200){
            Diskon = TotalHarga*5/100;
            Pesan ="*Selamat Anda Mendapatkan Diskon 10%*";
        }
        else if (TotalHarga>=500){
            Diskon = TotalHarga*20/100;
            Pesan ="*Selamat Anda Mendapatkan Diskon 20%*";
        }
        System.out.println(Pesan);
        System.out.println("Subtotal Diskon       : Rp "+Diskon);
        int TotalPembayaran=TotalHarga-Diskon;
        System.out.println("Total Pembayaran      : Rp "+TotalPembayaran);
        System.out.println("----------------------------------------");
        System.out.println("*Masukkan Jumlah Uang Yang Dibayar*");
        System.out.print("Bayar                 : Rp ");
        Bayar=input.nextInt();
        int Kembalian=Bayar-TotalPembayaran;
        System.out.println("Kembalian             : Rp "+Kembalian);
        System.out.println("Terimakasih Atas Kunjungan Anda Di Rental Kami");
      }
}