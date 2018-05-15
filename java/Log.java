import com.example.actionfootballmanager.DatabaseHelper;

/**
 *
 */

public class Log {
    DatabaseHelper g;
    public Log(DatabaseHelper g){
        this.g=g;
    }
    public DatabaseHelper getTeamLog(DatabaseHelper teamLog){
        return teamLog;
    }
    public DatabaseHelper getPlayerLog(DatabaseHelper playerLog){
        return playerLog;
    }
    public DatabaseHelper getTeamStats(DatabaseHelper teamLog){
        /*get team stats from teamLog*/
        DatabaseHelper teamStats=teamLog;

        return teamStats;
    }
    public DatabaseHelper getPlayerStats(DatabaseHelper playerLog){
               /*get team stats from playerLog*/
               DatabaseHelper playerStats=playerLog;
               return playerStats;
    }
    public DatabaseHelper getSpecPlayerStats(DatabaseHelper playerLog){

        /*query a specific player's stats*/
        DatabaseHelper specPlayer=playerLog;
        return specPlayer;

    }
    public DatabaseHelper getSpecTeamStats(DatabaseHelper playerLog){

        /*query a specific player's stats*/
        DatabaseHelper specPlayer=playerLog;
        return specPlayer;

    }
}
