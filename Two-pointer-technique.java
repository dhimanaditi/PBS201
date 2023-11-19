// findPair whose sum == targetValue
static boolean findPair(int arr[],int n, int k){
        int l=0,r=n-1;
        while(l<r){
            if(arr[l]+arr[r]==k)
            return true;
            if(arr[l]+arr[r]<k)
            l++;
            else
            r--;
        }
        return false;
    }
