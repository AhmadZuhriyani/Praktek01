/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author Ryan Izuh
 */
public class LaptopAksi {
    public static void main(String[] args) {
        Laptop Ryan = new Laptop();
        Laptop Izuh = new Laptop();
        Laptop Ahmad = new Laptop();
        
        System.out.println("laptop Ryan");
        Ryan.Merek="ASUS"; 
        Ryan.UkuranLayar="14 Inc";
        Ryan.Ram="2 GB";
        Ryan.Procesor="1,8 GHz";
        Ryan.HDD="500 GB";
            Ryan.infoLaptop();
       
        System.out.println("laptop Izuh");
        Izuh.Merek="ACER";
        Izuh.UkuranLayar="16 Inc";
        Izuh.Ram="4 GB";
        Izuh.Procesor="2,4 GHz";
        Izuh.HDD="1 TB";
            Izuh.infoLaptop();
        
        System.out.println("laptop Ahmad");
        Ahmad.Merek="LENOVO";
        Ahmad.UkuranLayar="14 Inc";
        Ahmad.Ram="2 GB";
        Ahmad.Procesor="2,0 GHz";
        Ahmad.HDD="320 GB";
            Ahmad.infoLaptop();            
    }
}
