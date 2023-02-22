import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Tournament> playerList = List.of(new Tournament("エナミさん", 100, 5.2),
                                              new Tournament("コヤマさん", 100, 7.5),
                                              new Tournament("アカマツさん", 100, 6.4));

        System.out.println("1回戦100m走結果一覧");

        for (Tournament player : playerList) {
            System.out.println(player.getName() + player.getAge()+"歳" + player.getTime()+"秒");
        }

        System.out.println("下記7.0秒以下の選手は2回戦進出となります。");

        for (Tournament player : playerList) {
            if (player.getTime() < 7) {
                System.out.println("選手名:" + player.getName());
            }
        }
     }
}

