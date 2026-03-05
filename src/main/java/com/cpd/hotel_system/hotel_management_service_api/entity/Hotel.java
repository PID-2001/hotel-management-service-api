package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "hotel")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_id")
    private Long hotelId;

    @Column(name = "name", length = 250, nullable = false)
    private String name;

    @Column(name = "star_ratings", nullable = false)
    private int starRatings;

    @Column(nullable = false)
    @Lob
    private Blob description;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at" ,nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "active_status")
    private Boolean activeStatus;

    @Column(name = "starting_from", precision = 10, scale = 2)
    private BigDecimal startingFrom;

    @OneToMany(mappedBy = "hotel" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Branch> branches;

}