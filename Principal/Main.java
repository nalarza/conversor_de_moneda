package Principal;

import ConversorDeMonedas.OpcionesConversion;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        OpcionesConversion conversion = new OpcionesConversion();

        while(true){
            String opciones = JOptionPane.showInputDialog(null,"seleccione una opcion",
                    "menu", JOptionPane.PLAIN_MESSAGE,null,new Object[]{"conversor de monedas","conversor de tmperatura}"
                            },"elejir").toString();
            switch (opciones){
                case "conversor de monedas":
                    String input = JOptionPane.showInputDialog(null, "ingrese valor a convertir");
                    double valorRecibido = Double.parseDouble(input);
                    conversion.ConvertirMoneda(valorRecibido);
            }
        }
    }
}
