import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidanagan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidanagan("Susu Sapi");
        breakfast.setkonsumsi(roti, susu);
        listKonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidanagan("Nasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidanagan("Air Putih");
        lunch.setkonsumsi(nasi, air);
        listKonsumsi.add(lunch);

        System.out.println("Menu Konsumsi");
        for (Konsumsi<Makanan, Minuman> Konsumsi: listKonsumsi){
            Makanan makanan = Konsumsi.getM();
            Minuman minuman = Konsumsi.getI();

            System.out.println(makanan.Disantap());
            System.out.println(minuman.Disantap());
        }
    }

}