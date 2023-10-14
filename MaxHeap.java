
public class MaxHeap<T extends Comparable<? super T>> implements MaxHeapInterface<T> {

	private T[] heap;
	private int lastIndex;
	private int capacity;
	private boolean integrityOK= false;

	
	public MaxHeap() {
		this.capacity=25;
		this.lastIndex=0;
		T [] tempHeap = (T[]) new Comparable [26];
		heap = tempHeap;
		integrityOK = true;
	}//end empty argument Constructor

	public MaxHeap(int initialCapacity) {
		this.capacity=initialCapacity;
		this.lastIndex=0;
		T [] tempHeap = (T[]) new Comparable [initialCapacity + 1];
		heap = tempHeap;
		integrityOK = true;
	}//end preferred argument Constructor

	
	public void add(T newEntry) throws Exception {
		checkIntegrity();
		heap[lastIndex]= newEntry;
	   // Traverse up and fix violated property
	    int current = lastIndex;
	    while (heap[current].compareTo(heap[parent(current)]) > 0) {
	            swap(current, parent(current));
	            current = parent(current);
		}
	        lastIndex++;
	}//end newEntry

	private void ensureCapacity() {
		// TODO Auto-generated method stub
		
	}

	private void checkIntegrity() throws Exception {
		if (integrityOK = true) {
			
		} else
			throw new Exception("Array integrity not okay.");
	}
	
	public void maxHeapify(int i) throws Exception {
		checkIntegrity();
		if (isLeaf(i))
			return;
		if (heap[i].compareTo(heap[leftChild(i)]) < 0|| heap[i].compareTo(heap[rightChild(i)]) < 0) {
			if (heap[leftChild(i)].compareTo(heap[rightChild(i)]) > 0) {
				swap(i,leftChild(i));
				maxHeapify(leftChild(i));
			}
			else {
				swap(i, rightChild(i));
				maxHeapify(rightChild(i));
			}
		}
	}

	private void swap(int fi, int si) {
		T temp;
		temp = heap[fi];
		heap[fi] = heap[si];
		heap[si]=temp;
	}//end swap

	private boolean isLeaf(int i) {
		if (heap[rightChild(i)] == null && heap[leftChild(i)] == null) {
			return true;
		}
		return false;
	}//end isLeaf
	
	private int parent(int i) {
		return (i -1) /2;
	}

	private int leftChild(int i) {
		return (2 * i ) + 1;
	}
	
	public int rightChild(int i) {
		return (2 * i) + 2;
	}
	
	public T getMax() {
		T i = heap[0];
		return i;
	}
	
	 public void print()
	    {
		 System.out.println("\nMaxHeap:");
		 
	        for (int i = 0; heap[i] != null; i++) {
	        	System.out.print("\nParent Node : " + heap[i]);
					if (leftChild(i)< lastIndex) // if the child is out of the bound
	                        // of the array
	            		System.out.print(" Left Child Node:  " + heap[leftChild(i)]);
	 
	            	if (rightChild(i)< lastIndex) // the right child index must not
	                        // be out of the index of the array
	            		System.out.print(" Right Child Node: " + heap[rightChild(i)]);
	        	}//end for
	
	    }

}

