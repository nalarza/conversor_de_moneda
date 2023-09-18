package ConversorDeMonedas;

import javax.swing.*;

public class ConvertirMonedas {
    public void convertirColombianoDolares(double valor){
        double monedaDolar = valor / 3.918;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes $"+ monedaDolar + " Dolares");
    }

    public void convertirColombianoEuro(double valor){
        double monedaEuro = valor / 4.180;
        monedaEuro =(double)    Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null,"Tienes $"+ monedaEuro + " Euros");
    }

    public void convertirColombianolibraesterlina(double valor){
        double monedaSterlina = valor / 4.853;
        monedaSterlina = (double) Math.round(monedaSterlina * 100d) / 100;
        JOptionPane.showMessageDialog(null,"Tienes $"+monedaSterlina+ " Libra Esterlina");
    }
}
