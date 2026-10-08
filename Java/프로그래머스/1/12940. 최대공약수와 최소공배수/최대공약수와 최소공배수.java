class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = 1;
        for(int i=1; i<=Math.min(n,m);i++){
            if( n%i==0 && m%i==0){
                answer[0]=i;
                a=i;
            }
                
        }
        answer[1] = n*m/a;
   return answer;
}
        
}