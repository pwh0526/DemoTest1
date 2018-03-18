public class TestExtends {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name="小明";
        stu.height=172;
        stu.rest();

        Student stu2=new Student("22",44,"benb");
    }
}
class Person{
    String name;
    int height;

    public void rest(){
        System.out.println("休息一会");
    }
}

class Student extends Person{
    String major;

    public void Study(){
        System.out.println("学习两小时");
    }

    public Student(String name,int height,String major){
        this.name=name;
        this.height=height;
        this.major=major;
    }
    public Student(){

    }
}

