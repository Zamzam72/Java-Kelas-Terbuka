package CRUD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {
    protected static long entryPerTahun(String penulis, String tahun) throws IOException {
        FileReader fileReader = new FileReader("database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        long entry = 0;
        String data = bufferedReader.readLine();
        String primaryKey;
        StringTokenizer stringTokenizer;

        while (data!=null){
            stringTokenizer = new StringTokenizer(data,",");
            primaryKey = stringTokenizer.nextToken();
            stringTokenizer = new StringTokenizer(primaryKey,"_");

            penulis = penulis.replaceAll("\\s+","");

            if (penulis.equalsIgnoreCase(stringTokenizer.nextToken()) && tahun.equalsIgnoreCase(stringTokenizer.nextToken())){
                String year = stringTokenizer.nextToken();
                entry = Long.parseLong(year);
            }

            data = bufferedReader.readLine();
        }
        return entry;
    }

    protected static String tahun() {
        Scanner terminalInput = new Scanner(System.in);
        String tahun = terminalInput.nextLine();
        boolean valid = false;

        while (!valid){
            try {
                Year.parse(tahun);
                valid = true;
            } catch (Exception e){
                System.out.print("\nInput tahun salah\nMasukkan tahun : ");
                tahun = terminalInput.nextLine();
                valid = false;
            }
        }

        return tahun;
    }

    static boolean cekBukuDiDatabase(String[] keywords, boolean display) throws IOException{
        FileReader fileReader = new FileReader("database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String data = bufferedReader.readLine();
        boolean exist = false;
        int i=1;

        if (display){
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("| No |\tTahun |\tPenulis              |\tPenerbit             |\tJudul Buku");
            System.out.println("-------------------------------------------------------------------------------");
        }

        while (data!=null){
            exist = true;
            for (String x:keywords){
                exist = exist && data.toLowerCase().contains(x.toLowerCase());
            }

            if (exist){
                if (display){
                    StringTokenizer tokenizer = new StringTokenizer(data,",");

                    tokenizer.nextToken();
                    System.out.printf("| %2d ",i);
                    System.out.printf("|\t%-5s ", tokenizer.nextToken());
                    System.out.printf("|\t%-20s ", tokenizer.nextToken());
                    System.out.printf("|\t%-20s ", tokenizer.nextToken());
                    System.out.printf("|\t%s", tokenizer.nextToken());
                    System.out.println();
                    i++;
                }
                else {
                    break;
                }
            }
            data = bufferedReader.readLine();
        }
        if (display){
            System.out.println("-------------------------------------------------------------------------------");
        }

        return exist;
    }

    public static boolean getYesorNo (String msg){
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUSer;

        System.out.print(msg + " (y/n) ");
        pilihanUSer = terminalInput.next();

        while (!pilihanUSer.equalsIgnoreCase("y") && !pilihanUSer.equalsIgnoreCase("n")){
            System.out.println("\ninput anda bukan y dan n");
            System.out.print(msg + " (y/n) ");
            pilihanUSer = terminalInput.next();
        }

        return pilihanUSer.equalsIgnoreCase("y");
    }

    public static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }
            else {
                System.out.print("\033\143");
            }
        } catch (Exception ex){
            System.err.println("Tidak bisa clear screen");
        }
    }
}
