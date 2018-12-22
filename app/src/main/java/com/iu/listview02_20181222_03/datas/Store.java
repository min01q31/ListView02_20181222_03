package com.iu.listview02_20181222_03.datas;

public class Store {
    //클래스 : 변수 + 메쏘드 (+생성자)의 조합
    //변수에 직접 접근을 막음.
    private String logoImage;
    private String name;
    private String address;
    private int avgRating;
    private boolean menuOk;
    private String openAndCloseTime;
    private String phoneNum;

    public Store(String name, String address, int avgRating, String openAndCloseTime, String phoneNum){
        this.name = name;
        this.address = address;
        this.avgRating = avgRating;
        this.openAndCloseTime = openAndCloseTime;
        this.phoneNum = phoneNum;
    }
    public String getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(String logoImage) {
        this.logoImage = logoImage;
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

    public int getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(int avgRating) {
        this.avgRating = avgRating;
    }

    public boolean isMenuOk() {
        return menuOk;
    }

    public void setMenuOk(boolean menuOk) {
        this.menuOk = menuOk;
    }

    public String getOpenAndCloseTime() {
        return openAndCloseTime;
    }

    public void setOpenAndCloseTime(String openAndCloseTime) {
        this.openAndCloseTime = openAndCloseTime;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
