import java.util.*;

public class TimeZoneTest {
  public static void main(String[] args) {
    // 取得 Java 所支持的所有时区 ID
    String[] ids = TimeZone.getAvailableIDs();
    System.out.println(Arrays.toString(ids));

    TimeZone my = TimeZone.getDefault();
    // 获取默认时区的 ID: Asia/Shanghai
    System.out.println(my.getID());
    // 获取系统默认时区的名称：中国标准时间
    System.out.println(my.getDisplayName());
    // 获取指定 ID 的时区的名称：纽芬兰标准时间
    System.out.println(TimeZone
        .getTimeZone("CNT").getDisplayName());
  }
}
