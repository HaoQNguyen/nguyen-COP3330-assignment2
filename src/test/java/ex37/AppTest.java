package ex37;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generatePassword() {

        Random rand = new Random();

        char[] character = {'a'};
        char[] number = {'1'};
        char[] special = {'@'};

        int minLength = 8;
        int numSpecial = 2;
        int numNum = 2;
        int numChar = minLength / 2.0 > (numSpecial + numNum) ? minLength - (numSpecial + numNum) : numSpecial + numNum;

        int length;
        int numCount = 0;
        int specialCount = 0;
        int charCount = 0;

        String actual = App.generatePassword(character,number,special, minLength,numSpecial,numNum, rand);

        length = actual.length();
        for (int i = 0; i < length; ++i)
        {
            if (actual.charAt(i) == 'a')
                ++charCount;
            else if (actual.charAt(i) == '1')
                ++numCount;
            else if (actual.charAt(i) == '@')
                ++specialCount;
        }

        assertEquals(numChar, charCount);
        assertEquals(numNum, numCount);
        assertEquals(numSpecial, specialCount);

    }
}