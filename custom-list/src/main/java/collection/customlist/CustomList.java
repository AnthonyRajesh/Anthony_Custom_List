package collection.customlist;
import java.util.Scanner;

public class CustomList {
	public void  main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		CustomCollection<Object> list = new CustomCollection<Object>();
		while(true)
		{
			System.out.println("Enter an option to perform the operation:\n 1.Add an element\n 2.Delete an element\n 3.Fetch the element\n 4.Print the List\n 5.Size of the list\n 6.Break\n");
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.println("Enter the elment to be inserted:");
				int data=sc.nextInt();
				list.add(data);
			}
			else if(n==2)
			{
				System.out.println("Enter the position of element to be deleted:");
				int index=sc.nextInt();
				try
				{
					Object x=list.remove(index);
					System.out.println("Element removed is:"+x);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			else if(n==3)
			{
				System.out.println("Enter the position of element to be fetched:");
				int index=sc.nextInt();
				try
				{
					Object element=list.get(index);
					System.out.println("Element is:"+element);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			else if(n==4)
			{
				list.print();
			}
			else if(n==5)
			{
				int len=list.size();
				System.out.println("Size of the list is:"+len);
			}
			else if(n==6)
				break;
			else
			{
				System.out.println("Enter a valid option...");
			}
		}
		sc.close();
	}
}
