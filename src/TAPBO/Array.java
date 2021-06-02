/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAPBO;

/**
 *
 * @author mabdu
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array {
   private String Kendaraan;

    public void setKendaraan(String Kendaraan) {
        this.Kendaraan = Kendaraan;
    }

    public String getKendaraan() {
        return Kendaraan;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int no;

        System.out.println("1. 5000 Kilometer");
        System.out.println("2. 10.000 Kilometer");
        System.out.println("3. 15.000 Kilometer");
        System.out.println("Berapa Kilometer Kendaraan anda : ");
        no = input.nextInt();

        int[] km = {5000, 10000, 15000};

        if(no == 5000){
            System.out.println("pada "+km[0]);
            ArrayList<String> ganti = new ArrayList<> ();
            ganti.add("ganti Oli");
            ganti.add("ganti busi");
            Collections.sort(ganti);
            System.out.println("Service : ");
            System.out.println(ganti);
            }

        else if (no == 10000){
            System.out.println("pada "+km[1]);
            ArrayList<String> ganti = new ArrayList<> ();
            ganti.add("ganti Oli");
            ganti.add("ganti busi");
            ganti.add("Cuci Injector");
            ganti.add("Ganti Filter Oli");
            Collections.sort(ganti);
            System.out.println("Service : ");
            System.out.println(ganti);
        }

        else if (no == 15000){
            System.out.println("pada "+km[2]);
            ArrayList<String> ganti = new ArrayList<> ();
            ganti.add("ganti Oli");
            ganti.add("ganti busi");
            ganti.add("Cuci Injector");
            ganti.add("Ganti Filter Oli");
            ganti.add("Ganti Filter Udara");
            Collections.sort(ganti);
            System.out.println("Service : ");
            System.out.println(ganti);
        }
    }
}
