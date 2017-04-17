interface Product {
  public double getPrice();
  public String getName();
}

public class AnonymousTest {
  public void test(Product p) {
    System.out.println("购买了一个" + p.getName()
        + "，🌹😄花掉了" + p.getPrice());
  }

  public static void main(String[] args) {
    AnonymousTest ta = new AnonymousTest();
    // 调用 test() 方法时，需要传入一个 Product 参数
    // 此处传入其匿名实现类的实例
    ta.test(new Product() {
      public double getPrice() {
        return 1000.8;
      }
      public String getName() {
        return "GTX 显卡";
      }
    });
  }
}
