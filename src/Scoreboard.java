class Scoreboard {
    static final int MAXLEVEL = 9;

    public int level;
    public int lines;
    public int score;
    public int topscore;
    public boolean gameOver = true;

    void reset() {
        setTopscore();
        level = lines = score = 0;
        gameOver = false;
    }

    void setGameOver() {
        gameOver = true;
    }

    boolean isGameOver() {
        return gameOver;
    }

    void setTopscore() {
        if (score > topscore)
            topscore = score;
    }

    int getTopscore() {
        return topscore;
    }

    int getSpeed() {

        switch (level) {
            case 0:
                return 700;
            case 1:
                return 600;
            case 2:
                return 500;
            case 3:
                return 400;
            case 4:
                return 350;
            case 5:
                return 300;
            case 6:
                return 250;
            case 7:
                return 200;
            case 8:
                return 150;
            case 9:
                return 100;
            default:
                return 100;
        }
    }

    void addScore(int sc) {
        score += sc;
    }

    void addLines(int line) {

        switch (line) {
            case 1:
                addScore(10);
                break;
            case 2:
                addScore(20);
                break;
            case 3:
                addScore(30);
                break;
            case 4:
                addScore(40);
                break;
            default:
                return;
        }

        lines += line;
        if (lines > 10)
            addLevel();
    }

    void addLevel() {
        lines %= 10;
        if (level < MAXLEVEL)
            level++;
    }

    int getLevel() {
        return level;
    }

    int getLines() {
        return lines;
    }

    int getScore() {
        return score;
    }
}