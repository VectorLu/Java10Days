public class ScannerKeyBoardTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 只把回车作为分隔符
    sc.useDelimiter("\n");
    while (sc.hasNext())
  }
}