package fatura.util;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PdfReaderUtil {
    public static String pdfExtrairTexto (File file) throws IOException {
        PDDocument document = Loader.loadPDF(file);

        PDFTextStripper stripper = new PDFTextStripper();

        String texto = stripper.getText(document);

        document.close();

        return texto;
    }
}
