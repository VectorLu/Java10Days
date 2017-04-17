package test;

public interface Output {
  // 接口里定义的成员变量只能是常量
  int MAX_CACHE_LINE = 50;

  // 接口里定义的普通方法只能是 public 的抽象方法
  void out();
  void getData(String msg);

  // 在接口中定义默认方法，需要使用 default 修饰
  default void print(String... msgs) {
    for (String msg : msgs) {
      System.out.println(msg);
    }
  }

  static String staticTest() {
    return "接口里的类方法";
  }
}
