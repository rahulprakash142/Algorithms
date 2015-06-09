package revision;

public class Selection {
	
	void selectionSort(int a[],int start,int end){
		for(int i=0;i<end;i++){
			int min=i;
			for(int j=i;j<end;j++){
				if(a[j]<a[min]){
					min=j;
				}
			}
				int tmp=a[i];
				a[i]=a[min];
				a[min]=tmp;
		}
	}

}
