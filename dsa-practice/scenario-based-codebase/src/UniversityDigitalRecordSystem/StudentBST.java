package UniversityDigitalRecordSystem;

public class StudentBST {
	private BSTNode root;
	
	public StudentBST() {
		root =null;
	}
	
	public void insert(Student student) {
		root = insertRec(root,student);
	}
	
	private BSTNode insertRec(BSTNode node, Student student) {
		if(node==null) {
			return new BSTNode(student);
		}
		
		if(student.rollNo < node.student.rollNo) {
			node.left = insertRec(node.left, student);
		}
		else if(student.rollNo > node.student.rollNo) {
			node.right = insertRec(node.right, student);
		}
		else {
			System.out.println("Roll number "+student.rollNo+ " already exists.");
		}
		return node;
	}
	
	public Student search(int rollNumber) {
		BSTNode node = searchRec(root,rollNumber);
		return node!=null ? node.student: null;
	}
	
	private BSTNode searchRec(BSTNode node, int rollNumber) {
		if(node==null || node.student.rollNo==rollNumber) {
			return node;
		}
		
		if(rollNumber<node.student.rollNo) return searchRec(node.left, rollNumber);
		else return searchRec(node.right, rollNumber);
	}
	
	public void delete(int rollNumber) {
		root = deleteRec(root, rollNumber);
	}
	
	private BSTNode deleteRec(BSTNode node, int rollNumber) {
        if (node == null) return null;

        if (rollNumber < node.student.rollNo) {
            node.left = deleteRec(node.left, rollNumber);
        } else if (rollNumber > node.student.rollNo) {
            node.right = deleteRec(node.right, rollNumber);
        } else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            BSTNode successor = minValueNode(node.right);
            node.student = successor.student;
            node.right = deleteRec(node.right, successor.student.rollNo);
        }
        return node;
	}
	
	private BSTNode minValueNode(BSTNode node) {
        BSTNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
	
	public void displayInOrder() {
        System.out.println("Students in Sorted Order by Roll Number:");
        inOrderRec(root);
    }

    private void inOrderRec(BSTNode node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.println(node.student);
            inOrderRec(node.right);
        }
    }
}
