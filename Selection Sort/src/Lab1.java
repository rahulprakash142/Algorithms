
public class Lab1 {
	public static void main(String[] args) {
		
	int arr[]={4,5,6,8,9,3,2,1,3,4,4,8,9,3,2,5};
	for(int i=0;i<arr.length-1;i++){
		System.out.print(arr[i]+"  ");
	}
	int j=arr.length;
	int min=0;
	for(int i=0;i<j-1;i++){
		min=i;
		for(int k=i+1;k<j;k++){
			if(arr[k]<arr[min]){
				min=k;
			}
		}
			int tmp=arr[min];
			arr[min]=arr[i];
			arr[i]=tmp;
		
	}
	System.out.println();
	System.out.println();
	for(int i=0;i<arr.length-1;i++){
		System.out.print(arr[i]+"  ");
	}
	
	
	}
}
