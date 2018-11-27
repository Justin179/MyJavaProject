package generics.questions.intact;

/*
 * 改寫BoundExmp成泛型類別，使能夠吃XYZ，並呼叫到Y&Z的實作
 */

public class MyBoundedInterface {
	 
    public static void main(String a[]){
         
    	BoundExmp be = new BoundExmp();
    	be.doRunTest();

    }
}
 
class BoundExmp{
     
    public void doRunTest(){
        System.out.println("do run test!");
    }
}
 
interface X{
    public void printClass();
}
 
class Y implements X{
    public void printClass(){
        System.out.println("I am in class Y");
    }
}
 
class Z implements X{
    public void printClass(){
        System.out.println("I am in class Z");
    }
}
