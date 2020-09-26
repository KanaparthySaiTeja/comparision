package comparision.lines;

/**
 * Hello world!
 *
 */
public class comparisionline

	{
	    public static void main( String[] args )
	    {
		    System.out.println("Welcome to Line Comparsion program");

	    	int x1,x2,y1,y2;
			int  l1,l2;
			x1=2; y1=2;
			x2=4;y2=4;
			l1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			System.out.println(l1);
	    }
	}
