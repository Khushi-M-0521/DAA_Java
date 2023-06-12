package basic_programs;
import java.util.*;
public class GCD {

	public int euclid(int m,int n)
	{
	    if(n==0)
	        return m;
	    return euclid(n,m%n);
	}
	public int middleSchool(int m,int n)
	{
	    int p[]=new int[10],q[]=new int[10],c=2,a=0,b=0,pro=1,i,j,min,max,min;
	    int z[],y[];
	    while (m>1)
	    {
	        if(m%c==0)
	        {
	            p[a++]=c;
	            m=m/c;
	        }
	        else
	            c++;
	    }

	    c=2;
	    while (n>1)
	    {
	        if(n%c==0)
	        {
	            q[b++]=c;
	            n=n/c;
	        }
	        else
	            c++;
	    }

	    max=(a>b)?a:b;
	    if(a>b)
	    {
	        y=p;
	        z=q;
	    }
	    else
	    {
	        y=q;
	        z=p;
	    }

	    j=0;
	    for(i=0;i<=max;i++)
	        if( y[i]==z[j])
	        {
	            pro*=y[i];
	            j++;
	        }
	    return pro;
	}
	public int repetativeSub(int m,int n)
	{
	    if(m==0) return n;
	    if(n==0) return m;
	    
	    while(m!=n)
	    {
	        if(m>n)
	            m=m-n;
	        else
	            n=n-m;
	    }

	    return m;
	}
	public int consecIntCheck(int m,int n)
	{
	    int r=(m>n)?m:n;

	    while((m%r!=0) || (n%r!=0))
	        r--;

	    return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
	    long t;
	    Scanner in =new Scanner(System.in);
	    GCD x=new GCD();
	    System.out.print("Enter two numbers to find their gcd: ");
	    m=in.nextInt();
	    n=in.nextInt();

	    t=System.nanoTime();
	    System.out.println("Euclid gcd= "+x.euclid(m,n));
	    t=System.nanoTime()-t;
	    System.out.println("Time= "+(t/1000.0)+" ms");

	    t=System.nanoTime();
	    System.out.println("Middle School gcd= "+x.middleSchool(m,n));
	    t=System.nanoTime()-t;
	    System.out.println("Time= "+(t/1000.0)+" ms");

	    t=System.nanoTime();
	    System.out.println("Repetative Subtration gcd= "+x.repetativeSub(m,n));
	    t=System.nanoTime()-t;
	    System.out.println("Time= "+(t/1000.0)+" ms");

	    t=System.nanoTime();
	    System.out.println("Consecutive Integer Checking gcd= "+x.consecIntCheck(m,n));
	    t=System.nanoTime()-t;
	    System.out.println("Time= "+(t/1000.0)+" ms");

	}

}
