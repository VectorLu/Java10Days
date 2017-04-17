// failed on mac

public class AppTest {
  public static void main(String[] args)
      throws Exception {
    Runtime rt = Runtime.getRuntime();
    // 运行某个程序
    rt.exec("~/Applications/Safari.app");
  }
}
