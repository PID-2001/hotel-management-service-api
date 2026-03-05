package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Entity
@Table(name = "address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;

    @Column(name = "address", length = 80, nullable = false)
    private String address;

    @Column(name = "city", length = 80, nullable = false)
    private String city;

    @Column(name = "country", length = 80, nullable = false)
    private String country;

    @Column(name = "longitude", precision = 10, scale = 6)
    private BigDecimal longitude;

    @Column(name = "latitude", precision = 10, scale = 6)
    private BigDecimal latitude;

    @OneToOne
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch;

}