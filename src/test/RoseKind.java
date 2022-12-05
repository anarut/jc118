package test;

public enum RoseKind implements FlowerKind {

    LELIA,
    KOREAN;

    @Override
    public String getName() {
        return KOREAN.getName();
    }
}
