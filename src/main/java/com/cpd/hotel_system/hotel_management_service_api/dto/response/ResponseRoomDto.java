package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseRoomDto {

    private Long roomId;
    private String roomNumber;
    private String type;
    private int bedCount;
    private BigDecimal price;
    private Boolean isAvailable;
    private Long branchId;
    private List<ResponseFacilityDto> facilities;
    private List<ResponseRoomImageDto> roomImages;
}