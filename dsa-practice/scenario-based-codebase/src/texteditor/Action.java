package texteditor;

public class Action {
	public String type; // "insert" or "delete"
    public String text; // text inserted or deleted
    public int position; // position in the document

    public Action(String type, String text, int position) {
        this.type = type;
        this.text = text;
        this.position = position;
    }
}
