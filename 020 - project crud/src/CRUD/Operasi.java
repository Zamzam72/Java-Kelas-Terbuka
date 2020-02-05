package CRUD;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Operasi {
    public static void tampilkanData() throws IOException {
        FileReader fileReader;
        BufferedReader bufferedReader;

        try {
            fileReader = new FileReader("database.txt");
            bufferedReader = new BufferedReader(fileReader);
        } catch (Exception e){
            System.err.println("Data tidak ada\nSilakan tambah data terlebih dahulu");
            tambahData();
            return;
        }

        String data = bufferedReader.readLine();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("| No |\tTahun |\tPenulis              |\tPenerbit             |\tJudul Buku");
        System.out.println("-------------------------------------------------------------------------------");

        for (int i=1; data!=null; i++){
            StringTokenizer tokenizer = new StringTokenizer(data,",");

            tokenizer.nextToken();
            System.out.printf("| %2d ",i);
            System.out.printf("|\t%-5s ", tokenizer.nextToken());
            System.out.printf("|\t%-20s ", tokenizer.nextToken());
            System.out.printf("|\t%-20s ", tokenizer.nextToken());
            System.out.printf("|\t%s", tokenizer.nextToken());
            System.out.println();

            data = bufferedReader.readLine();
        }
        System.out.println("-------------------------------------------------------------------------------");

        bufferedReader.close();
        fileReader.close();
    }

    public static void updateData() throws IOException {
        File database = new File("database.txt");
        FileReader fileReader = new FileReader(database);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        File tempDB = new File("tempDB.txt");
        FileWriter fileWriter = new FileWriter(tempDB);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        tampilkanData();

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukkan nomor yang akan diubah: ");
        int updateNum = terminalInput.nextInt();

        String data = bufferedReader.readLine();
        int counts = 0;

        while (data !=null){
            counts++;

            StringTokenizer st = new StringTokenizer(data,",");

            if (counts == updateNum){
                System.out.println("\nData yang ingin anda ubah adalah:");
                System.out.println("-----------------------------------");
                st.nextToken();
                System.out.println("Tahun           : " + st.nextToken());
                System.out.println("Penulis         : " + st.nextToken());
                System.out.println("Penerbit        : " + st.nextToken());
                System.out.println("Judul           : " + st.nextToken());

                boolean isUpdate;
                String[] fieldData = {"tahun","penulis","penerbit","judul"};
                String[] tempData = new String[4];
                String originalData;

                st = new StringTokenizer(data,",");
                originalData = st.nextToken();

                for (int i=0; i<fieldData.length; i++){
                    isUpdate = Utility.getYesorNo("apakah ingin merubah " + fieldData[i]);

                    originalData = st.nextToken();

                    if (isUpdate){
                        System.out.print("Masukkan " + fieldData[i] + " baru: ");
                        if (fieldData[i].equalsIgnoreCase("tahun")){
                            tempData[i] = Utility.tahun();
                        }
                        else {
                            terminalInput = new Scanner(System.in);
                            tempData[i] = terminalInput.nextLine();
                        }
                    }
                    else {
                        tempData[i] = originalData;
                    }
                    System.out.println();
                }

                st = new StringTokenizer(data,",");

                System.out.println("\nData yang ingin anda ubah adalah:");
                System.out.println("-----------------------------------");
                st.nextToken();
                System.out.println("Tahun           : " + st.nextToken() + " ---> " + tempData[0]);
                System.out.println("Penulis         : " + st.nextToken() + " ---> " + tempData[1]);
                System.out.println("Penerbit        : " + st.nextToken() + " ---> " + tempData[2]);
                System.out.println("Judul           : " + st.nextToken() + " ---> " + tempData[3]);

                isUpdate = Utility.getYesorNo("Apakah yakin ingin melakukan update");

                if (isUpdate){
                    boolean exist = Utility.cekBukuDiDatabase(tempData,false);{

                        if (exist){
                            System.out.println("Data yang anda ubah sudah ada, silakan ganti data");
                        }
                        else {
                            String tahun = tempData[0];
                            String penulis = tempData[1];
                            String penerbit = tempData[2];
                            String judul = tempData[3];

                            long entry = Utility.entryPerTahun(penulis,tahun);
                            String tanpaSpasi = penulis.replaceAll("\\s+","");
                            String primaryKey = tanpaSpasi + "_" + tahun + "_" + entry;

                            bufferedWriter.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                        }
                    }
                } else  {
                    bufferedWriter.write(data);
                }
            }
            else {
                bufferedWriter.write(data);
            }
            bufferedWriter.newLine();
            data = bufferedReader.readLine();
        }
        bufferedWriter.flush();

        bufferedReader.close();
        fileReader.close();

        bufferedWriter.close();
        fileWriter.close();

        System.gc();

        database.delete();
        tempDB.renameTo(database);
    }

    public static void hapusData() throws IOException{
        File fileInput = new File("database.txt");
        FileReader fileReader = new FileReader(fileInput);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        File fileOutput = new File("tempDB.txt");
        FileWriter fileWriter = new FileWriter(fileOutput);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        tampilkanData();

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Nomor yang ingin dihapus : ");
        int entry = terminalInput.nextInt();

        String data = bufferedReader.readLine();
        int counts = 0;
        boolean isDelete = false;
        boolean isFound = false;

        while (data != null){
            counts++;
            isDelete = false;

            StringTokenizer st = new StringTokenizer(data,",");

            if (counts == entry){
                System.out.println("\nData yang ingin anda hapus adalah:");
                System.out.println("-----------------------------------");
                System.out.println("Referensi       : " + st.nextToken());
                System.out.println("Tahun           : " + st.nextToken());
                System.out.println("Penulis         : " + st.nextToken());
                System.out.println("Penerbit        : " + st.nextToken());
                System.out.println("Judul           : " + st.nextToken());

                isDelete = Utility.getYesorNo("Ingin menghapus data");
                isFound = true;
            }

            if (isDelete){
                System.out.println("Data berhasil dihapus");
            }
            else {
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }

            data = bufferedReader.readLine();
        }

        if (!isFound){
            System.out.println("Data tidak ditemukan");
        }
        bufferedWriter.flush();

        bufferedReader.close();
        fileReader.close();

        bufferedWriter.close();
        fileWriter.close();

        System.gc();

        fileInput.delete();
        fileOutput.renameTo(fileInput);
    }

    public static void cariData() throws IOException {

        try {
            File file = new File("database.txt");
        } catch (Exception e){
            System.err.println("Data tidak ada\nSilakan tambah data terlebih dahulu");
            tambahData();
            return;
        }

        Scanner terminalInput = new Scanner(System.in);
        String data;

        System.out.print("Masukkan data yang ingin dicari : ");
        data = terminalInput.nextLine();

        String[] keywords = data.split("\\s+"); // kalo pake StringTokenizer aku bingung wkkw

        Utility.cekBukuDiDatabase(keywords, true);
    }

    public static void tambahData() throws IOException {

        FileWriter fileWriter = new FileWriter("database.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String penulis, penerbit, tahun, judul;
        Scanner terminalInput = new Scanner(System.in);

        System.out.print("Masukkan Judul : ");
        judul = terminalInput.nextLine();
        System.out.print("Masukkan Penulis : ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukkan Penerbit : ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukkan Tahun : ");
        tahun = Utility.tahun();

        String[] key = {tahun + "," + penulis + "," + penerbit + "," + judul};

        boolean exist = Utility.cekBukuDiDatabase(key, false);

        if (!exist){
            long entry = Utility.entryPerTahun(penulis,tahun) + 1;

            String tanpaSpasi = penulis.replaceAll("\\s+","");
            String primaryKey = tanpaSpasi + "_" + tahun + "_" + entry;

            System.out.println("\nAnda akan menambah data sebagai berikut");
            System.out.println("--------------------------------------------");

            System.out.println("Entry    : " + primaryKey);
            System.out.println("Judul    : " + judul);
            System.out.println("Penulis  : " + penulis);
            System.out.println("Penerbit : " + penerbit);
            System.out.println("Tahun    : " + tahun);

            boolean verify = Utility.getYesorNo("input");
            System.out.println();

            if (verify){
                bufferedWriter.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }
        else {
            System.out.println("\nData sudah ada");
            Utility.cekBukuDiDatabase(key, true);
        }

        bufferedWriter.close();
    }
}
