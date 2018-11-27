package generics.questions.intact;

/*
 * 改寫BoundEx為泛型類別，傳入的泛型 T限定只能吃ABC三種type
 */
public class MyBoundedClassEx {

	public static void main(String a[]) {

		BoundEx be = new BoundEx();
		be.doRunTest();
		
	}
}


class BoundEx{
	public void doRunTest() {
		System.out.println("do run test");
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
