package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam yaklut  = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam dena  = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam tiger  = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam tokyo  = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam carp  = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam dragon  = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

    yaklut.report();
    dena.report();
    tiger.report();
    tokyo.report();
    carp.report();
    dragon.report();
    }


}
