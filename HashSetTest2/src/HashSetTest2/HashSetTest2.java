package HashSetTest2;
import java.util.*;
import org.omg.CORBA.Object;

class R
{
   int count;
   public R(int count)
   {
	   this.count = count;
   }
   public String toString()
   {
	   return "R"+count;
   }
   public boolean equals(Object obj)
   {
	   if(this == obj)
	   {
		   return true;
	   }
	   if(obj!=null&&obj.getClass()==R.class)
	   {
		   R r=(R) obj;
		   if(r.count == this.count)
		   {
			   return true;
		   }
	   }
	   return false;
   }  
   public int hascode()
   {
	   return this.count;
   }
}
public class HashSetTest2 {
public static void main(String[] args)
{
  	HashSet hs = new HashSet();
  	hs.add(new R(5));
  	hs.add(new R(7));
  	System.out.println(hs);
  	System.out.println(hs.contains(new R(7)));
  	
}
}
