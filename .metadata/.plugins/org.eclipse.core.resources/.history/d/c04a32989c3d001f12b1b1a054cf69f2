package com.kh.practice.set.model.vo;

public class Lottery {
    private String name;
    private String phone;

    // 생성자가 필드를 초기화하도록 수정합니다.
    public Lottery(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        return (name + phone).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Lottery lottery = (Lottery) obj;
        return name.equals(lottery.name) && phone.equals(lottery.phone);
    }

    @Override
    public String toString() {
        return name + "(" + phone + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
