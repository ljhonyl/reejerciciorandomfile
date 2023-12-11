package es.tiernoparla.ramdonaccesfile.modelo.ficheros;

import es.tiernoparla.ramdonaccesfile.modelo.Restaurante;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class FicheroDAO {
    public void escribirFichero(String archivo, Restaurante restaurante){
        File f=new File(archivo);
        try (RandomAccessFile ras = new RandomAccessFile(f, "rw")) {
            long posicion=ras.length();
            ras.seek(posicion);
            StringBuffer sb=new StringBuffer(restaurante.getNombre());
            sb.setLength(40);
            ras.writeBytes(sb.toString());
            ras.writeInt(restaurante.getCP());
            ras.writeDouble(restaurante.getPrecioMedio());
            ras.writeDouble(restaurante.getValoracion());
        }
        catch (Exception e){

        }
        
    }

    public void modificarFichero(String uri, int posicion){
        File f=new File(uri);
        int posicionPuntero=0;
        if(posicion>0 && posicion!=1){
            posicionPuntero=(posicion-1)*60;
        }
        try(RandomAccessFile ras=new RandomAccessFile(f, "rw")) {
            String modificacion;
            ras.seek(posicionPuntero);
            long pos;
            System.out.println(ras.readLine());
            Scanner sc=new Scanner(System.in);
            System.out.println("que deseas modificar? nombre , cp, precio,valoracion");
            String opcion=sc.nextLine();
            switch (opcion) {
                case "nombre":
                    ras.seek(posicionPuntero);
                    Scanner sc1=new Scanner(System.in);
                    System.out.println("escribe la modificacion");
                    modificacion=sc.nextLine();
                    StringBuffer sb=new StringBuffer(modificacion);
                    sb.setLength(40);
                    ras.writeBytes(sb.toString());
                    break;
                case "cp":
                    ras.seek(posicionPuntero+40);
                    System.out.println(ras.readInt());
                    ras.seek(posicionPuntero+40);
                    Scanner sc2=new Scanner(System.in);
                    System.out.println("escribe la modificacion");
                    int mod=sc2.nextInt();
                    ras.writeInt(mod);
                    ras.seek(posicionPuntero+40);
                    System.out.println(ras.readInt());
                    break;
                case "precio":
                    ras.seek(posicionPuntero+44);
                    break;
                case "val":
                    ras.seek(posicionPuntero+52);
                default:
                    break;
            }
        } catch (Exception e) {
        }
    }
}