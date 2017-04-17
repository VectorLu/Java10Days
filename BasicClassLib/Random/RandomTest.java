import java.util.*;

public class RandomTest {
  public static void main(String[] args) {
    Random rand = new Random();
    // 随机返回 true/false
    System.out.println("rand.nextBoolean: " + rand.nextBoolean());
    byte[] buffer = new byte[16];
    rand.nextBytes(buffer);
    System.out.println(Arrays.toString(buffer));
    // 生成 0.0～1.0 之间的伪随机 double 数
    System.out.println("rand.nextDouble(): " + rand.nextDouble());

    // 生成平均值是 0.0，标准差是 1.0 的伪高斯数
    System.out.println("rand.nextGaussian(): " + rand.nextGaussian());

  }
}
