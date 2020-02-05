package com.latihan;

public class Main {

    public static void main(String[] args) {
	    String kata1 = "Halo";
	    String kata2;
	    String kata3;
	    String kata4;

        System.out.println("kata1 = " + kata1);
        System.out.println("kata1 index 3 = " + kata1.charAt(3));

        printAddress("kata1",kata1);

        // STRING POOL
        kata2 = kata1; //ngambil kata dari kata1, addressnya sama
        printAddress("kata2",kata2);

        //ngambil kata dari index ke 1, sampe sebelum index ke-3
        kata2 = kata1.substring(1,3);
        printAddress("kata2",kata2);

        //kata3 ga masuk ke STRING POOL karena pake method kayak substring, dll
        kata3 = "C" + kata1.substring(1,4);
        printAddress("kata3",kata3);

        /*kata4 ga ngambil dari kata3 walaupun sama-sama "Calo",
        soalnya kata3 bukan termasuk STRING POOL
         */
        kata4 = "Calo";
        printAddress("kata4",kata4);


        // komparasi
        String makanan1 = "bakwann";
        String makanan2 = "bakwan";
        String makanan3 = "Bakwan";
        System.out.println(makanan1.length());

        if (makanan1.equals(makanan2)){
            System.out.println("sama");
        }
        else{
            System.out.println("beda");
        }

        System.out.println(makanan2.compareTo(makanan3)); //makanan2 > makanan3 sebanyak 32

        if (makanan2.compareTo(makanan3)>0){
            System.out.println(makanan2);
        }
        else{
            System.out.println(makanan3);
        }
    }

    private static void printAddress(String msg, String data){
        int address = System.identityHashCode(data);
        System.out.println(msg + " = " + data + "\t|| " + "address = " + Integer.toHexString(address));
    }
}
