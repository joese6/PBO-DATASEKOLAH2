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
public class DataSekolah {
   void Info(){
       System.out.println("Data Sekolah SMK Negeri 9 Malang");
   }
    public static void main(String[]args){
       System.out.println("==================================");
       DataSekolah ds=new DataSekolah();
       ds.Info();
       System.out.println("==================================");
       IdentitasSekolah is=new IdentitasSekolah();
       is.setIdentitasSekolah("20539751","Negeri","SMK","Pemerintah Daerah",
                "2147483647","25 November 2005");
       System.out.println("NPSN : "+is.getNpsn());
       System.out.println("Status: "+is.getStatus());
       System.out.println("Bentuk Pendidikan : "+is.getBentukPendidikan());
       System.out.println("Status Kepemilikan : "+is.getStatusKepemilikan());
       System.out.println("SK Pendirian Sekolah : "+is.getSKPendirianSekolah());
       System.out.println("Tanggal SK Pendirian : "+is.getTglSkPendirian());
        
        //----------------------------
        DataRinci dr=new DataRinci("Sehari penuh (5 h/m)","PLN","6600",
        "Telkom Astinet");
        dr.infoSekolah();
        
        DataPelengkap dp=new DataPelengkap("Tidak",3,0);
        dp.infoSekolah();
    }
}
 