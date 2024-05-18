package model.entities;

import java.io.Serializable;
public class Department implements Serializable{

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    public Department() {

    }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Department that = (Department) object;
        return java.util.Objects.equals(id, that.id);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}


