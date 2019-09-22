package com.ahao.dubbo.bean;

/**
 * @author 25771
 * @since 2019/9/7 15:48
 **/
public class DogVO extends BaseBean{
    private static final long serialVersionUID = -8601660952474400648L;
    private Integer id;
    private Integer masterId;
    private String name;
    private String species;
    private String color;

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "DogVO{" +
                "id=" + id +
                ", masterId=" + masterId +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
