package 浮点数细节;

public class Var06 {
    public static void main(String[] args) {

        //Java 的浮点型常量(具体值)默认为double型,声明float型常量,须后加'f'或'F'
//        float num1 = 1.1; //对不对?错误
        float num2 = 1.1F; // 对
        double num3 = 1.1; // 对
        double num4 = 1.1F;// 对

        //十进制数形式: 如: 5.12  512.0F  .512
        double num5 = .512; //等价0.512
        System.out.println(num5);

        //科学计数法: 如: 5.12e2 [5.12*10的2次方]   5.12E-2 [5.12/10的2次方]
        System.out.println(5.12e2); //512.0
        System.out.println(5.12E-2);//0.0512

        //通常情况下,应该使用double型,因为它比float型更精确.
        double num9 = 2.1234567851;
        float num10 = 2.1234567851F;
        System.out.println(num9);  //2.1234567851
        System.out.println(num10); //2.1234567

        //浮点数使用陷阱: 2.7 和 8.1 / 3 比较
        //看看一段代码
        double num11 = 2.7;
        double num12 = 8.1 / 3;
        System.out.println(num11);//2.7
        System.out.println(num12);//2.6999999999999997 接近2.7的一个小数,而不是2.7
        //得到一个重要的使用点: 当我们对运算结果进行相等判断时,要小心
        //应该是以两个数的差值的绝对值,在某个精度范围类判断
        if (num11==num12){
            System.out.println("相等");
        }
        //正确的写法
        if (Math.abs(num11-num12) < 0.00001){
            System.out.println("差值非常小,到我的规定精度,认为相等...");
        }
        //可以通过java API 来看
        System.out.println(Math.abs(num11-num12));

        //细节: 如果是直接查询得到的小数或者直接赋值,是可以判断相等

    }
}
