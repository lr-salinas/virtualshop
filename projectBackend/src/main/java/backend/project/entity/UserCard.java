package backend.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_card")
public class UserCard {
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_card_id;
    private int user_id;
    private int card_id;

    public UserCard(){
        super();
    }

    public UserCard(int user_card_id, int user_id, int card_id){
        super();
        this.user_card_id = user_card_id;
        this.user_id = user_id;
        this.card_id = card_id;
    }

    public int getUser_card_id() {
        return user_card_id;
    }

    public void setUser_card_id(int user_card_id) {
        this.user_card_id = user_card_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }
}

