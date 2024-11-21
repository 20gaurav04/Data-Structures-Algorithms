package Questions;

public class TakeKofEachChar {
    public static void main(String[] args) {
        String s = "aaacabc";
        int k = 3;
        int res = takeCharacters(s, k);
        System.out.println(res);
    }

    static int takeCharacters(String s, int k) {
        int[] arr = new int[3];

        // Count frequency of 'a', 'b', 'c' in the string
        for (char c : s.toCharArray()) arr[c - 'a']++;

        // Check if it's impossible to satisfy the condition
        if (arr[0] < k || arr[1] < k || arr[2] < k) return -1;

        int minLength = s.length();
        int start = 0;

        // Sliding window approach
        for (int end = 0; end < s.length(); end++) {
            arr[s.charAt(end) - 'a']--;

            while (start <= end && (arr[0] < k || arr[1] < k || arr[2] < k)) {
                arr[s.charAt(start++) - 'a']++;
            }

            // Update the minimum length of substring to remove
            minLength = Math.min(minLength, s.length() - (end - start + 1));
        }
        return minLength;
    }
}
