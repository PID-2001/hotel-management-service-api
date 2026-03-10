package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseRoomImageDto {

    private Long image;
    private byte[] fileName;
    private byte[] resourceUrl;
    private byte[] directory;
    private byte[] hash;
    private Long roomId;
}