package collection.customlist;
import java.util.Arrays;

public class CustomCollection<T> {
	private Object custom_collection[];
	private int initial_capacity = 10;
	private int length = 0;

	public CustomCollection() {
		custom_collection = new Object[initial_capacity];
		for (int i = 1; i <= 10; i++)
			custom_collection[length++] = i;
	}

	public int size() {
		return length;
	}

	public void allocateMemory() {
		int size = custom_collection.length + 5;
		custom_collection = Arrays.copyOf(custom_collection, size);
	}

	public void add(T data) {
		if (length >= custom_collection.length) {
			allocateMemory();
		}
		custom_collection[length++] = data;
	}

	public Object get(int index) {
		if (index >= 0 && index < length)
			return custom_collection[index];
		else
			throw new IndexOutOfBoundsException();
	}

	public Object remove(int index) {
		if (index >= 0 && index < length) {
			Object element = custom_collection[index];
			int ind = custom_collection.length - (index + 1);
			System.arraycopy(custom_collection, index + 1, custom_collection, index, ind);
			length--;
			return element;
		} else
			throw new IndexOutOfBoundsException();
	}

	public void print() {
		for (int i = 0; i < custom_collection.length; i++) {
			System.out.println(custom_collection[i] + " ");
		}
	}
}
