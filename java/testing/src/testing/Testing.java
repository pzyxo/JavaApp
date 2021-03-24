/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.util.Scanner;

/**
 *
 * @author Pzyxo
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  System.out.println("Silakan masukkan jumlah deret bilangan yang akan diinginkan: ");
  int jumlahBilanganPrima = input.nextInt();
  
  System.out.println("Silakan masukkan jumlah baris yang akan diinginkan: ");
  int baris = input.nextInt();
  
  System.out.println(jumlahBilanganPrima + " bilangan prima pertama adalah: ");
  
  
  int hitung = 0; //menghitung jumlah bilangan prima
  int angka = 2; //angka untuk menguji blangan prima
  
  //Perulangan dilakukan untuk mencari bilangan prima
  while(hitung < jumlahBilanganPrima){
   
   //set boolean prima ke true
   boolean prima = true;
   
   for(int pembagi = 2; pembagi <= angka / 2; pembagi++){
    
    if (angka % pembagi == 0){
     prima = false;//set prima ke false
     break;//keluar dari loop
    }
    
   }
   
   if(prima){
    
    hitung++;
    
    
    bilanganP += String.valueOf(angka);
 
    
   }
   //Cek bila angka adalah bilangan prima
   angka++;
  }
 
  
 }
 
    
}
