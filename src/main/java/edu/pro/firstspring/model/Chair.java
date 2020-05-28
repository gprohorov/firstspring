package edu.pro.firstspring.model;

import java.time.LocalDateTime;
import java.util.Objects;

// POJO

public class Chair {
    private String id;
    private String name;
    private String desc;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public Chair() {
    }

    public Chair(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Chair(String id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return getId().equals(chair.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Chair{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
