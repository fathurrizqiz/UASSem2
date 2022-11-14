import java.util.Scanner;

public class jawabannomer3


 {
    public static void main(String[] args) {
        int plat = 5;
        String[] infoplat = new String[]{"k-kudus", "B-jakarta", "AB-yogyakarta", "T-karawang", "AD-solo"};
        int totalplat = 55;
        String[] kudus = new String[9];
        String[] jakarta = new String[10];
        String[] jogja = new String[13];
        String[] karawang = new String[14];
        String[] solo = new String[15];

        int totalkudus = 0;
        int sisamobile = 0;
        for (int index = 0; index < kudus.length; index++) {
            if (kudus[index] != null) ;
            totalkudus++;
        }
        int totaljakarta = 0;
        for (int index = 0; index < jakarta.length; index++) {
            if (jakarta[index] != null) ;
            totaljakarta++;
        }
        int totaljogja = 0;
        for (int index = 0; index < jogja.length; index++) {
            if (jogja[index] != null) ;
            totaljogja++;
        }
        int totalkarawang = 0;
        for (int index = 0; index < karawang.length; index++) {
            if (karawang[index] != null) ;
            totalkarawang++;
        }
        int totalsolo = 0;
        for (int index = 0; index < solo.length; index++) {
            if (solo[index] != null) ;
            totalsolo++;
        }
        sisamobile = totalkarawang - totaljakarta - totaljogja - totalkudus - totalsolo;
        System.out.println("total dari plat mobil kudus :" + totalkudus + "total dari plat mobil jakarta:" + totaljakarta +
                "total dari plat mobil jogja: " + totaljogja + "total dari plat mobil karawang" + totalkarawang + "total dari mobil solo :" +
                totalsolo);
        System.out.println("jumlah seluruh mobil" + "total seluruh mobile " + totalplat);
        System.out.println();


        // bagian B
        Scanner user = new Scanner(System.in);
        System.out.println("masukan plat nomor kendaraan");
        System.out.println("masukan code lokasi");
        String lokasi = user.nextLine();
        int nomor = user.nextInt();
        System.out.println("masukan plat nomor kendaraan");

        switch (lokasi) {
            case "K":
                System.out.println("plat nomor kudus");
                break;
            case "B":
                System.out.println("plat nomor jakarta");
                break;
            case "AB":
                System.out.println("plat nomor jogja");
                break;
            case "T":
                System.out.println("plat nomor karawang");
                break;
            case "AD":
                System.out.println("plat nomor solo");
                break;
            default:
                System.out.println("nomor krndaraan yang anda masukan salah");


                if (nomor % 2 == 0) {
                    System.out.println("ini adalah plat nomor genap");
                } else {
                    System.out.println("ini adalah plat nomor ganjil");

                }
        }

    }
}

