public class TestPolym {
    /*
     * 测试多态
     * */
    public static void main(String[] args) {
        Animal a = new Animal();
        animalCry(a);


        Dog d=new Dog();
        animalCry(d);

        //自动向上转型，只能调用animal的属性，
      /*  Animal c=new Cat();
        c.eat();*/

        Cat c=new Cat();
        animalCry(c);
        c.Eat();
    }

    static void animalCry(Animal a) {
        a.shout();
    }
}
    class Animal {
        public void shout() {
            System.out.println("叫了一声！");
        }

    }
        class Dog extends Animal{
            public void shout(){
                System.out.println("汪汪！");
            }
        }
        class Cat extends Animal{
            public void shout(){
                System.out.println("喵喵！");
            }
            public void Eat(){
                System.out.println("吃东西");
            }
        }



