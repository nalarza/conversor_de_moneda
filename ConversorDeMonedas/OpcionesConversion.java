package ConversorDeMonedas;

import javax.swing.*;

public class OpcionesConversion {
    ConvertirMonedas monedas = new ConvertirMonedas();

    public void ConvertirMoneda(double valor) {
        String Opcion = JOptionPane.showInputDialog("*** Opciones ***\n" +
                "1. Dolares\n"+
                "2. Euros\n"+
                "3. Libra esterlina\n"+
                "4. Salir");
        switch (Opcion){
            case  "1": monedas.convertirColombianoDolares(valor);
            break;
            case "2": monedas.convertirColombianoEuro(valor);
            break;
            case "3": monedas.convertirColombianolibraesterlina(valor);
            break;
            case "4":break;
        }}}