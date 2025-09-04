package com.example.shoppingdealsapi.model;

public class Deal {
    private String id;
    private String brand;
    private String productName;
    private Double originalPrice;
    private Double discountedPrice;
    private Integer discountPercentage;
    private String store;

    // Constructor
    public Deal(String id, String brand, String productName, Double originalPrice,
                Double discountedPrice, Integer discountPercentage, String store) {
        this.id = id;
        this.brand = brand;
        this.productName = productName;
        this.originalPrice = originalPrice;
        this.discountedPrice = discountedPrice;
        this.discountPercentage = discountPercentage;
        this.store = store;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public Double getOriginalPrice() { return originalPrice; }
    public void setOriginalPrice(Double originalPrice) { this.originalPrice = originalPrice; }

    public Double getDiscountedPrice() { return discountedPrice; }
    public void setDiscountedPrice(Double discountedPrice) { this.discountedPrice = discountedPrice; }

    public Integer getDiscountPercentage() { return discountPercentage; }
    public void setDiscountPercentage(Integer discountPercentage) { this.discountPercentage = discountPercentage; }

    public String getStore() { return store; }
    public void setStore(String store) { this.store = store; }
}