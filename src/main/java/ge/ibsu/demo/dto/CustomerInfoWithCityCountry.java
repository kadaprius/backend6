package ge.ibsu.demo.dto;

public class CustomerInfoWithCityCountry {

    private String firstName;
    private String LastName;

    private String City;
    private String Country;

    private String Address;

    public CustomerInfoWithCityCountry(){}

    public CustomerInfoWithCityCountry(String firstName, String lastName, String city, String country, String address) {
        this.firstName = firstName;
        LastName = lastName;
        City = city;
        Country = country;
        Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }


    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
