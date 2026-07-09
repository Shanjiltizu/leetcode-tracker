// Last updated: 09/07/2026, 09:51:04
import java.util.*;

class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
        
        // rotate queue to make x the front
        for (int i = 0; i < q.size() - 1; i++) {
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
