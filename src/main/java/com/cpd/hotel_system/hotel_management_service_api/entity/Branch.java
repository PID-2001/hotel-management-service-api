package com.cpd.hotel_system.hotel_management_service_api.entity;

import com.cpd.hotel_system.hotel_management_service_api.enums.BranchType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "branch")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_id")
    private Long branchId;

    @Column(name = "room_count", nullable = false)
    private int roomCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "branch_type")
    private BranchType branchType;

    @Column(name = "branch_name", length = 100, nullable = false)
    private String branchName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    @OneToOne(mappedBy = "branch", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Address address;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
    private List<Room> rooms;


}