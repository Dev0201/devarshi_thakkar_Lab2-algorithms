package MSort;

public class Msort {
	
	void merge (int arr[], int left, int mid, int right) {
		
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		int LeftArray[] = new int [n1];
		int RightArray[] = new int [n2];
		
		for(int i=0; i<n1; i++) {
			LeftArray[i] = arr [left+i];
		}
		
		for(int j=0;j<n2;j++) {
			RightArray[j] = arr[mid+1+j];
		}
		
		int i=0;
		int j=0;
		int k = left;
		
		while(i<n1 && j<n2) {
			
			if(LeftArray[i]>=RightArray[i])
			{
				arr[k] = LeftArray[i];
			}
			else
			{
				arr[k] = RightArray[j];
				j++;
			}
			
		}
	
	}
	
	
	public void sort(int currency[], int left, int right) {
		
		if (left<right) {
			
			int mid = (left+right)/2;
			sort(currency,left,right);
			sort (currency,mid+1,right);
			
			merge(currency,mid,left,right);
		}
	}

}
