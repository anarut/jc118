package lesson11.generics;

import java.math.BigDecimal;

public class DecimalAccount {

    private Integer id;
    private Person owner;
    private String currency;
    private BigDecimal amount;

    public DecimalAccount(Integer id, Person owner) {
        this(id, owner, "USD", BigDecimal.ZERO);
    }

    public DecimalAccount(Integer id, Person owner, String currency, BigDecimal amount) {
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
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
