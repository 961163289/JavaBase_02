package 变量细节_3;

public class Var03 {
    public static void main(String[] args) {

        //变量=变量名+值+数据类型  变量三要素

        //变量必须先声明,后使用,即有顺序
        int a = 50;
        System.out.println(a);

        //该区域的数值/值可以在同一类型范围内不断变化
//      a = "jack"; //错
        a = 88; //对
        System.out.println(a);

        //变量在同一个作用域内不能重名
//      int a = 1; //错

    }
}

class Dog{
    public static void main(String[] args) {
        int a = 666;
        System.out.println(a);
    }
}
