/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic10;
import java.util.ArrayList;

/**
 *
 * @author mabdu
 */
public class pelanggan {
    private String nopol;
    private String kendaraan;
    private String servis;
    
    public pelanggan(String nopol, String kendaraan, String servis){
        this.setNopol(nopol);
        this.setKendaraan(kendaraan);
        this.setServis(servis);
    }

    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public String getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(String kendaraan) {
        this.kendaraan = kendaraan;
    }

    public String getServis() {
        return servis;
    }

    public void setServis(String servis) {
        this.servis = servis;
    }
    
    public static void main(String[] args) {
        ArrayList<pelanggan> pelangganBaru = new ArrayList<pelanggan>();
        pelangganBaru.add(new pelanggan("H 5123 GL","Innova","Ganti Oli dan Injektor"));
        pelangganBaru.add(new pelanggan("H 2631 GD","Avanza","Ganti Kampas Rem"));
        pelangganBaru.add(new pelanggan("H 7224 GK","Yaris","Ganti Oli dan Filter Oli"));
        
        for(int i = 0; i < pelangganBaru.size(); i++){
            System.out.println("costumer nomor "+(i+1));
            System.out.println("Nomor Polisi = "+ pelangganBaru.get(i).getNopol());
            System.out.println("Jenis Kendaraan = "+ pelangganBaru.get(i).getKendaraan());
            System.out.println("Jenis Servis = "+ pelangganBaru.get(i).getServis());
        }
    }
}
