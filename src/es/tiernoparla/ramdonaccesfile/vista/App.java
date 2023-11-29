package es.tiernoparla.ramdonaccesfile.vista;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        while(!(a.equals("s") || a.equals("n"))){
            Scanner s=new Scanner(System.in);
            a=sc.nextLine();
        }
    }
}
