public class GenderTest {
  public static void main(String[] args) {
    // 通过 Enum 的 valueOf() 方法来获取指定枚举类的枚举值
    Gender g = Enum.valueOf(Gender.class, "FEMALE");
    // 直接为枚举值的 name 实例变量赋值
    g.name = "女";
    // 直接访问枚举值的 name 实例变量
    System.out.println(g + " 代表：" + g.name);
  }
}
