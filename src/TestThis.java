public class TestThis {
    int a,b,c;

    TestThis(int a,int b){
        this.a=a;
        this.b=b;
    }
    TestThis(int a,int b,int c){
        /*this.a=a;
        this.b=b;
        this.c=c;*/
        this(a,b);
        this.c=c;
    }
    void sing(){

    }
    void Eat(){
        this.sing();
        System.out.println("回家");

    }

    public static void main(String[] args) {
        TestThis h=new TestThis(2,3);
        h.Eat();
    }

}

