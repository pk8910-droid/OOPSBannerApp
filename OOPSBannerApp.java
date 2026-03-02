class CharacterPatternMap {

    public String[] getPattern(char ch) {

        if (ch == 'O') {
            return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            };
        }

        if (ch == 'P') {
            return new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
            };
        }

        if (ch == 'S') {
            return new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
            };
        }

        return new String[]{"", "", "", "", ""};
    }
}

public class OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPatternMap map = new CharacterPatternMap();
        String text = "OOPS";

        String[][] patterns = new String[text.length()][];

        // Get pattern for each character
        for (int i = 0; i < text.length(); i++) {
            patterns[i] = map.getPattern(text.charAt(i));
        }

        // Print banner side by side
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < patterns.length; col++) {
                System.out.print(patterns[col][row] + "  ");
            }
            System.out.println();
        }
    }
}