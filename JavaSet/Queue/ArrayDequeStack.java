import java.util.*;

public class ArrayDequeStack {
  public static void main(String[] args) {
    ArrayDeque stack = new ArrayDeque();
    stack.push("1");
    stack.push("2");
    stack.push("3");
    // 输出：[3, 2, 1]
    System.out.println(stack);
    // 访问第一个元素，但并不将其 pop 出“栈”，输出：3
    System.out.println(stack.peek());
    // 依然输出：[3, 2, 1]
    System.out.println(stack);
    // pop 出 3
    System.out.println(stack.pop());
    // 输出 [2, 1]
    System.out.println(stack);
  }
}
