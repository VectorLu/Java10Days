import java.util.*;

public class EnumSetSameEnum {
  public static void main(String[] args) {
    Collection c = new HashSet();
    c.clear();
    c.add(Season.FALL);
    c.add(Season.SPRING);
    // 复制 Collection 集合中所有元素来创建 EnumSet 集合
    EnumSet enumSet = EnumSet.copyOf(c);
    System.out.println(enumSet);
    c.add("一行白鹭上青天");
    c.add("独钓寒江雪");
    // 由于 c 集合里的元素不是全部都为枚举值
    enumSet = EnumSet.copyOf(c);
  }
}
