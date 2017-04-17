import java.util.Arrays;

public class ForEachTest
{
    public static void main(String[] args)
    {
        String[] passwords = {"天王盖地虎", 
        "宝塔镇河妖", "举头望明月", "低头思故乡"};

        String[] shorterBackup = Arrays.copyOf(passwords, passwords.length - 2);
        String[] longerBackup = Arrays.copyOf(passwords, passwords.length + 2);

        for (String password : passwords)
        {
            System.out.println(password);
        }

        System.out.println("----- 我是 乖巧 端庄 严肃 正直 的分隔线1 -----");
        System.out.println(Arrays.toString(passwords));

        System.out.println("----- 我是 乖巧 端庄 严肃 正直 的分隔线2 -----");        
        System.out.println(Arrays.toString(shorterBackup));
        System.out.println("----- 我是 乖巧 端庄 严肃 正直 的分隔线3 -----");        
        System.out.println(Arrays.toString(longerBackup));

        
    }
}