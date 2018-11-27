package generics.questions.modified;

/*
 * 改寫BoundEx為泛型類別，傳入的泛型 T限定只能吃ABC三種type
 */
public class MyBoundedClassEx {

	public static void main(String a[]) {

		BoundEx<A> beA = new BoundEx<A>(new A());
		beA.doRunTest();
		
		BoundEx<B> beB = new BoundEx<B>(new B());
		beB.doRunTest();
		
		BoundEx<C> beC = new BoundEx<C>(new C());
		beC.doRunTest();
		
	}
}


class BoundEx <T extends A>{

	// 注入
	private T type;
	public BoundEx(T type){
		this.type = type;
	}
	
	public void doRunTest() {
		type.printClass();
	}
}

class A {
	public void printClass() {
		System.out.println("I am in super class A");
	}
}

class B extends A {
	public void printClass() {
		System.out.println("I am in sub class B");
	}
}

class C extends A {
	public void printClass() {
		System.out.println("I am in sub class C");
	}
}
