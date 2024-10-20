package document;

public class Main {
    public static void main(String[] args) {
    	
        TextDocument textDocument = new TextDocument("Texto original.");
       
        TextDocument clonedTextDocument = (TextDocument) textDocument.clone();
        
       
        clonedTextDocument.setContent("Texto modificado - clone");

       
        System.out.println(textDocument); 
        System.out.println(clonedTextDocument);

        PDFDocument pdfDocument = new PDFDocument("Texto original PDF");
       
        PDFDocument clonedPDFDocument = (PDFDocument) pdfDocument.clone();
        
        clonedPDFDocument.setContent("Texto clonado PDF");

        System.out.println(pdfDocument); 
        System.out.println(clonedPDFDocument); 
    }
}
