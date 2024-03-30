class SelectionSort{
    static void Sorted(int arr[], int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            
        }

        for(int i=0;i<n;i++){
            System.err.print(arr[i]+" ");
        }
    }



    public static void main(String[] args){
        int array[]={24,79,84,57,19,32};
        int n=6;
        System.out.println("Before Sorting:");
        for(int i=0; i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\nAfter Sorting:");
        Sorted(array,n);

    }
}