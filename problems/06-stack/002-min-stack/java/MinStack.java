import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    private final Deque<Integer> values = new ArrayDeque<>();
    private final Deque<Integer> minimums = new ArrayDeque<>();

    public void push(int val) {
        values.push(val);

        if (minimums.isEmpty() || val <= minimums.peek()) {
            minimums.push(val);
        }
    }

    public void pop() {
        int removed = values.pop();

        if (removed == minimums.peek()) {
            minimums.pop();
        }
    }

    public int top() {
        return values.peek();
    }

    public int getMin() {
        return minimums.peek();
    }
}
