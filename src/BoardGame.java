public class BoardGame {
    
    private String name;
    private int yearPublished;
    private int minPlayTime;
    private int maxPlayTime;

    public BoardGame(String name, int yearPublished, int minPlayTime, int maxPlayTime) {
        this.name = name;
        this.yearPublished = yearPublished;
        this.minPlayTime = minPlayTime;
        this.maxPlayTime = maxPlayTime;
    }

    public String getName() {
        return name;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public int getMinPlayTime() {
        return minPlayTime;
    }

    public int getMaxPlayTime() {
        return maxPlayTime;
    }

    public String getDuration() {
        if (maxPlayTime - minPlayTime >= 30 && maxPlayTime - minPlayTime < 60) {
            return "[30 -> 60)";
        } else if (maxPlayTime - minPlayTime >= 60 && maxPlayTime - minPlayTime < 120) {
            return "[60 -> 120)";
        } else if (maxPlayTime - minPlayTime >= 120 && maxPlayTime - minPlayTime < 180) {
            return "[120 -> 180)";
        } else if (maxPlayTime - minPlayTime >= 180) {
            return "[180 ->";
        } else {
            return "Invalid Play Time";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setMinPlayTime(int minPlayTime) {
        this.minPlayTime = minPlayTime;
    }

    public void setMaxPlayTime(int maxPlayTime) {
        this.maxPlayTime = maxPlayTime;
    }
}
