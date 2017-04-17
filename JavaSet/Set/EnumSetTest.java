import java.util.*;

enum Season {
  SPRING, SUMMER, FALL, WINTER
}

public class EnumSetTest {
  public static void main(String[] args) {
    // 创建一个 EnumSet 集合，集合元素就是 Season 枚举类的全部枚举值
    EnumSet es1 = EnumSet.allOf(Season.class);
    System.out.println(es1);
    // 创建一个 EnumSet 空集合，指定其集合元素是 Season 类的枚举值
    EnumSet es2 = EnumSet.noneOf(Season.class);
    System.out.println(es2); // 输出 []
    // 手动添加两个元素
    es2.add(Season.WINTER);
    es2.add(Season.SPRING);
    System.out.println(es2);
    // 以指定枚举值创建 EnumSet 集合
    EnumSet es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
    System.out.println(es3); // 输出 [SUMMER,WINTER]
    EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
    System.out.println(es4); // 输出 [SUMMER,FALL,WINTER]
    // 新创建的 EnumSet 集合的元素和 es4 集合的元素有相同类型，
    // es5 集合元素 + es4 集合元素 = Season 枚举类的全部枚举值
    EnumSet es5 = EnumSet.complementOf(es4);
    System.out.println(es5); // 输出 [SPRING]
  }
}
