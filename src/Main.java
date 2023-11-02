import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static final int name_col = 1;
    public static final int year_col = 2;
    public static final int min_col = 6;
    public static final int max_col = 7;

    public static void main(String[] args) throws Exception{
        
        if (args.length <= 0) {
            System.err.println("No file was found");
        }

        System.out.printf("%s is being processed\n", args[0]);

        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        Map<String, List<BoardGame>> classified = br.lines()
            .skip(1)
            .map(row -> row.trim().split(","))
            .map(field -> new BoardGame(field[name_col], 
                Integer.parseInt(field[year_col]), 
                Integer.parseInt(field[min_col]), 
                Integer.parseInt(field[max_col])))
            .collect(Collectors.groupingBy(boardgame -> (boardgame.getDuration())))
            ;

        for (String duration : classified.keySet()) {
            System.out.printf("Duration: %s\n", duration);
            List<BoardGame> games = classified.get(duration);
            for (BoardGame game : games) {
                System.out.printf("\t%s, %s\n", game.getName(), game.getYearPublished());
            }
        }
    }
}

// Check Chuk GitHub for ordering of playtime using playtime array