package by.itacademy.filenkovvladislav.taf.sites;

public class Util {

    private final String[] mails = {"@yandex.ru", "@yandex.com", "@mail.ru", "@list.ru", "@inbox.ru", "@bk.ru", "@gmail.com", "@gmail.ru"};

    private static String[] engAlphabetAndNumbers() {
        String[] Alphabet = new String[62];
        char letter = 'a';
        char capitalLetter = 'A';
        char nambers = '0';

        for (int i = 0; i < 26; i++) {
            Alphabet[i] = String.valueOf(letter);
            Alphabet[i + 26] = String.valueOf(capitalLetter);
            if (i <= 9) {
                Alphabet[i + 52] = String.valueOf(nambers);
                nambers++;
            }
            letter++;
            capitalLetter++;
        }
        return Alphabet;
    }

    public String randomString(int numberOfLetters) {
        String result = "";
        int j;
        for (int i = 0; i < numberOfLetters; i++) {
            j = (int) Math.floor(Math.random() * engAlphabetAndNumbers().length);
            result = result.concat(engAlphabetAndNumbers()[j]);
        }
        return result;
    }

    public String generateRandomEmail(int numberOfLetters) {
        int i;
        i = (int) Math.floor(Math.random() * mails.length);
        return randomString(numberOfLetters) + mails[i];
    }

    public String generateRandomPassword(int numberOfLetters) {
        return randomString(numberOfLetters);
    }
}
