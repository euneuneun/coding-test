class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long result = 0;
        for(int i = 1; i<=count; i++){
            answer+=price*i;
        }
        result = answer - money;
        if(result<0)
            return 0;
        return result;
    }
}