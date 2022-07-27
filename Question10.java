import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question10 {
  public static void main(String a[]) {
    List <String> al = new ArrayList<>();
    al.add(" Hello "); 
    al.add(" How "); 
    al.add(" Are "); 
    al.add(" You "); 
    
    printAll(al);

  }
  public static void printAll(List<String> al) {
	  Iterator<String> it= al.iterator();

	  while(it.hasNext())

	  {

	  System.out.print(it.next());

	  }
  }
  
}