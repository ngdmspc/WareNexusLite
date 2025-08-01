package model;

import java.beans.Transient;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RentalContract {

    private Integer id;

    private RentalRequest rentalRequest;

    private String contractNumber;

    private User customer;

    private LocalDate startDate;
    private LocalDate endDate;

    private BigDecimal totalAmount;

    private BigDecimal depositPaid;

    private BigDecimal monthlyAmount;

    private String status = "Active";      // Active, Completed, …

    private String contractPath;           // PDF location

    private LocalDateTime signedAt;

    private LocalDateTime createdAt = LocalDateTime.now();

    /* ---- derived helpers ---- */
    @Transient public Integer getWarehouseId() { return rentalRequest != null
                                                     ? rentalRequest.getWarehouse().getId()
                                                     : null; }

    @Transient public BigDecimal getMonthlyPrice() { return monthlyAmount; }
    @Transient public void       setMonthlyPrice(BigDecimal v){ monthlyAmount = v; }

    @Transient public BigDecimal getDepositAmount(){ return depositPaid; }
    @Transient public void       setDepositAmount(BigDecimal v){ depositPaid = v; }

    @Transient
    public Warehouse getWarehouse() {
        return rentalRequest != null ? rentalRequest.getWarehouse() : null;
    }

    /* ---------- Relationships ---------- */
    private List<RentalItem> rentalItems = new ArrayList<>();

    private List<Payment> payments = new ArrayList<>();
}
