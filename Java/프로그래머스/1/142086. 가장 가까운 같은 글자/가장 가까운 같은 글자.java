class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        int[] last = new int[26];
        
        for (int j = 0; j < 26; j++) {
            last[j] = -1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';// 'a'는 0, 'b'는 1
            
            if (last[idx] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i -last[idx];
            }
            
            last[idx] = i;
        }
        return answer;
    }
}