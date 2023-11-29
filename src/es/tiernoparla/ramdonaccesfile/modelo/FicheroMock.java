package es.tiernoparla.ramdonaccesfile.modelo;

import java.util.ArrayList;
import java.util.List;

public class FicheroMock {
    List<Restaurante> restaurantes;

    public FicheroMock(){
        
    }

    public void iniciarRestaurantes(){
        Restaurante r1=new Restaurante("BugerKing", 28982, 9, 3.5);
        Restaurante r2=new Restaurante("Vips", 28982, 15, 4);
        restaurantes=new ArrayList<>();
    }
}
