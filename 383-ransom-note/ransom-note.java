public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char ch : magazine.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : ransomNote.toCharArray()) {
            int count = charCount.getOrDefault(ch, 0);
            if (count == 0) {
                return false;
            }
            charCount.put(ch, count - 1);
        }
        
        return true;
    }
}
