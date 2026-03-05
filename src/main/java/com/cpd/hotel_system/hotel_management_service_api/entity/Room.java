package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Entity
@Table(name = "room")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long roomId;

    @Column(name = "room_number", length = 50, nullable = false)
    private String roomNumber;

    @Column(name = "type", length = 80, nullable = false)
    private String type;

    @Column(name = "bed_count", nullable = false)
    private int bedCount;

    @Column(name = "price", precision = 10, scale = 2, nullable = false)
    private BigDecimal price;

    @Column(name = "is_available")
    private Boolean isAvailable;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private java.util.List<Facility> facilities;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private java.util.List<RoomImage> roomImages;

}