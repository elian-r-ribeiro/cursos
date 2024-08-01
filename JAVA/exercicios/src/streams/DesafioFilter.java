package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {

	public static void main(String[] args) {
        
        Jogador p1 = new Jogador("Lobin4", true, false);
        Jogador p2 = new Jogador("Jorgin", true, true);
        Jogador p3 = new Jogador("FlavinDoPneu", false, false);
        Jogador p4 = new Jogador("20comer70correr", true, false);
        List<Jogador> playersList = Arrays.asList(p1, p2, p3, p4);

        playersList.stream().filter(Utilitarios.checkIfPlayerWasOnSummerEvent).filter(Utilitarios.checkIfPlayerWasATopPlayer).
        map(Utilitarios.givePlayerSummerReward).forEach(Utilitarios.println);
    }
}
