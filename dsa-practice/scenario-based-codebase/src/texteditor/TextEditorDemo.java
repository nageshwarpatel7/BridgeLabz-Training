package texteditor;

public class TextEditorDemo {
	public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.insert("Hello", 0);
        editor.insert(" World", 5);
        editor.delete(5, 6);

        editor.undo(); 
        editor.undo(); 
        editor.redo(); 
        editor.redo(); 
    }
}
