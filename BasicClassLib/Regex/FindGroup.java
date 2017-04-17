import java.util.regex.*;

public class FindGroup {
  public static void main(String[] args) {
    // 使用字符串模拟从网络上得到的网页源码
    String str = "我想求购一本《双城记》，尽快联系我 13667888888"
        + "交朋友，电话号码是 13612345678"
        + "出售XXX，联系方式 15812312312";

    // 创建一个 Pattern 对象，并用它建立一个 Matcher 对象
    // 该正则表达式只抓取 13X 和 15X 段的手机号
    Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}")
        .matcher(str);
    // 将所有符合正则表达式的子串全部输出
    while (m.find()) {
      System.out.println(m.group());
    }
  }
}
