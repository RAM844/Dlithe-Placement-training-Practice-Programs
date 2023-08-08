public static int findMedian(List<Integer> arr) {
    // Write your code here
        int n = arr.size();
        for(int i =0;i<=n/2;i++){
            int minj = i;
            for(int j =i+1;j<n;j++){
                if(arr.get(minj)>arr.get(j)){
                    minj=j;
                }
            }
            int temp = arr.get(minj);
            arr.set(minj,arr.get(i));
            arr.set(i,temp);
        }
        System.out.println(arr.toString());
        return arr.get((n/2));
    };
