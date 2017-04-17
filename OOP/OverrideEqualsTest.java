class Person {
    private String name;
    private String idStr;
    public Person(){;}
    public Person(String name, String idStr) {
        this.name = name;
        this.idStr = idStr;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setIdStr(String idStr) {
        this.name = idStr;
    }
    public String getIdStr() {
        return this.idStr;
    }
    // 重写的 equals()
    public boolean equals(Object obj){
        // 如果为同一个对象
        if (this == obj){
            return true;
        }
        if (obj != null && obj.getClass() == Person.class) {
            Person personObj = (Person)obj;
            // 调用此方法的对象的 idStr 与 obj 对象的 idStr 相等才可判断两对象相等
            if (this.getIdStr().equals(personObj.getIdStr())) {
                return true;
            }
        }
        return false;
    }
}

public class OverrideEqualsTest {
    public static void main(String[] args) {
        Person p1 = new Person("鲁迅", "123");
        Person p2 = new Person("周树人", "123");
        Person p3 = new Person("鲁班", "002");

        // p1 和 p2 的 idStr 相等，所以输出 true
        System.out.println("p1 和 p2 是否相等？" + p1.equals(p2));
        System.out.println("p1 和 p3 是否相等？" + p1.equals(p3));
    }
}
