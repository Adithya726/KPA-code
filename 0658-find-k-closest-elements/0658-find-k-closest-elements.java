class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l=0,r=arr.length-1;
        while(r-l+1>k){
            int le=Math.abs(x-arr[l]);
            int ri=Math.abs(x-arr[r]);
            if(le>ri){
                l++;
            }
            else{
                r--;
            }
        }
        List<Integer> a=new ArrayList<>();
        for(int i=l;i<=r;i++){
            a.add(arr[i]);
        }
        return a;
    }
}