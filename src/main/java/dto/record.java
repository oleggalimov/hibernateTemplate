package dto;


import javax.persistence.*;

@Entity
@Table (name = "record")


public class record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "message")
    private String message;

    public record() {
    }

    public record(String message) {
        this.message = message;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString () {
        return "Запись: "+this.id + ", гласит: "+this.message;
    }
}
