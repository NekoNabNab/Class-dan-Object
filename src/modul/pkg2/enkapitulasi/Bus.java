/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg2.enkapitulasi;

/**
 *
 * @author nabil
 */
public class Bus {
    private int penumpang,maxpenumpang,counter;
    
    // konstruktor
    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    
    //method mutator 
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            counter+=1;
            this.penumpang=temp;
        }
        
    }
    public void getaverage(){
        System.out.println("Penumpang rata-rata adalah = " + (penumpang/counter));
    }
    public void cetak(){
        System.out.println("Penumpang sekarang          = "+penumpang);
        System.out.println("penumpang seharusnya adalah = "+maxpenumpang);
    }
}
