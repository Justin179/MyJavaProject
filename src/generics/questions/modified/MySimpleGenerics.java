package generics.questions.modified;

// 用泛型，把兩個SimpleGeneric 合而為一

public class MySimpleGenerics {
	public static void main(String[] args) {

		SimpleGeneric<String> sgs = new SimpleGeneric<String>("JAVA2NOVICE");
		sgs.printType();

        SimpleGeneric<Boolean> sgb = new SimpleGeneric<Boolean>(Boolean.TRUE);
        sgb.printType();

	}
}

class SimpleGeneric<T>{
    
	//constructor to accept type parameter T
	public SimpleGeneric(T param){
		this.objReff = param;
	}

	//declaration of object type T
    private T objReff = null;
     
    public T getObjReff(){
        return this.objReff;
    }
     
    //this method prints the holding parameter type
    public void printType(){
    	System.out.println(getObjReff());
        //System.out.println("Type: "+objReff.getClass().getName());
    }
}



