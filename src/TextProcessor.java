public class TextProcessor {
    // Count words in a sentence
    public static int countWords(String sentence) {
        // Split the sentence and count words
        if(sentence != ""){
        int wordsCount = 0;
            return wordsCount = sentence.split("\\s").length;
        // Handle empty strings
        }else {
            return 0;
        }
    }
    // Replace specific words
    public static String replaceWord(String text, String oldWord, String newWord) {
// Replace all occurrences of oldWord with newWord
        return text.replace(oldWord, newWord);
    }
    public static void main(String[] args) {
// Test with: "Java is fun and Java is powerful"
        countWords("Java is fun and Java is powerful");
// Count words
        replaceWord("Java is fun and Java is powerful","Java","Programming");
// Replace "Java" with "Programming"
    }
}