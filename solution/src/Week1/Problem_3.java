package Week1;

// Substraction이 아니라면 모두 각 캐릭터가 의미하는 숫자를 더한것

class Problem_3 {

    static final char ONE = 'I';
    static final char FIVE = 'V';
    static final char TEN = 'X';
    static final char FIFTY = 'L';
    static final char HUNDRED = 'C';
    static final char FIVE_HUNDREDS = 'D';
    static final char THOUSAND = 'M';

    public int romanToInt(String s) {
        int number = 0;
        int index = 0;
        int substractionFlag = false;

        while (index < s.length()) {
            char numberChar = s.charAt(index);



        }
    }

    private int getNumericFromSub(String romanString, int currentIndex) {
        if (romanString.length() == currentIndex) {

        }

        char currentChar = romanString.charAt(currentIndex);

        if (currentChar == ONE) {
            if (nextChar == FIVE) {
                return 4;
            } else if (nextChar == TEN) {
                return 9;
            }
        }

        if (currentChar == TEN) {
            if (nextChar == FIFTY) {
                return 40;
            } else if (nextChar == HUNDRED) {
                return 90;
            }
        }

        if (currentChar == HUNDRED) {
            if (nextChar == FIVE_HUNDREDS) {
                return 400;
            } else if (nextChar == THOUSAND) {
                return 900;
            }
        }
    }
}
