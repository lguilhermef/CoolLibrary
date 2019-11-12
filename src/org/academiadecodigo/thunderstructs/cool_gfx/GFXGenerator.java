package org.academiadecodigo.thunderstructs.cool_gfx;

enum Edge { TOP, BOTTOM }

/**
 * @author Joao Furnas
 *
 * generates graphical representations for command line. Allows to generate Boxes with itle and plain text inside or a table representation.
 * changing LINE_SIZE will change your boxe's width
 * changing MARGIN will change th margin between Box and text inside it
 */
public class GFXGenerator {

    private static final int MARGIN = 3;
    private static final int LINE_SIZE = 136;

    private GFXGenerator(){}

    /**
     * clears command line window
     *
     */
    public static String clearScreen(){
        return "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    }

    /**
     * Draws box containing a table and title
     *
     * @param cellContent String array with cell content, each index of array represents a celll in the table
     * @param cols number of columns of table
     * @param title String with table title, set to null to not show a title
     * @return string with table representation
     */
    public static String drawTable(String[] cellContent, int cols, String title){

        int lines = (int)Math.ceil((double)cellContent.length / cols);
        int cellSize = (LINE_SIZE - MARGIN - MARGIN) / cols;
        String rows = "";

        int counter = 0;
        String[] cells = new String[cols];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < cols; j++) {
                if(counter < cellContent.length && cellContent[counter] != null){
                    cells[j] = cellContent[counter];
                } else {
                    cells[j] = " ".repeat(cellSize);
                }
                counter++;

            }
            rows += generateBannerRow(cells);
        }

        String boxStart = bannerEdge(Edge.TOP);

        if(title != null){
            generateTitleBox(title);
        }

