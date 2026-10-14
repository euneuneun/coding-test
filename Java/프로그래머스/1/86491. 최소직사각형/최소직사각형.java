class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int a = 0;
        int b = 0;
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        for(int j=0;j<sizes.length;j++){
                if(a<sizes[j][0])
                    a = sizes[j][0];
                if(b<sizes[j][1])
                    b = sizes[j][1];
        }
        
        return a*b;
    }
}