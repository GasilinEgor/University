package pr4.first;

public class first {
    public static void main(String[] args) {
        Seasons seasons = Seasons.SUMMER;
        seasons.favoriteSeason(seasons);
        for (Seasons season : Seasons.values()) {
            System.out.println(season);
            System.out.println("Средняя температура: " + season.getTemperature());
            System.out.println(season.getDescription());
        }
    }
}


