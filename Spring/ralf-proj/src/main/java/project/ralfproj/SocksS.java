package project.ralfproj;

import javax.persistence.*;

@Entity
public class SocksS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    Integer id;

    String color;
    String cotton;

    public SocksS( String color, String cotton) {
        this.color = color;
        this.cotton = cotton;
    }



    public SocksS() {

    }

    public Integer getId() {
        return id;
    }


    public String getColour() {
        return color;
    }

    public void setColour(String colour) {
        this.color = colour;
    }

    public String getCotton() {
        return cotton;
    }

    public void setCotton(String cotton) {
        this.cotton = cotton;
    }
}
