/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diklatpbo.tugaspraktik;

/**
 *
 * @author Mas Johan
 */
public class DataPelengkap extends IdentitasSekolah{
    protected String kebutuhan_khusus_dilayani;
    protected int luas_tanah_milik;
    protected int luas_tanah_bukan_milik;
    
    public DataPelengkap(){
        
    }
    public DataPelengkap(String kebutuhan_khusus_dilayani,int luas_tanah_milik,
        int luas_tanah_bukan_milik){
       
        this.kebutuhan_khusus_dilayani=kebutuhan_khusus_dilayani;
        this.luas_tanah_milik=luas_tanah_milik;
        this.luas_tanah_bukan_milik=luas_tanah_bukan_milik;
    }
   
    @Override
    public void infoSekolah(){
        System.out.println("");
        System.out.println("==================================");
        System.out.println("Data Pelengkap");
        System.out.println("==================================");
        System.out.println("Kebutuhan Khusus Dilayani : "+
                this.kebutuhan_khusus_dilayani);
        System.out.println("Luas Tanah Milik : "+this.luas_tanah_milik);
        System.out.println("Luas Tanah Bukan Milik : "+
                this.luas_tanah_bukan_milik);
        System.out.println("----------------------------");
    }
}
