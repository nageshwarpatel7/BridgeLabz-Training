package texteditor;

public class TextEditor {
	private StringBuilder content = new StringBuilder();
    private ActionStack undoStack = new ActionStack();
    private ActionStack redoStack = new ActionStack();

    // Insert text at position
    public void insert(String text, int pos) {
        content.insert(pos, text);
        undoStack.push(new Action("insert", text, pos));
        redoStack.clear();
        System.out.println("After insert: " + content);
    }

    // Delete text starting at position with given length
    public void delete(int pos, int length) {
        String deletedText = content.substring(pos, pos + length);
        content.delete(pos, pos + length);
        undoStack.push(new Action("delete", deletedText, pos));
        redoStack.clear();
        System.out.println("After delete: " + content);
    }

    // Undo last action
    public void undo() {
        Action action = undoStack.pop();
        if (action == null) {
            System.out.println("Nothing to undo");
            return;
        }

        if (action.type.equals("insert")) {
            content.delete(action.position, action.position + action.text.length());
        } else if (action.type.equals("delete")) {
            content.insert(action.position, action.text);
        }

        redoStack.push(action);
        System.out.println("After undo: " + content);
    }

    // Redo last undone action
    public void redo() {
        Action action = redoStack.pop();
        if (action == null) {
            System.out.println("Nothing to redo");
            return;
        }

        if (action.type.equals("insert")) {
            content.insert(action.position, action.text);
        } else if (action.type.equals("delete")) {
            content.delete(action.position, action.position + action.text.length());
        }

        undoStack.push(action);
        System.out.println("After redo: " + content);
    }
}
