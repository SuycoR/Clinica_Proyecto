package Facturación_Data;

/**
 *
 * @author Tutur
 */
// ConvertidorNumeroTexto.java
public class ConvertidorNumeroTexto {

    // Arrays para las conversiones
    private static final String[] UNIDADES = {"", "UN", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE"};
    private static final String[] DECENAS = {"", "DIEZ", "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA", "SETENTA", "OCHENTA", "NOVENTA"};
    private static final String[] DIEZ_A_DIECINUEVE = {"DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE"};
    private static final String[] CENTENAS = {"", "CIENTO", "DOSCIENTOS", "TRESCIENTOS", "CUATROCIENTOS", "QUINIENTOS", "SEISCIENTOS", "SETECIENTOS", "OCHOCIENTOS", "NOVECIENTOS"};
    private static final String[] MIL = {"", "MIL", "MILLON", "MILLONES"};

    public static String convertirNumeroATexto(double numero) {
        // Obtener la parte entera y decimal del número
        long parteEntera = (long) numero;
        int parteDecimal = (int) Math.round((numero - parteEntera) * 100);

        // Convertir la parte entera a texto
        String parteEnteraTexto = convertirParteEntera(parteEntera);

        // Convertir la parte decimal a texto
        String parteDecimalTexto = parteDecimal > 0 ? " CON " + parteDecimal + "/100" : " CON 00/100";

        // Construir el texto completo
        return parteEnteraTexto + parteDecimalTexto + " SOLES";
    }

    private static String convertirParteEntera(long numero) {
        if (numero == 0) {
            return "CERO";
        }

        String palabras = "";
        int contador = 0;

        while (numero > 0) {
            int fragmento = (int) (numero % 1000);
            if (fragmento != 0) {
                String palabrasFragmento = convertirFragmento(fragmento);
                palabras = palabrasFragmento + " " + MIL[contador] + " " + palabras;
            }
            numero /= 1000;
            contador++;
        }

        return palabras.trim();
    }

    private static String convertirFragmento(int numero) {
        if (numero < 10) {
            return UNIDADES[numero];
        } else if (numero < 20) {
            return DIEZ_A_DIECINUEVE[numero - 10];
        } else if (numero < 100) {
            int unidades = numero % 10;
            int decenas = numero / 10;
            return DECENAS[decenas] + " " + UNIDADES[unidades];
        } else {
            int unidades = numero % 10;
            int decenas = (numero % 100) / 10;
            int centenas = numero / 100;
            return CENTENAS[centenas] + " " + DECENAS[decenas] + " " + UNIDADES[unidades];
        }
    }
}
