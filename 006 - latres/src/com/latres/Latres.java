package com.latres;

import java.util.*;

public class Latres {

    public static void main(String[] args) {
        int pilih;

        Scanner UserInput = new Scanner(System.in);
        Latres UserVoid = new Latres();
        UserVoid.login();

        do {
            System.out.println("=============MENU");
            System.out.println("1. Input Nilai Mahasiswa");
            System.out.println("2. Tambah Data");
            System.out.print("3. Lihat Data\nPilih :");
            pilih = UserInput.nextInt();

            switch (pilih){
                case 1 :
                    UserVoid.Input();
                    break;
                case 2 :
                    UserVoid.Tambah();
                    break;
                case 3 :
                    UserVoid.Lihat();
                    break;

                    default:
                        System.out.println("Input Anda salah");
            }
        } while (true);
    }

    private void login() {
        String Us, Pw;
        Scanner UserInput = new Scanner(System.in);
        do {
            System.out.println("=============LOGIN");
            System.out.print("Username    : ");
            Us = UserInput.next();
            System.out.print("Password    : ");
            Pw = UserInput.next();

            if (!Us.equals("allyandaru") || !Pw.equals("123qwe")) {
                System.out.println("Gagal Login");
            } else {
                System.out.println("Berhasil Login");
            }
        } while (!Us.equals("allyandaru") || !Pw.equals("123qwe"));
    }

    private void Input(){

    }

    private void Tambah(){

    }

    private void Lihat(){

    }
}
