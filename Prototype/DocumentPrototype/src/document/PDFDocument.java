package document;

public class PDFDocument implements IDocument {
	
    private String content;

    public PDFDocument(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public IDocument clone() {
        return new PDFDocument(this.content);
    }

    @Override
    public String toString() {
        return "PDFDocument: " + content;
    }
}

