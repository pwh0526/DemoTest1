public class User {
    int id;
    String name;
    String pwd;
    static String s = "南师大";

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void login() {
        System.out.println("denglu" + name);
    }

    public static void ps() {
        //调用非静态成员，编译就会报错
        System.out.println(s);
    }

    public static void main(String[] args) {
        User U = new User(11, "小米");
        User.ps();
        User.s = "大学";
        User.ps();
    }
}

