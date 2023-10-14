
public interface MaxHeapInterface<T extends Comparable<? super T>> {
	public void add (T newEntry) throws Exception;
	public void maxHeapify(int i) throws Exception; 

}//end MaxHeapInterface
