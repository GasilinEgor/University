package pr4.second;

public enum Sizes {
    XXS(40) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(38),
    S(36),
    M(34),
    L(32);


    private final int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }


    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}
