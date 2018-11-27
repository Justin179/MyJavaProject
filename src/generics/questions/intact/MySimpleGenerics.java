package generics.questions.intact;

// 用泛型，把兩個SimpleGeneric 合而為一

public class MySimpleGenerics {
	public static void main(String[] args) {

		SimpleGeneric sgs = new SimpleGeneric("JAVA2NOVICE");
		sgs.printType();

        SimpleGeneric2 sgb = new SimpleGeneric2(Boolean.TRUE);
        sgb.printType();

	}
}

class SimpleGeneric{
    
	//constructor to accept type parameter T
	public SimpleGeneric(String param){
		this.objReff = param;
	}

	//declaration of object type T
    private String objReff = null;
     
    public String getObjReff(){
        return this.objReff;
    }
     
    //this method prints the holding parameter type
    public void printType(){
    	
    	System.out.println(getObjReff());
    	
        //System.out.println("Type: "+objReff.getClass().getName());
    }
}

class SimpleGeneric2{
    
	//constructor to accept type parameter T
	public SimpleGeneric2(Boolean param){
		this.objReff = param;
	}

	//declaration of object type T
    private Boolean objReff = null;
     
    public Boolean getObjReff(){
        return this.objReff;
    }
     
    //this method prints the holding parameter type
    public void printType(){
    	
    	System.out.println(getObjReff());
    	
        //System.out.println("Type: "+objReff.getClass().getName());
    }
}



