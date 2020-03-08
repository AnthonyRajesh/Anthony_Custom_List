package collection.customlist;

import org.junit.Assert;
import org.junit.Test;

public class CustomListTest {

	@Test
	public void test() {
		CustomCollection<Integer> list = new CustomCollection<Integer>();
		list.add(21);
		list.add(31);
		Object x=list.get(11);
		Assert.assertEquals(31,x);
		list.add(41);
		Assert.assertEquals(13,list.size());
		Object val=list.remove(12);
		Assert.assertEquals(41,val);
		Assert.assertEquals(12,list.size());
		Object x1=list.get(11);
		Assert.assertEquals(x1,31);
	}

}
