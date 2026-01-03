package linkedlist.studentrecordmanagement;

public class Main {
	public static void main(String[] args) {
    	LinkedList list = new LinkedList();
    	list.addStudent("Lucky",22 ,101, "A");
    	list.addStudent("Nageshwar", 26, 102, "A");
    	list.atPosition("Himesh", 203, 103, "A", 1);
    	
    	list.updateGrade(102, "A");
    	list.displayAll();
    }
}
