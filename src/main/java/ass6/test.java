package ass6;
import java.util.*;
public class test
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   CustomCollectiontask colobj=new CustomCollectiontask();
	   colobj.addelements(10);
	   colobj.addelements("a");
	   colobj.addelements(7);
	   colobj.addelements(9);
	   colobj.addelements(11);
	   colobj.addelements("a");
	   colobj.addelements("b");
	   colobj.addelements("c");
	   colobj.addelements("hello");
	   colobj.addelements(6.7);
	   colobj.addelements(5.5);
	   System.out.println(colobj.capacity());
	   System.out.println(colobj.size());
	   System.out.println("Enter the position of the element you want to retrieve");
	   int ind=sc.nextInt();
	   Object k=colobj.get(ind);
	   System.out.println(k);
	   //System.out.println(colobj);
	   System.out.println("Enter the position of the element you want to delete");
	   int ii=sc.nextInt();
	   colobj.remove(ii);
	   System.out.println("The elements in the list are: ");
	   colobj.print();
	   
   }
}
