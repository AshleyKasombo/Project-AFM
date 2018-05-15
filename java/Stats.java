import com.example.actionfootballmanager.DatabaseHelper;

/**
 *
 */

public class Stats {
    /*get stats */
    DatabaseHelper table;
    public Stats(DatabaseHelper table){
        this.table=table;
    }
    public int getNumOfGames(DatabaseHelper playerOrTeam){
        /*return number of games for a player or team*/
        int games=0;
        /*games+=number of teams played for(for players)
        games+=number of times played (for teams)
        * */
        return games;
    }
    public double getAveWinT(DatabaseHelper g){
        double percent=0;
        /*percent+= times won (in a loop)
        percent/=getNumOfGames(g)
        * */
        return percent;

    }
    public double getAveDrawT(DatabaseHelper g){
        double percent=0;
        /*percent+= times draw (in a loop)
        percent/=getNumOfGames(g)
        * */
        return percent;
    }
    public double getAveLoseT(DatabaseHelper g){
        double percent=0;
        /*percent+= times lost (in a loop)
        percent/=getNumOfGames(g)
        * */
        return percent;
    }
    public double getAveWinP(DatabaseHelper g){
        double percent=0;
        /*percent+= times won (in a loop)
        percent/=getNumOfGames(g)
        * */
        return percent;
    }
    public double getAveDrawP(DatabaseHelper g){
        double percent=0;
        /*percent+= times draw (in a loop)
        percent/=getNumOfGames(g)
        * */
        return percent;
    }
    public double getAveLoseP(DatabaseHelper g){
        double percent=0;
        /*percent+= times lost (in a loop)
        percent/=getNumOfGames(g)
        * */
        return percent;
    }
}
