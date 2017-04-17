import java.time.*;

public class NewDatePackageTest {
  public static void main(String[] args) {
    // ---- 下面是关于 Clock 的用法 ----
    // 获取当前 Clock
    Clock clock = Clock.systemUTC();
    // 通过 Clock 获取当前时刻
    System.out.println("当前时刻为：" + clock.instant());
    // 获取 clock 对应的毫秒数，与 System.currentTimeMillis() 输出相同
    System.out.println(clock.millis());
    System.out.println(System.currentTimeMillis());

    // ---- 下面是关于 Duration 的用法 ----
    Duration d = Duration.ofSeconds(6000);
    System.out.println("6000 秒相当于 " + d.toMinutes() + " 分");
    System.out.println("6000 秒相当于 " + d.toHours() + " 小时");
    System.out.println("6000 秒相当于 " + d.toDays() + " 天");
    // 在 clock 基础上增加 6000 秒，返回新的 Clock
    Clock clock2 = Clock.offset(clock, d);
    // 可看到 clock2 与 clock1 相差 1h40min
    System.out.println("当前时刻加 6000 秒为：" + clock2.instant());
    // ---- 下面是关于 Instand 的用法 ----
    // 获取当前时间
    Instant instant = Instant.now();
    System.out.println(instant);
    // instant 添加 6000 秒（即 100 分钟），返回新的 Instant
    Instant instant2 = instant.plusSeconds(6000);
    System.out.println(instant2);
    // 根据字符串中解析 Instant 对象
    Instant instant3 = Instant.parse("2014-02-23T10:12:35.342Z");
    System.out.println(instant3);
    // 在 instant3 的基础上添加 5 小时 4 分钟
    Instant instant4 = instant3.plus(Duration
        .ofHours(5).plusMinutes(4));
    System.out.println(instant4);
    // 获取 instant4 的 5 天以前的时刻
    Instant instant5 = instant4.minus(Duration.ofDays(5));
    System.out.println(instant5);

    // ---- 下面是关于 LocalDate 的用法 ----
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);
    // 获得 2014 年的第 146 天
    localDate = LocalDate.ofYearDay(2014, 146);
    System.out.println(localDate); // 2014-05-26
    localDate = LocalDate.of(2014, Month.MAY, 21);
    System.out.println(localDate);

    // ---- 下面是关于 LocalTime 的用法
    // 获取当前时间
    LocalTime localTime = LocalTime.now();
    // 设置为 22 点 33 分
    localTime = LocalTime.of(22, 33);
    System.out.println(localTime); // 22:33
    // 返回一天中的第 5503 秒
    localTime = LocalTime.ofSecondOfDay(5503);
    System.out.println(localTime);

    // ---- 下面是关于 localDateTime 的用法 ----
    // 获取当前日期、时间
    LocalDateTime localDateTime = LocalDateTime.now();
    // 当前日期、时间加上 25 小时 3 分钟
    LocalDateTime future = localDateTime.plusHours(25).plusMinutes(3);
    System.out.println("当前日期、时间的 25 小时 3 分之后：" + future);

    // ---- 下面是关于 Year, YearMonth, MonthDay 的用法示例 ----
    Year year = Year.now(); // 获取当前的年份
    System.out.println("当前年份：" + year); // 输出当前年份
    year = year.plusYears(5);
    System.out.println("当前年份再过 5 年：" + year);
    // 根据指定月份获取 YearMonth
    YearMonth ym = year.atMonth(10);
  }
}
