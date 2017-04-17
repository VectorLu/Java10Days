public class RandomStr
{
    public static void main(String[] args)
    {
        // 定义一个空字符串
        String result = "";
        
        for (int i = 0; i < 6; i++)
        {
            // 生成 97-122 之间的 int 类型整数
            int intVal = (int)(Math.random()*26 + 97);
            // 强制转换为 char 类型后连接到 result 后面
            result = result + (char)intVal;
        }
        System.out.println(result);
    }
}