package elo.pra.vo;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-05 00:33
 */
public class School {
    private String name;
    private String address;

    public School() {
    }

    public School(String name) {
        this.name = name;
    }

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
