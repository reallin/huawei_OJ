package ListTest;
import java.util.*;
public class ListTest {
public static void main(String[] args)
{
    List books = new ArrayList();
    books.add(new String("aaaa"));
    books.add(new String("bbbb"));
    System.out.println(books);
    books.add(1,new String("cccc"));
    for(int i =0;i<books.size();i++)
    {
    	System.out.println(books.get(i));
    }
}
}
