package com.mysite.app12141362;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*
 * @author Apriyanto
 */
public class TebakAngka {
    public static void main(String[] args) {
        ArrayList <String> namaPemain = new ArrayList<>();
        ArrayList <Integer> skorPemain = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Random angkaRandom = new Random();
        String cariX;
        do{
            System.out.println("Masukkan Nama anda kemudian tekan enter,atau tekan 'x' untuk keluar = ");
            cariX=input.nextLine();
            namaPemain.add(cariX);
            int Nilai = 0;
            int GameOver=0;
            int akumulasi[]= new int[6];
            int NilaiTebak=0;
            
            if(!("x").equals(cariX)){  
                String nextLevel;
                int Level=1;
                do{
                    int Tebak, Up;
                    System.out.println("# Level " + Level);
                    System.out.println("Selamat datang " + cariX);
                    int NilaiX=Level-1;    
                    Up=Level*100;
                    System.out.println("Silahkan tebak angka antara 1 s/d " + Up);
                    System.out.println("Anda mempunyai kesempatan menebak 5 kali");
                    int AngkaAcak=angkaRandom.nextInt(Up);
                    
                    for(Tebak=0;Tebak<=5;Tebak++){
                        if(Tebak==5){
                            System.out.println("GAMEOVER! Anda Gagal");
                            GameOver++;
                        }
                        else{  
                            System.out.println("Tebakan Anda ? ");
                            int Tebakan=input2.nextInt();
                            int Kurang=4-Tebak;
                            if(Tebakan==AngkaAcak){
                                
                                if(Tebak==0){
                                    NilaiTebak=Level*100;
                                }
                                else if(Tebak==1){
                                    NilaiTebak=Level*70;
                                }
                                else if(Tebak==2){
                                    NilaiTebak=Level*50;
                                }
                                else if(Tebak==3){
                                    NilaiTebak=Level*30;
                                }
                                else{
                                    NilaiTebak=0;
                                }
                                
                                int InTebak=Tebak+1;
                                System.out.println("Selamat Anda berhasil menebak Angka dalam " + InTebak + " kali tebakan. Skor anda adalah " + NilaiTebak);
                                break;

                            }
                            else{ 
                                if(Tebakan>AngkaAcak){
                                    System.out.println("Tebakan Anda terlalu Besar! Anda mempunyai kesempatan " + Kurang + " kali lagi" );
                                }
                                else{

                                    System.out.println("Tebakan Anda terlalu Kecil! Anda mempunyai kesempatan " + Kurang + " kali lagi" );
                                }
                            }
                        }
                    }
                    
