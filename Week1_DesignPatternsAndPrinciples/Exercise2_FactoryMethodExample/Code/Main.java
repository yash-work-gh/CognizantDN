public class Main{
    public static void main(String[] args)
    {
        //Creating a Word document
        DocumentFactory wordFac = new WordDocumentFactory();
        Document word = wordFac.createDocument();
        word.open();

        //Creating a Excel document
        DocumentFactory excelFac = new ExcelDocumentFactory();
        Document excel = excelFac.createDocument();
        excel.open();

        //Creating a Pdf document
        DocumentFactory pdfFac = new PdfDocumentFactory();
        Document pdf = pdfFac.createDocument();
        pdf.open();
    }
}