package ua.com.foxminded.anagrams;

public class Anagram {
    public String reverseWords(String input) {
        String oneOrMoreSpaces = "\\s";
        String[] words = input.split(oneOrMoreSpaces);
        StringBuilder completeAnagram = new StringBuilder();
        String addSpaceAfterWord = " ";

        for (int i = 0; i < words.length; i++) {
            char[] symbol = words[i].toCharArray();
            char newSymbolSequence;
            int j = symbol.length - 1;
            int k = 0;

            while (k < j) {
                if (!Character.isLetter(symbol[k]))
                    k++;
                else if (!Character.isLetter(symbol[j]))
                    j--;
                else {
                    newSymbolSequence = symbol[k];
                    symbol[k] = symbol[j];
                    symbol[j] = newSymbolSequence;
                    k++;
                    j--;
                }
            }
            completeAnagram.append(new String(symbol)).append(addSpaceAfterWord);
        }
        return completeAnagram.toString().trim();
    }
}