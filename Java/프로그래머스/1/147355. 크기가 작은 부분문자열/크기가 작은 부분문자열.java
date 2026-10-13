class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = t.length();
        long target = Long.parseLong(p);
        for(int i= 0;i<=len-p.length();i++){
            long a = Long.parseLong(t.substring(i,i+p.length()));
            if(a<=target)
                answer++;
        }
        return answer;
    }
}