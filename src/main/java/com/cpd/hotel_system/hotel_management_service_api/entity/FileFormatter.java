package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileFormatter {

    @Lob
    @Column(name = "file_name")
    private byte[] fileName;

    @Lob
    @Column(name = "resource_url")
    private byte[] resourceUrl;

    @Lob
    @Column(name = "directory")
    private byte[] directory;

    @Lob
    @Column(name = "hash")
    private byte[] hash;

}