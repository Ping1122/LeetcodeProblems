import java.util.Queue;
import java.util.LinkedList;

public class MovingAverage346 {

    private int size;
    private Queue<Integer> queue;
    private int sum;

    public MovingAverage346 (int size) {
        this.size = size;
        this.queue = new LinkedList<Integer>();
        this.sum = 0;
    }

    public double next(int val) {
        if (queue.size() == size) {
            sum -= queue.poll();
        }
        queue.offer(val);
        sum += val;
        return ((double)sum) / queue.size();
    }

    public static void main (String[] args) {
        MovingAverage346 m = new MovingAverage346(3);
        System.out.println(m.next(1));
        System.out.println(m.next(10));
        System.out.println(m.next(3));
        System.out.println(m.next(5));
    }
}
