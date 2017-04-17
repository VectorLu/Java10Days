// 编译时不检查类型引发的异常

import java.util.*;

public class ListErr {
  public static void main(String[] args) {
    // 创建一个只想保存字符串的 List 集合
    List<String> strList = new ArrayList<String>();
    strList.add("第一个字符串");
    strList.add("第二个字符串");
    // 如果把一个 Integer 对象“丢进”了集合
    strList.add(5);
    strList.forEach(str -> System.out.println(((String)str).length()));
  }
}
