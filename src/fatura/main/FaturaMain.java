package fatura.main;

import fatura.util.PdfReaderUtil;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FaturaMain {
    static void main() throws IOException {
        try {
            File arquivo = new File("C:/Java.Projetos/Java.Projetos.Alura/Fatura/FaturaClientes/2026.01 - UB 2 57233442.pdf");

            PDDocument document = Loader.loadPDF(arquivo, "08934");

            PDFTextStripper stripper = new PDFTextStripper();



            String texto = stripper.getText(document);

            ArrayList<String> linhasCorrigidas = new ArrayList<>();

            // split: Divide a String utilizando um separador (regex).  Ou seja, transforma "linha1\nlinha2\nlinha3"
            /* Em um array
                linhas[0] = "linha1"
                linha[1] = "linha2"
                linha[2] = "linha3"
             */
            String[] linhas = texto.split("\n");

            String acumulador = "";

            for (String linha : linhas) {
                
                // metodo trim remove os espaços no começo e no final
                linha = linha.trim();

                // verifica se a linha esta vazia, se sim manter a próxima iteracao do for
                if(linha.isEmpty()) continue;

                acumulador += " " + linha;

                if (linha.contains("kWh")) {
                    linhasCorrigidas.add(acumulador.trim());
                    acumulador = " ";
                }
            }

            for (String linha : linhasCorrigidas) {
                System.out.println(linha);
            }

            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
