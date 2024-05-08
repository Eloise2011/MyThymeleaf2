package elo.pra.vo;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-08 22:42
 */
public class Colleagues {
    private String name;
    private Integer staffId;
    private String salary;

    public Colleagues() {
    }
    public Colleagues(Integer staffId, String name, String salary) {
        this.staffId = staffId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Colleagues{" +
                "staffId=" + staffId +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
