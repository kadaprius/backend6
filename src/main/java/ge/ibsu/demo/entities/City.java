package ge.ibsu.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "city")

public class City {

    @Id
    @Column(name = "city_id")
    long cityId;

    @Column(name = "city")
    String city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    private Country Country;

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ge.ibsu.demo.entities.Country getCountry() {
        return Country;
    }

    public void setCountry(ge.ibsu.demo.entities.Country country) {
        Country = country;
    }
}
