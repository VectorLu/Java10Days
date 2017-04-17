interface Eatable {
  void taste();
}

interface Flyalbe {
  void fly(String weather);
}

interface Multipliable {
  int multiply(int a, int b);
}

public class LambdasShow {
  public void eat(Eatable e) {
    System.out.println(e);
    e.taste();
  }

  public void fly(Flyalbe f) {
    System.out.println("I'm flying: " + f);
    f.fly("[sunny]");
  }

  public void multiply(Multipliable multi) {
    System.out.println("5 x 3 = " + multi.multiply(5, 3));
  }

  public static void main(String[] args) {
    LambdasShow ls = new LambdasShow();

    // Lambda 表达式的代码块只有一条语句，可以省略花括号。
    ls.eat(()-> System.out.println("This apple tastes good!"));

    // Lambda 表达式的形参列表只有一个形参，省略圆括号
    ls.fly(weather -> {
      System.out.println("It is " + weather + " today.");
      System.out.println("The helicopter condition is good");
    });

    // Lambda 表达式的代码块只有一条语句，省略花括号
    // 代码块中只有一条语句，即使该表达式需要返回值，也可以省略 return
    ls.multiply((a, b)->a * b);
  }
}
