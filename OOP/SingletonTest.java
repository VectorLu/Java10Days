class Singleton {
// 使用一个类变量来缓存曾经创建的实例
private static Singleton instance;
// 将构造器使用 private 修饰，隐藏该构造器
private Singleton() {
}

// 提供一个静态方法，用于返回 Singleton 实例
// 该方法可以加入自定义的控制，保证只产生一个 Singleton 对象
public static Singleton getInstance() {
        if (instance == null) {
                // 创建一个 Singleton 对象，并将其缓存起来
                instance = new Singleton();
        }
        return instance;
}
}
public class SingletonTest {
public static void main(String[] args) {
        // 不能通过构造器创建 Singleton 对象
        // 只能通过 getInstance() 创建一个实例
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        // 将输出 true
        System.out.println(s1 == s2);
}
}
