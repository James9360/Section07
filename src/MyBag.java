public class MyBag<E> {
	private E value;
	
	public MyBag(E k) {
		this.value = k;
	}
	
	public E getValue() {
		return value;
	}
	
	public boolean equals (Object other) {
		if (this == other) {
			return true;
		}
		else if (other == null || other.getClass() != this.getClass()) {
			return false;
		}
		else {
			MyBag<E> bag = (MyBag<E>) other;
			return value == (bag.value);
		}
	}
	
	public int hashCode() {
		return value.hashCode();
	}
	
	public String toString() {
		return value.toString();
	}
}
