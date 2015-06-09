package revision;

public class Lab1 {
	public static void main(String[] args) {
		int A[]={6,8,5,4,2,1,9,0,7,3};
		
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+"  ");
		}
		System.out.println();
		System.out.println();
		
		Selection s=new Selection();
		s.selectionSort(A,0,A.length);
		for(int i=0;i<A.length;i++){
		System.out.print(A[i]+"  ");
	}
	}
}
