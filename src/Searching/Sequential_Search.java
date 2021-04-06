package Searching;

import java.util.Scanner;

public class Sequential_Search {
    public static void main(String[] args) {
        System.out.println("\t***** SEQUENTIAL SEARCH *****\n");
        String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Rian", "Tesla"};
        String key;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Data Yang Akan Dicari : ");
        key = input.nextLine();
        
        System.out.print("Isi Data Adalah : ");
        for (String data1 : data) {
            System.out.print(data1 + " ");
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i<data.length; i++){
            if (key.equalsIgnoreCase(data[i])){
                System.out.print("Data " + key + " Berada di Indeks ke-" +i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println();
        System.out.println("***** Rian Syaputra *****");
    }    
}