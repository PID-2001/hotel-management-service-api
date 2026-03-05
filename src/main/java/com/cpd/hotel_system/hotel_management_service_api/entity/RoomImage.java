package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "room_image")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image")
    private Long image;

    @Embedded
    private FileFormatter fileFormatter;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

}