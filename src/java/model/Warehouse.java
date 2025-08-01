/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.beans.Transient;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP Victus
 */
public class Warehouse {

    private Integer id;

    private WarehouseType warehouseType;

    private String name;

    private String description;

    private String address;

    private String district;

    private String city;

    private BigDecimal area;                  // m²

    private BigDecimal pricePerMonth;

    private String status = "Available";      // Available, Rented, Maintenance

    private String features;                  // JSON or CSV

    private BigDecimal latitude;

    private BigDecimal longitude;

    private boolean isActive  = true;
    private boolean isDeleted = false;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt = LocalDateTime.now();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public WarehouseType getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(WarehouseType warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public BigDecimal getPricePerMonth() {
        return pricePerMonth;
    }

    public void setPricePerMonth(BigDecimal pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<WarehouseImage> getWarehouseImages() {
        return warehouseImages;
    }

    public void setWarehouseImages(List<WarehouseImage> warehouseImages) {
        this.warehouseImages = warehouseImages;
    }

    public List<RentalRequest> getRentalRequests() {
        return rentalRequests;
    }

    public void setRentalRequests(List<RentalRequest> rentalRequests) {
        this.rentalRequests = rentalRequests;
    }

    public List<RentalItem> getRentalItems() {
        return rentalItems;
    }

    public void setRentalItems(List<RentalItem> rentalItems) {
        this.rentalItems = rentalItems;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
    

    /* --- Derived availability flag --- */
    @Transient
    public boolean isAvailable() {
        return "Available".equals(status) && isActive && !isDeleted;
    }

    /* ---------- Relationships ---------- */
    private List<WarehouseImage> warehouseImages = new ArrayList<>();

    private List<RentalRequest> rentalRequests = new ArrayList<>();

    private List<RentalItem> rentalItems = new ArrayList<>();

    private List<Review> reviews = new ArrayList<>();

    /* Convenience alias for service layer */
    @Transient
    public List<WarehouseImage> getImages() { return warehouseImages; }
}
