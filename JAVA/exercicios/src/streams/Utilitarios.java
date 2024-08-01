package streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Utilitarios {

    public static final Consumer<String> print = System.out::print;
    public static final Consumer<String> println = System.out::println;
    public static final UnaryOperator<String> upperCase = n -> n.toUpperCase();
    public static final UnaryOperator<String> firstLetter = n -> n.charAt(0) + "";
    public static final UnaryOperator<String> reverseString = n -> new StringBuilder(n).reverse().toString();
    public static final Predicate<Aluno> checkIfStudentIsApproved = a -> a.grade >= 7;
    public static final Predicate<Jogador> checkIfPlayerWasOnSummerEvent = p -> p.getCompletedSummerEvent();
    public static final Predicate<Jogador> checkIfPlayerWasATopPlayer = p -> p.getWasOnSummerEventTopPlayers(); 
    public static final Predicate<Produto> checkIfProductHasAHighDiscount = p -> p.getDiscount() >= 0.3;
    public static final Predicate<Produto> checkIfFreightIsFree = p -> p.getFreight() == 0; 
    public static final Function<String, Integer> binaryStringToNumber = n -> Integer.parseInt(n, 2);
    public static final Function<Aluno, String> congratsApproved = a -> "Parabéns " + a.name + "! Você foi aprovado(a)!";
    public static final Function<Jogador, String> givePlayerSummerReward = p -> "Parabéns " + p.getNickName() + 
    "! Você está apto a receber a recompensa do evento de verão! (Dark Pulser Sword adicionada a seu inventário)"; 
    public static final Function<Produto, String> giveProductDiscount = p -> "O produto " + p.getName() + " está com um super desconto!";
    
    public static final String scream(String n) {
        return n + "!!!";
    }
}
