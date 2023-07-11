import java.util.Collections;
import java.util.ArrayList;
public class ArraySortUsingObjectDetails{
	
	public static void main(String args[])
	{
	 ArrayList<TestPOJO> arraylist = new ArrayList<TestPOJO>();
    arraylist.add(new TestPOJO(101, "Zues", 26));
    arraylist.add(new TestPOJO(505, "Abey", 24));
    arraylist.add(new TestPOJO(809, "Vignesh", 32));

    /*Sorting based on Student Name*/
    System.out.println("Student Name Sorting:");
    Collections.sort(arraylist, TestPOJO.RollNoComparator);

    for(TestPOJO str: arraylist){
	System.out.println(str);
    }	
	 ArrayList<Integer> arraylist1 = new ArrayList<Integer>();	
		arraylist1.add(10);
		arraylist1.add(13);
		arraylist1.add(2);
		 Collections.sort(arraylist1);

    for(Integer inte: arraylist1){
	System.out.println(inte);
    }	
		
	}
	
	
	
}