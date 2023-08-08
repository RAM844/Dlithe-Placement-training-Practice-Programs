public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
    int n = arr.size();
    List<Integer> ans = new ArrayList<>(100);
    for(int i =0;i<100;i++){
        ans.add(i,0);
    }
        for(int i =0;i<n;i++){
            ans.set(arr.get(i),ans.get(arr.get(i))+1);
        }
    arr.clear();
    for(int i =0;i<100;i++){
        n = ans.get(Integer.valueOf(i));
        for(int j = 0;j<n;j++){
            arr.add(i);
        }
    }
    return arr;
    }
