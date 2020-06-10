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
public class DataRinci extends IdentitasSekolah{
    protected String waktu_penyelenggaraan;
    protected String sumber_listrik;
    protected String daya_listrik;
    protected String akses_internet;
    
    public DataRinci(){
        
    }
    public DataRinci(String waktu_penyelenggaraan,String sumber_listrik,
        String daya_listrik,String akses_internet){
        this.waktu_penyelenggaraan=waktu_penyelenggaraan;
        this.sumber_listrik=sumber_listrik;
        this.daya_listrik=daya_listrik;
        this.akses_internet=akses_internet;
    }
    
    @Override
    public void infoSekolah(){
        System.out.println("");
        System.out.println("==================================");
        System.out.println("Data Rinci");
        System.out.println("==================================");
        System.out.println("Waktu Penyelenggaraan : "+
                this.waktu_penyelenggaraan);
        System.out.println("Sumber Listrik : "+this.sumber_listrik);
        System.out.println("Daya Listrik : "+this.daya_listrik);
        System.out.println("Akses Internet : "+this.akses_internet);
        System.out.println("----------------------------");
    }
}
