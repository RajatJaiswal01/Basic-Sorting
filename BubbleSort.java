class BubbleSort{
    static void Sorted(int arr[], int n){
        for(int i=n-1;i>0;i--){
            for(int j=0;j<n-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
            
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