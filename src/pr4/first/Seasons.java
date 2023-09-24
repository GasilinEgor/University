package pr4.first;

public enum Seasons {
    WINTER(-7.2),
    SPRING(14.7),
    SUMMER(24.6) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(9.8)
    ;

    private final double temperature;


    public void favoriteSeason(Seasons season) {
        System.out.print("Я люблю ");
        switch (season) {
            case SPRING -> System.out.println("весну");
            case SUMMER -> System.out.println("лето");
            case AUTUMN -> System.out.println("осень");
            case WINTER -> System.out.println("зиму");
        }
    }


    public String getDescription() {
        return "Холодное время года";
    }


    private Seasons(double temperature) {
        this.temperature = temperature;
    }


    public double getTemperature() {
        return temperature;
    }
}
