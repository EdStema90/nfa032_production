public class Book {
    private String title,autor, editor;

    public String getAutor() {
        return autor;
    }

    public String getEditor() {
        return editor;
    }

    public String getTitle() {
        return title;
    }

    public String titleAutorEditorviewer(){
        String description= this.title +", "+ this.autor+", "+ this.editor + ".";
        return description;
    }

    public Book (String bookTitle, String autorName, String editorName){
        this.title= bookTitle;
        this.autor= autorName;
        this.editor= editorName;
    }
}
