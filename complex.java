package class4;

public class complex
{

	    int r;
	    int im;

	    complex(int real, int imag)
	    {
	        r = real;
	        im = imag;
	    }
	    void display()	
	    {
	    	System.out.println("Complex number is:"+r+"+"+im+"i");
	    	
	    }
	    
	    public static void main(String[] args)
	    {
	    	complex c1=new complex(2,5);
	    	c1.display();
	    
	    }
}



	    

	  
	
	

