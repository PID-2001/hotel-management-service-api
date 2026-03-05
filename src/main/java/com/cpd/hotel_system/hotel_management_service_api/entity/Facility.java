package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "facility")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 250, nullable = false)
    private String name;

    @Column(name = "facilities", length = 250, nullable = false)
    private String facilities;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

}