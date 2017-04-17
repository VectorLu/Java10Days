public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        // print Java™
        System.out.println("Java\u2122");

        String str = true + "";
        System.out.println(str);
        System.out.println(true);
        
        String a = "45";
        // 使用 Integer 的方法将一个字符串转换成 int 类型
        int iValue = Integer.parseInt(a);
    }
}