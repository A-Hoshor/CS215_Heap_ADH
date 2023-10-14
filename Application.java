
public class Application {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		MaxHeap maxHeap = new MaxHeap();
		maxHeap.add(1);
		maxHeap.print();
		maxHeap.add(8);
		maxHeap.print();
		maxHeap.add(6);
		maxHeap.print();
		maxHeap.add(5);
		maxHeap.print();
		maxHeap.add(3);
		maxHeap.print();
		maxHeap.add(7);
		maxHeap.print();
		maxHeap.add(4);
		System.out.println(maxHeap.getMax());
		maxHeap.print();
	}

}
