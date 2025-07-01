//public class MyClass

    //public class MyClass
//{
//    int b;// instant variables
//    static int s; // static variables
//    void m1(){
//        System.out.println();
//        System.out.println(b);
//        System.out.println(s);
//    }
//    public static void main(String[]args)
//    {
//        int a; // local variable
//        System.out.println(b);
//    }
//}
//
//
//2nd Thing
//
//public class MyClass // Class name should always start from capital letter.
//{
//    int a = 2;  // If we have to declare any variable in class we need to declare and initialize at the same point of time. // Instance Variable because it is in class.
//    public static void main(String[]args) // Method name should always start from small letter.
//    {
//        int b;  // Declaration // Local Variable because it is in method.
//        b = 1; // Intialization // Local Variable because it is in method.
//        System.out.println("main Method");
//    }
//}
//
//public class MyClass
//{
//    public static void main(String[]args)
//    {
//        System.out.println("My Name is Shreya Yadav! ");
//    }
//}
//
//    public class MyClass
//    {
//        public void myMethod()
//        {
//            int x = 1;
//            int y = 2;
//            int q = x + y;
//            System.out.println(q);
//        }
//        public static void main(String[]args)
//        {
//            System.out.println("Shreya");
//            int a = 1;
//            int b = 2;
//            int c = a+b;
//            System.out.println(c);
//        }
//    }

//public class MyClass
//{
//    public static void main(String[]args)
//        {
//            System.out.println("shreya");
//            int a = 1;
//            int b = 2;
//            int c = b - a;
//            System.out.println(c);
//        }
//
//}


//01-07-2025

//public class MyClass
//{
//    public void myMethod()
//    {
//        int x = 1;
//        int y = 2;
//        int q = x+y;
//        System.out.println(q);
//    }
//    public static void main(String[]args)
//    {
//
//    }
//}
// OBJECT CREATION
public class MyClass {


    public void myMethod()
    {
        int x=1;
        int y=2;
        int a=x+y;
        System.out.println(a);
    }
    public static void main(String[]args){
        System.out.println("Shreya");
        MyClass m=new MyClass();
        m.myMethod();
    }
}
