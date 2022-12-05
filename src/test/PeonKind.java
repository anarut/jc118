package test;

public enum PeonKind implements FlowerKind {
    TALISMAN,
    AURORA;


    @Override
    public String getName() {
        return AURORA.getName();
    }
}
