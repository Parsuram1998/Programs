
public class Problem_4 {

	public static void main(String[] args) {
		int[] a={1,2,8,9,12,46,76,82,15,20,30};
	      int b=1;
	       for(int j=1;j<10;j++)
	       {
	    	    int count=0;
	       
	      for(int i=0;i<a.length;i++)
	      {
	    	  if(a[i]%b==0)
	    	  {
	    		  count++;   
	    		     
	    	  } 
	          
	      }
	      System.out.println(b+":"+count);
	      b++;
	       }
	   }
   }
