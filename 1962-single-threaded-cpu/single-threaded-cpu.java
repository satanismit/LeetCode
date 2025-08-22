class Solution {
    public int[] getOrder(int[][] tasks) {
        
        int n=tasks.length;

        int[][] arr=new int[n][3];
        for(int i=0; i<n; i++){

            arr[i][0]=tasks[i][0]; //enquetime
            arr[i][1]=tasks[i][1];  //processingtime
            arr[i][2]=i;            //index
        }

        //sort based on enquetime [0]
        Arrays.sort( arr, (a,b) -> Integer.compare(a[0],b[0]));

        // Min-heap: first by processingTime, then by index
        PriorityQueue<int[]> pq = new PriorityQueue<>(

            (a, b) -> a[1] == b[1] ? a[2] - b[2] : a[1] - b[1]
        );

        int time=0, i=0, indx=0;
        int[] res=new int[n];

        while(i<n || !pq.isEmpty()){

            //add all task that are available according to time
            while(i<n && arr[i][0]<=time){
                pq.add(arr[i]);
                i++;
            }

            if(pq.isEmpty()){

                    time = arr[i][0];
            }else{

                int[] task=pq.poll();

                res[indx++]=task[2]; //add index to result 

                time+=task[1];
            }
            
        }

        return res;
        
    }
}