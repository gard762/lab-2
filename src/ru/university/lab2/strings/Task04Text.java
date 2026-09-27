package ru.university.lab2.strings;

public class Task04Text {
    public void run(){
        palindromeDemo();
        reverseWordsDemo();
        countCharsDemo();
        caesarDemo();
        longestWordDemo();
    }

    private void palindromeDemo(){
        System.out.println("'А роза упала на лапу Азора' -> " + isPalindrome("А роза упала на лапу Азора"));
        System.out.println("'hello' -> " + isPalindrome("hello"));
    }

    private boolean isPalindrome(String s){
        char[] src = s.toCharArray();
        char[] filtered = new char[src.length];
        int n = -1;
        for(char c : src){
            if(Character.isLetterOrDigit(c))
                filtered[++n] = Character.toLowerCase(c);
        }
        for(int i = 0, j = n; i < j; i++, j--){
            if(filtered[i] != filtered[j])
                return false;
        }
        return true;
    }

    private void reverseWordsDemo(){
        System.out.println(reverseWords("кот съел мышь"));
    }

    private String reverseWords(String s){
        String[] words = splitBySpaces(s);
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            sb.append(words[i]);
            if(i > 0) sb.append(' ');
        }
        return sb.toString();
    }

    private String[] splitBySpaces(String s){
        int count = 1;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == ' ') count++;
        String[] parts = new String[count];
        int idx = 0, start = 0;
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                parts[idx++] = s.substring(start, i);
                start = i + 1;
            }
        }
        return parts;
    }

    private void countCharsDemo(){
        int[] counts = countChars("Hello World 123");
        System.out.println("Гласных: " + counts[0] + ", согласных: " + counts[1]
                + ", цифр: " + counts[2] + ", пробелов: " + counts[3]);
    }

    private int[] countChars(String s){
        int[] r = new int[4];
        String vowels = "aeiouyаеёиоуыэюя";
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isDigit(c)) r[2]++;
            else if (c == ' ') r[3]++;
            else if (Character.isLetter(c)) {
                if (vowels.indexOf(c) >= 0) r[0]++;
                else r[1]++;
            }
        }
        return r;
    }

    private void caesarDemo(){
        String text = "Hello, World!";
        String enc = caesar(text, 3);
        System.out.println("Зашифровано: " + enc);
    }

    private String caesar(String s, int k){
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            if(c >= 'a' && c <= 'z'){
                chars[i] = (char) ('a' + mod(c - 'a' + k, 26));
            } else if(c >= 'A' && c <= 'Z'){
                chars[i] = (char) ('A' + mod(c - 'A' + k, 26));
            }
        }
        return new String(chars);
    }

    private int mod(int a, int b){
        int r = a & b;
        return r < 0 ? r + b : r;
    }

    private void longestWordDemo(){
        System.out.println("Самое длинное слово: " + longestWord("Java is a powerful language"));
    }

    private String longestWord(String s){
        String[] words = splitBySpaces(s);
        String best = "";
        for(String w : words){
            if(w.length() > best.length())
                best = w;
        }
        return best;
    }
}