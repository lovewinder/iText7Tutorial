package chapter1;

import java.io.File;
import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class HelloWorld {
    public static final String DEST = "result/chapter01/hello_world.pdf";

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new HelloWorld().createPdf(DEST);

    }

    public void createPdf(String dest) throws FileNotFoundException {
        PdfWriter writer = new PdfWriter(dest);

        PdfDocument pdf = new PdfDocument(writer);

        Document doc = new Document(pdf);

        doc.add(new Paragraph("Hello World!"));

        doc.close();
    }
}
