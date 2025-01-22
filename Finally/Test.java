
public class Test {
     public int m1()
     {
    	 int x=10;
    	 try
    	 {
    		 System.out.println("try-block");
    	        return x;
    	 }
    	 finally
    	 {
    		 Sytsem.out.println("finally-block");
    	 }
     }
     public static void main("String [] args")
     {
    	 Test t=new Test();
    	 int x=t.m1();
    	 System.out.println(x);
    	 
    	 System.out.println("my name is shreya");
     }
}

    	 
    	
