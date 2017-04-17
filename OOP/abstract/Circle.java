public class Circle extends Shape {
  private double radius;

  public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  // 重写 Shape 类的计算周长的抽象方法
  public double calPerimeter() {
    return (2 * Math.PI *radius);
  }

  // 重写 Shape 类的返回形状的抽象方法
  public String getType() {
    return getColor() + "圆形";
  }

  public static void main(String[] args) {
    Shape triangle = new Triangle("黒色", 3, 4, 5);
    Shape circle = new Circle("黄色", 3);
    System.out.println(triangle.getType());
    System.out.println(triangle.calPerimeter());
    System.out.println(circle.getType());
    System.out.println(circle.calPerimeter());
  }
}
