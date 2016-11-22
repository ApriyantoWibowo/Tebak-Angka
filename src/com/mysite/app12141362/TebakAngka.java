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
