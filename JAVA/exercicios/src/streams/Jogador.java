package streams;

public class Jogador {

    private final String nickName;
    private final Boolean completedSummerEvent;
    private final Boolean wasOnSummerEventTopPlayers;

    public Jogador(String nickName, Boolean completedSummerEvent, Boolean wasOnSummerEventTopPlayers) {
        this.nickName = nickName;
        this.completedSummerEvent = completedSummerEvent;
        this.wasOnSummerEventTopPlayers = wasOnSummerEventTopPlayers;
    }

    public String getNickName() {
        return nickName;
    }
    public Boolean getCompletedSummerEvent() {
        return completedSummerEvent;
    }
    public Boolean getWasOnSummerEventTopPlayers() {
        return wasOnSummerEventTopPlayers;
    }
}
