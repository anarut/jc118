package lesson11.generics;

public class Account {

    private Integer id;
    private Person owner;
    private String currency;
    private Integer amount;

    public Account(Integer id, Person owner) {
        this(id, owner, "USD", 0);
    }

    public Account(Integer id, Person owner, String currency, Integer amount) {
        this.id = id;
        this.owner = owner;
        this.currency = currency;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
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
}
