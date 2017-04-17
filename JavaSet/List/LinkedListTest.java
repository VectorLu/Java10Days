import java.util.*;

public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList books = new LinkedList();
    books.offer("队列最先添加的元素");
    books.push("第一个进栈的元素");
    books.offerFirst("后来添加到队列头部的元素1");

    // 以 List 的方式，按照索引遍历集合元素
    for (int i = 0 ; i < books.size() ; i++) {
      System.out.println("遍历中：" + books.get(i));
    }
    // 访问、并不删除栈顶元素
    System.out.println(books.peekFirst());
    // 访问、不删除队列的最后一个元素
    System.out.println(books.peekLast());
    // 将栈顶元素弹出“栈”
    System.out.println(books.pop());
    // 下面输出将看到队列中第一个元素被删除
    System.out.println(books);
    // 访问、并删除队列的最后一个元素
    System.out.println(books.pollLast());
    System.out.println(books);
  }
}
