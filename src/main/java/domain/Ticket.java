package domain;

public class Ticket {
    private String identificationNumber;
    private Integer luckNumber;

    public Ticket(String identificationNumber, Integer luckNumber) {
        this.identificationNumber = identificationNumber;
        this.luckNumber = luckNumber;
    }

    public Integer getLuckNumber() {
        return luckNumber;
    }
}
