import java.util.Arrays;
import java.util.Scanner;


//class People{
//    public String name;
//    public int age;
//    public int count;
//    public static int num;
//
//    public void sleep(){
//        System.out.println(name + "睡觉");
//    }
//    public static void eat(){
//        System.out.println("吃饭");
//    }
//    public void show(){
//        System.out.println(name + age);
//    }
//
//    public static void show1(){
//        System.out.println(num);
//    }
//
//}

//封装
//class Student{
//    private String name;
//    private int age;
//
//    public String getName(){
//        return name;
//    }
//    public int age(){
//        return age;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//}

//构造方法
//class People{
//    public String name;
//    public int age;
//    public static int num;
//
//    public People(){
//        System.out.println("不带参");
//    }
//    public People(String name){
//        this.name = name;
//        System.out.println("带参");
//    }
//    public People(String name,int age){
//        this.name = name;
//        this.age = age;
//        System.out.println("调用双参");
//    }
//    public void func(){
//        System.out.println("功能");
//    }
//    public void haHa(){
//        this.func();
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//
//    //代码块
//    static{
//        num = 4;
//        System.out.println("静态代码块");
//    }
//    {
//        this.name = "shiqiang";
//        this.age = 21;
//        System.out.println("实例代码块");
//    }
//
//    @Override
//    public String toString() {
//        return "People{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
public class TextDemo5 {
    public static void main(String[] args){
//        People peo = new People();
//        System.out.println(peo);
//        //peo.haHa();
//        People peo1 = new People("史强");
//        System.out.println(peo1);
//        People peo2 = new People("史强",21);
//        System.out.println(peo2);

//        Student stu = new Student();
//        stu.setName("史强");
//        System.out.println(stu.getName());


        //People.show1();
//        People peo = new People();
//        peo.name = "史强";
//        peo.age = 21;
//        peo.show();

//        People.num++;
//        People.num++;
//        People.num++;
//        System.out.println(People.num);

//        People peo1 = new People();
//        peo1.num++;
//        People peo2 = new People();
//        peo2.num++;
//        People peo3 = new People();
//        peo3.num++;
//        System.out.println(peo3.num);

//        peo.name = "史强";
//        peo.age = 21;
//        People.num = 4;
//        peo.sleep();
//        People.eat();

        //System.out.println()
        //System.out.println(peo.name + " " + peo.age + " " + People.num);
    }

//给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面
//    public static void swapArr_num(int[] arr){
//        int i = 0;
//        int j = arr.length - 1;
//        while(i < j){
//            //找奇数
//            while(i < j && arr[i] % 2 == 0){
//                i++;
//            }
//            //找偶数
//            while(i < j && arr[j] % 2 != 0){
//                j--;
//            }
//            int tmp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = tmp;
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        swapArr_num(arr);//1 2 3 4 5 6
//        System.out.println(Arrays.toString(arr));
//    }




    //给定两个整型数组, 交换两个数组的内容
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr1 = new int[n];
//        int[] arr2 = new int[n];
//        for(int i = 0; i < n; i++){
//            arr1[i] = sc.nextInt();
//        }
//        for(int i = 0; i < n; i++){
//            arr2[i] = sc.nextInt();
//        }
//        for(int i = 0; i < n; i++){
//            int tmp = arr1[i];
//            arr1[i] = arr2[i];
//            arr2[i] = tmp;
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//    }

}
