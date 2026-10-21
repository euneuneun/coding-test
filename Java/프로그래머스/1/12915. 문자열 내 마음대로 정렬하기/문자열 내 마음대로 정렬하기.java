class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for (int k = 0; k < strings.length; k++) {
            answer[k] = strings[k];
        }

        for (int k = 0; k < answer.length - 1; k++) {
            for (int i = 0; i < answer.length - 1; i++) {
                char c1 = answer[i].charAt(n);
                char c2 = answer[i + 1].charAt(n);

                if (c1 > c2 || (c1 == c2 && answer[i].compareTo(answer[i + 1]) > 0)) {
                    String temp = answer[i];
                    answer[i] = answer[i + 1];
                    answer[i + 1] = temp;
                }
            }
        }
        return answer;
    }
}