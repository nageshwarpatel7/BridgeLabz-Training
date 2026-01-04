package stacksandqueue.stack;

public class Main {
    public static void main(String[] args) {
        
        Stack stack = new Stack();
        
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(0);
        stack.push(2);
        
        Stack sorted = sort(stack);
        
        System.out.println("Stack after sorting: ");
        
        while(!sorted.isEmpty()){
            System.out.print(sorted.pop().data + " ");
        }
    }
    
    public static Stack sort(Stack s) {
        Stack ans = new Stack();
        
        while(!s.isEmpty()) {
            int n = s.pop().data;
            
            while(!ans.isEmpty() && n < ans.peek()) {
                s.push(ans.pop().data);
            }
            ans.push(n);
        }
        return ans;
    }
}