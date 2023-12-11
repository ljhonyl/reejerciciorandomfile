package es.tiernoparla.ramdonaccesfile.vista;

import java.util.Scanner;

import es.tiernoparla.ramdonaccesfile.modelo.Restaurante;
import es.tiernoparla.ramdonaccesfile.modelo.ficheros.FicheroDAO;

public class App {
    public static void main(String[] args) throws Exception {
        FicheroDAO fdao=new FicheroDAO();
        fdao.modificarFichero("restaurantes.txt", 1);
    }
}
