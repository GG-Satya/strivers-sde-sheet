//Approach-1
//==========

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        int n = intervals.length;
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(!list.isEmpty() && end<= list.get(list.size()-1)[1]){
                continue;
            }
            for(int j=i+1; j<n; j++){
                if(intervals[j][0] <= end){
                    end = Math.max(end,intervals[j][1]);
                }else{
                    break;
                }
            }
            list.add(new int[]{start,end});
        }
        return list.toArray(int[][] :: new);
    }
}



//Approach-2
//==========

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        for(int[] arr : intervals){
            if(list.isEmpty() || arr[0] > list.getLast()[1]){
                list.add(arr);
            }else{
                list.getLast()[1] = Math.max(list.getLast()[1], arr[1]);
            }
        }
        return list.toArray(int[][] :: new);
    }
}