        return  boxStart + rows + bannerEdge(Edge.BOTTOM);
    }

    /**
     * Draws box containing a table and title
     *
     * @param content String array with line content, each index of array represents a line in the box
     * @param align text alignment inside box (LEFT, CENTER, RIGHT)
     * @param title String with table title, set to null to not show a title
     * @return string with table representation
     */
    public static String generateInfoBox(String[] content, TextAlign align, String title){

        String boxStart = bannerEdge(Edge.TOP);

        if(title != null){
            boxStart = generateTitleBox(title);
        }

        String box = clearScreen() + boxStart;

        box += bannerEdge(Edge.TOP);

        for (String s : content){
            box += generateBannerContentLine(s, align);

        }

        box += bannerEdge(Edge.BOTTOM);

        return box;
    }

    public static String drawGameOver(String color){

        StringBuilder sb = new StringBuilder();

        String c = color;

            sb.append(c + "                  .d8888b.         d8888 888b     d888 8888888888       .d88888b.  888     888 8888888888 8888888b.\n");
            sb.append(c + "                 d88P  Y88b       d88888 8888b   d8888 888             d88P\" \"Y88b 888     888 888        888   Y88b\n");
            sb.append(c + "                 888    888      d88P888 88888b.d88888 888             888     888 888     888 888        888    888\n");
            sb.append(c + "                 888            d88P 888 888Y88888P888 8888888         888     888 Y88b   d88P 8888888    888   d88P\n");
            sb.append(c + "                 888  88888    d88P  888 888 Y888P 888 888             888     888  Y88b d88P  888        8888888P\"\n");
            sb.append(c + "                 888    888   d88P   888 888  Y8P  888 888             888     888   Y88o88P   888        888 T88b\n");
            sb.append(c + "                 Y88b  d88P  d8888888888 888   \"   888 888             Y88b. .d88P    Y888P    888        888  T88b\n");
            sb.append(c + "                  \"Y8888P88 d88P     888 888       888 8888888888       \"Y88888P\"      Y8P     8888888888 888   T88b\n");

        return clearScreen() + sb.toString() + Color.ANSI_RESET;
    }

    public static String drawYouWon(String color){

        String c = color;

        StringBuilder sb = new StringBuilder();

            sb.append(c + "                              Y88b   d88P  .d88888b.  888     888      888       888  .d88888b.  888b    888\n");
            sb.append(c + "                               Y88b d88P  d88P\" \"Y88b 888     888      888   o   888 d88P\" \"Y88b 8888b   888\n");
            sb.append(c + "                                Y88o88P   888     888 888     888      888  d8b  888 888     888 88888b  888\n");
            sb.append(c + "                                 Y888P    888     888 888     888      888 d888b 888 888     888 888Y88b 888\n");
            sb.append(c + "                                  888     888     888 888     888      888d88888b888 888     888 888 Y88b888\n");
            sb.append(c + "                                  888     888     888 888     888      88888P Y88888 888     888 888  Y88888\n");
            sb.append(c + "                                  888     Y88b. .d88P Y88b. .d88P      8888P   Y8888 Y88b. .d88P 888   Y8888\n");
            sb.append(c + "                                  888      \"Y88888P\"   \"Y88888P\"       888P     Y888  \"Y88888P\"  888    Y888\n");

        return clearScreen()  + sb.toString() + Color.ANSI_RESET;

    }

    public static String drawCountDown(Count count){

        switch (count){
            case ONE:
                return showOne() + "\n\n\n\n\n";

            case TWO:
                return showTwo() + "\n\n\n\n\n";

            case TREE:
                return showTree() + "\n\n\n\n\n";

            case READY:
                return showReady() + "\n\n\n\n\n";
        }
        return null;
    }

    private static String showReady(){

        String s = Color.ANSI_RED;

        s += "                              8888888b.  8888888888        d8888 8888888b. Y88b   d88P  .d8888b.      \n";
        s += "                              888   Y88b 888              d88888 888  \"Y88b Y88b d88P  d88P  Y88b     \n";
        s += "                              888    888 888             d88P888 888    888  Y88o88P        .d88P     \n";
        s += "                              888   d88P 8888888        d88P 888 888    888   Y888P       .d88P\"      \n";
        s += "                              8888888P\"  888           d88P  888 888    888    888        888\"        \n";
        s += "                              888 T88b   888          d88P   888 888    888    888        888         \n";
        s += "                              888  T88b  888         d8888888888 888  .d88P    888                    \n";
        s += "                              888   T88b 8888888888 d88P     888 8888888P\"     888        888         \n";

        s += Color.ANSI_RESET;

        return clearScreen() + s;
    }

    private static String showOne(){

        String s = Color.ANSI_GREEN;

        s += "                                                               d888        \n";
        s += "                                                               d8888       \n";
        s += "                                                               888         \n";
        s += "                                                               888         \n";
        s += "                                                               888         \n";
        s += "                                                               888         \n";
        s += "                                                               888         \n";
        s += "                                                               8888888     \n";

        s += Color.ANSI_RESET;

        return clearScreen() + s;
    }

    private static String showTwo(){

        String s = Color.ANSI_YELLOW;

        s += "                                                               .d8888b.        \n";
        s += "                                                              d88P  Y88b       \n";
        s += "                                                                     888       \n";
        s += "                                                                   .d88P       \n";
        s += "                                                               .od888P\"       \n";
        s += "                                                              d88P\"           \n";
        s += "                                                             888\"             \n";
        s += "                                                             88888888888       \n";

        s += Color.ANSI_RESET;

        return clearScreen() + s;
    }

    private static String showTree(){

        String s = Color.ANSI_RED;

        s += "                                                              .d8888b.        \n";
        s += "                                                             d88P  Y88b       \n";
        s += "                                                                  .d88P       \n";
        s += "                                                                 8888\"       \n";
        s += "                                                                 \"Y8b.       \n";
        s += "                                                             888    888       \n";
        s += "                                                             Y88b  d88P       \n";
        s += "                                                             \"Y8888P\"       \n";

        s += Color.ANSI_RESET;

        return clearScreen() + s;
    }

    private static String generateBannerRow(String[] content){

        int cellSize = (LINE_SIZE - MARGIN - MARGIN) / content.length;
        String stat = "";
        String row = "";

        for (int i = 0; i < content.length; i++) {
            String fillCell = " ".repeat(cellSize - content[i].length());
            stat += content[i] + fillCell;
        }

        row = " #" + " ".repeat(MARGIN) + stat + " ".repeat(MARGIN) + "#\n";

        return row;

    }

    private static String bannerEdge(Edge edge){

        String bannerSpacing = " ".repeat(134);
        String bannerBorder = " #" + bannerSpacing + "#\n";
        String bannerLine = " " + "#".repeat(136) + "\n";

        switch (edge){
            case TOP:
                return  bannerLine  + bannerBorder;

            case BOTTOM:
                return bannerBorder + bannerLine;

            default:
                return null;
        }

    }

    private static String generateBannerContentLine(String content, TextAlign align){

        int spaces = (LINE_SIZE - content.length()) / 2;
        String spacing = " ".repeat(spaces - 1);
        String smallSpace = " ".repeat(3);
        String bigSpace = " ".repeat(spaces + spaces - 5);

        if((content.length() % 2) != 0){
            content = content + " ";
        }

        switch (align){
            case LEFT:
                return " #" + smallSpace + content + bigSpace + "#\n";

            case CENTER:
                return " #" + spacing + content + spacing + "#\n";

            case RIGHT:
                return " #" + bigSpace + content + smallSpace + "#\n";
        }

        return "Ops... Something went wrong. Unable to create this line";
    }

    private static String generateTitleBox(String title){

        String boxStart = "";

        boxStart += generateBannerContentLine(title.toUpperCase(), TextAlign.CENTER) +
                generateBannerContentLine(" ", TextAlign.LEFT) +
                generateBannerContentLine("-".repeat(LINE_SIZE - 6), TextAlign.CENTER) +
                generateBannerContentLine(" ", TextAlign.LEFT);

        return boxStart;
    }


}