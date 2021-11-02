package ua.com.foxminded.anagrams;

public class Main {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        for (int i = 0; i < args.length; i++) {
            System.out.println("{" + args[i] + "} " + "=>" + " {" + anagram.reverseWords(args[i]) + "}");
        }
    }
}