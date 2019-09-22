package com.ahao.dubbo.bean;

/**
 * @author 25771
 * @since 2019/9/7 15:48
 **/
public class CarVO extends BaseBean{
    private static final long serialVersionUID = 4946464157097418726L;
    private Integer id;
    private Integer masterId;
    private String brand;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarVO{" +
                "id=" + id +
                ", masterId=" + masterId +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
