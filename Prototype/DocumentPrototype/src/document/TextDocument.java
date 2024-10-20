package document;

public class TextDocument implements IDocument {
	
    private String content;

    public TextDocument(String content) {
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
        return new TextDocument(this.content);
    }

    @Override
    public String toString() {
        return "TextDocument: " + content;
    }
}

