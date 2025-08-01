package model;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class User {

    private Integer id;

    private String username;

    private String email;

    private String passwordHash;

    private String fullName;

    private String phoneNumber;

    private String address;

    private String role = "Customer";          // Admin, Staff, Customer

    private boolean isActive  = true;
    private boolean isDeleted = false;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;

    /* ---------- Non-mapped helpers ---------- */
    private String password;                   // plain text only for form binding

    private CustomerProfile customerProfile;

    private List<RentalRequest> rentalRequests = new ArrayList<>();

    private List<RentalContract> rentalContracts = new ArrayList<>();

    private List<Payment> payments = new ArrayList<>();

    private List<Review> reviews = new ArrayList<>();

    private List<Review> adminReplies = new ArrayList<>();

    /* ---------- getters / setters (omitted for brevity) ---------- */
}
