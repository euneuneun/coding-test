class Solution {
    public int solution(int a, int b, int n) {

        // a = 필요한 콜라병 수, b = 바꿔주는 콜라 수, n = 빈병
        int answer = 0; // 가져간 콜라병
        int result = 0; // 지금까지 받은 콜라
        int rest = 0; // 받아온 콜라

        while (n >= a) {
            int i = 1;
            answer = 0; 
            while (answer < n) {
                i++;
                answer = a * i;
                if (answer > n) {
                    answer = a * (i - 1);
                    break;
                }
            }

            rest = ((answer / a) * b);
            result += rest;

            n = rest + (n - answer); // 받아온 콜라 + 교환 하지 않은 콜라병
        }
        return result;
    }
} 