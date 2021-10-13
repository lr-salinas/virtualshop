package backend.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int card_id;
    private int user_id;
    private String card_name;
    private int card_number;
    private int expiration_year;
    private int expiration_month;
    private int cvc;
    private int creation_date;
    private int status;

    public Card(){
        super();
    }

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    public int getCard_number() {
        return card_number;
    }

    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    public int getExpiration_year() {
        return expiration_year;
    }

    public void setExpiration_year(int expiration_year) {
        this.expiration_year = expiration_year;
    }

    public int getExpiration_month() {
        return expiration_month;
    }

    public void setExpiration_month(int expiration_month) {
        this.expiration_month = expiration_month;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public int getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(int creation_date) {
        this.creation_date = creation_date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Card{" +
                "card_id=" + card_id +
                ", user_id=" + user_id +
                ", card_name='" + card_name + '\'' +
                ", card_number=" + card_number +
                ", expiration_year=" + expiration_year +
                ", expiration_month=" + expiration_month +
                ", cvc=" + cvc +
                ", creation_date=" + creation_date +
                ", status=" + status +
                '}';
    }
}
