package lesson11.generics;

public class GenericAccount<T extends Object, K extends Number> {

    public T id;
    private Person owner;
    private String currency;
    private K amount;

    public GenericAccount(T id, Person owner, K amount) {
        this(id, owner, "USD", amount);
    }

    public GenericAccount(T id, Person owner, String currency, K amount) {
        this.id = id;
        this.owner = owner;
        this.currency = currency;
        this.amount = amount;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public K getAmount() {
        return amount;
    }

    public void setAmount(K amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", owner=" + owner +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }


    public <M> M test(M a) {
        T id = getId();
        K amount = getAmount();
        int i = amount.intValue();
        byte b = amount.byteValue();
        return a;
    }
}
