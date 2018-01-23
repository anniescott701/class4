package class4;

public class complex1 
{
	    int r;
	    int im;

	    complex1(int real, int imag)
	    {
	        r=real;
	        im= imag;
	    }
	    public complex1()
		{
			r=0;
			im=0;
		}
	    void display()	
	    {
	    	System.out.println("Complex number:"+r+"+"+im+"i");
	    }
	    complex1 plus( complex1 a)
		{
			complex1 n= new complex1();
			n.r=r+a.r;
			n.im=im+a.im;
			return n;
		}
	    complex1 multiply( complex1 a)
		{
			
				complex1 n= new complex1();
				n.r=r*a.r-im*a.im;
				n.im=r*a.im+im*a.r;
				return n;
			}
	    public static void main(String[] args)
	    {
	    	complex1 c1=new complex1(2,5);
	    	complex1 c2=new complex1(3,4);
			complex1 add=new complex1();
			complex1 multiply=new complex1();
			
			add= c1.plus(c2);
			multiply=c1.multiply(c2);
			
	    	c1.display();
	    	c2.display();
	    	System.out.println("\n after Addition ");
	    	add.display();
	    	System.out.println("\n after Multiplication ");
	    	multiply.display();
	    	
	    	
	    
	    }
}

