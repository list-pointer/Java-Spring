package com.mavenappusingannoation.mavenappusingannoation;

public class Tyre {
    private String brand,companyType;
    Tyre(String brand,String companyType)
    {
        super();
        this.brand=brand;
        this.companyType=companyType;
    }
//    public String getBrand() {
//        return brand;
//    }

//    public void setBrand(String brand) {
//        this.brand = brand;
//    }

//    @Override
//    public String toString() {
//        return "Tyre{" +
//                "brand='" + brand + '\'' +
//                '}'+" Company";
//    }

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                ", companyType='" + companyType + '\'' +
                '}';
    }
}
