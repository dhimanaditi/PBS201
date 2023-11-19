// if array is sorted findPair whose sum == targetValue
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

                                //OR

// WAP to print 1 if there are two integers present in the array whose sum == targetValue
boolean flag=false;
         HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int curr =arr[i];
            int val=k-arr[i];
            if (map.containsKey(val)) {
                flag=true;
                break;
            }else{
            map.put(curr, i);
        }
        }
               System.out.println(flag?"1":"-1");
        }


//(need to sort the array)find the maximum value where sum of pair is < targetValue print the max sum pair else -1

static int findMax(int[] arr, int n, int k){
         Arrays.sort(arr);
        int maxSum = -1;

        int l=0;
        int r =n-1;

        while (l<r) {
            int currentSum = arr[l]+arr[r];

            if (currentSum < k) {
                maxSum = Math.max(maxSum, currentSum);
                l++; 
            } else {
                r--;
            }
        }
        return maxSum;
    }


// to reverse the array

int l=0,r=n-1;
        int temp=0;
        for(int i=0;i<n;i++){
            while(l<r){
                temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;r--;
            }
            }for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        }

// first we need to sort the array 
//Lifeboat problem we have to count the total number of boats where the maximum hold capacity of boat is given in variable K

 static int countBoat(int[] arr,int n, int k){
        Arrays.sort(arr);
        int boat=0;
        int l=0,r=n-1;
        while(l<=r){
        
            if(arr[l]+arr[r]<=k){
                boat++;
                l++;r--;
            }
            else{
            r--;
            boat++;
            }
        }
        return boat;
    }

// Stone age --> find between two friends both has equal number of stone then print the max else 0

static int stoneAge(int[] arr,int n){
        int l=0;
        int r=n-1;
        int ram=arr[l];
        int shyam=arr[r];
        int max=0;
        while(l<r){
            if(ram<shyam){
                l++;
                ram+=arr[l];
            }
            else if(ram>shyam){
                r--;
                shyam+=arr[r];
            }
                else{
                max=Math.max(ram,max);
                l++;r--;
                ram+=arr[l];
                shyam+=arr[r];
            }
        }
        return max;
    }



// container with most water or Chocolate drink
// the values in the array consider as height if the container
// find the max area of rectangle

    static int findMax(int[] arr,int n){
        int l=0,r=n-1;
        int max=0;//for storing the maximum value
        while(l<r){
            int height=Math.min(arr[l],arr[r]);
            int width=r-l;
            int area=height*width;
            max=Math.max(area,max);
            if(arr[l]<arr[r]){
                l++;
            }
            else
            r--;
        }
        return max;
    }

//Triplet sum 
//find if there exists two numbers in the array whose sum is equal to third number c,
//which is also present in the array

 static int findPair(int[] arr,int n){
        for(int i=0;i<n;i++){
            int l=0,r=n-1;
            int k=arr[i];
            while(l<r){
                if(arr[l]+arr[r]==k)
                    return 1;
                    else if(arr[l]+arr[r]<arr[i])
                    l++;
                else
                    r--;
            }
        }
        return 0;
    }

// two sorted array  (for input use fastreader)
// one array is sorted in ascending order where second array is sorted in descending order
// find the total number of common element in both the array

 static int findCommon(int[] arr1,int[] arr2,int n){
        int l=0,r=n-1;
        int c=0;
        while(l<n&&r>=0){
            if(arr1[l]==arr2[r]){
                c++;
                l++;
                r--;
            }else if(arr1[l]<arr2[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return c;
    }

// fastreader template

import java.util.*;
import java.io.*;
public class Main{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;
		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}
		public void print(Object object) throws IOException {
			bw.append("" + object);
		}
		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}
		public void close() throws IOException {
			bw.close();
		}
	}
    public static void main(String[] args) {
        try {
            FastReader sc=new FastReader();
            FastWriter out = new FastWriter();
            
            //write code here

                 int tc=sc.nextInt();
            while(tc>0){
                int n=sc.nextInt();
                int[] arr1=new int[n];
                int[] arr2=new int[n];
                for(int i=0;i<n;i++){
                    arr1[i]=sc.nextInt();
                }
                for(int j=0;j<n;j++){
                    arr2[j]=sc.nextInt();
                }
                int ans =findCommon(arr1,arr2,n); // call method
                System.out.println(ans);
                tc--;
            }
                
            out.close();
        
        }
        catch (Exception e) {
            e.printStackTrace() ;
            return;
        }
    }
    
}
