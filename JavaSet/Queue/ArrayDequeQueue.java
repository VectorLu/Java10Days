import java.util.*;

public class ArrayDequeQueue {
  public static void main(String[] args) {
    ArrayDeque queue = new ArrayDeque();
    // 依次将 3 个元素加入队列
    queue.offer("1");
    queue.offer("2");
    queue.offer("3");

    // 输出：[1, 2, 3]
    System.out.println(queue);

    // 输出：1
    System.out.println(queue.peek());

    System.out.println(queue);

    // 输出：1
    System.out.println(queue.poll());

    // 输出：[2, 3]
    System.out.println(queue);
  }
}
