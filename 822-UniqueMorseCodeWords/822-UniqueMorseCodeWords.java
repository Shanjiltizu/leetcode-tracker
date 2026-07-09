// Last updated: 09/07/2026, 09:50:06
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
         String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", 
                                     "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                                     "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", 
                                     "-.--", "--.."};
        
        HashSet<String> uniqueTransformations = new HashSet<>();
        
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(morse[c - 'a']);
            }
            uniqueTransformations.add(sb.toString());
        }
        
        return uniqueTransformations.size();
        
    }
}