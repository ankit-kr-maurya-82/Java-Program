class MergeSort{

    // conquer
    public void conquer(int arr[], int si, int mid, int ei){
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        
    }

    // divide
    public void divide(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        mid = si + (ei - si)/2; // si +ei/2
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }


    public static void main(String[] args) {
        int arr[] = {5,7,3,1,8,4};
        int n = arr.length;
    }
}