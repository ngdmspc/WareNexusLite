/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.beans.Transient;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class RentalRequest {

    private Integer id;

    private User customer;

    private Warehouse warehouse;

    private LocalDate requestedStartDate;

    private LocalDate requestedEndDate;

    private Integer rentalMonths;

    private BigDecimal totalAmount;

    private BigDecimal depositAmount;

    private String status = "Pending";    // Pending, Approved, …

    private String customerNote;

    private String adminNote;

    /* processedBy is nullable FK to User */
    private User processedByUser;

    private LocalDateTime processedAt;

    private LocalDateTime createdAt = LocalDateTime.now();

    @Transient public LocalDateTime getRequestDate()  { return createdAt; }
    @Transient public void          setRequestDate(LocalDateTime v) { createdAt = v; }

    @Transient public LocalDate getStartDate()        { return requestedStartDate; }
    @Transient public void      setStartDate(LocalDate v) { requestedStartDate = v; }

    @Transient public LocalDate getEndDate()          { return requestedEndDate; }
    @Transient public void      setEndDate(LocalDate v) { requestedEndDate = v; }

    @Transient public String getNote()                { return customerNote; }
    @Transient public void   setNote(String v)        { customerNote = v; }

    @Transient public LocalDateTime getResponseDate() { return processedAt; }
    @Transient public void          setResponseDate(LocalDateTime v) { processedAt = v; }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public LocalDate getRequestedStartDate() {
        return requestedStartDate;
    }

    public void setRequestedStartDate(LocalDate requestedStartDate) {
        this.requestedStartDate = requestedStartDate;
    }

    public LocalDate getRequestedEndDate() {
        return requestedEndDate;
    }

    public void setRequestedEndDate(LocalDate requestedEndDate) {
        this.requestedEndDate = requestedEndDate;
    }

    public Integer getRentalMonths() {
        return rentalMonths;
    }

    public void setRentalMonths(Integer rentalMonths) {
        this.rentalMonths = rentalMonths;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomerNote() {
        return customerNote;
    }

    public void setCustomerNote(String customerNote) {
        this.customerNote = customerNote;
    }

    public String getAdminNote() {
        return adminNote;
    }

    public void setAdminNote(String adminNote) {
        this.adminNote = adminNote;
    }

    public User getProcessedByUser() {
        return processedByUser;
    }

    public void setProcessedByUser(User processedByUser) {
        this.processedByUser = processedByUser;
    }

    public LocalDateTime getProcessedAt() {
        return processedAt;
    }

    public void setProcessedAt(LocalDateTime processedAt) {
        this.processedAt = processedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public RentalContract getRentalContract() {
        return rentalContract;
    }

    /* ---------- Relationship back to contract ---------- */
    public void setRentalContract(RentalContract rentalContract) {
        this.rentalContract = rentalContract;
    }

    private RentalContract rentalContract;
}