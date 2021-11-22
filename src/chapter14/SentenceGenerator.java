package chapter14;

import java.security.SecureRandom;

public class SentenceGenerator {
    private static String[] article = {"the", "a", "one", "some", "any"};
    private static String[] noun = {"dog", "girl", "boy", "town", "car"};
    private static String[] verb = {"drove" , "jumped" , "ran" , "walked", "skipped"};
    private static String[] preposition = {"to" , "from" , "over" , "under", "on"};

    public static String createSentence () {
        SecureRandom randomIndex = new SecureRandom();
        int index = randomIndex.nextInt(5);
        String firstWord = new String(article[index]);

        char firstLetter = firstWord.charAt(0);
        firstLetter= Character.toUpperCase(firstLetter);
        firstWord = firstWord.replace(firstWord.charAt(0), firstLetter);

        StringBuilder sentence = new StringBuilder(firstWord);//(article[index]);
        sentence.append(" ");
        index = randomIndex.nextInt(5);
        sentence.append(noun[index]);
        sentence.append(" ");
        index = randomIndex.nextInt(5);
        sentence.append(verb[index]);
        sentence.append(" ");
        index = randomIndex.nextInt(5);
        sentence.append(preposition[index]);
        sentence.append(" ");
        index = randomIndex.nextInt(5);
        sentence.append(article[index]);
        sentence.append(" ");
        index = randomIndex.nextInt(5);
        sentence.append(noun[index]);
        sentence.append(".");
        return sentence.toString();

    }
}
