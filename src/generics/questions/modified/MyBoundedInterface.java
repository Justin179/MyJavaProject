package generics.questions.modified;

/*
 * 改寫BoundExmp成泛型類別，使能夠吃XYZ，並呼叫到Y&Z的實作
 */

public class MyBoundedInterface {
	 
    public static void main(String a[]){
         
    	BoundExmp<Y> beY = new BoundExmp<Y>(new Y());
    	beY.doRunTest();
    	
    	BoundExmp<Z> beZ = new BoundExmp<Z>(new Z());
    	beZ.doRunTest();

    }
}
 
class BoundExmp <T extends X>{
     
	private T obj;
	
	public BoundExmp(T obj){
		this.obj = obj;
	}
	
    public void doRunTest(){
    	obj.printClass();
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
