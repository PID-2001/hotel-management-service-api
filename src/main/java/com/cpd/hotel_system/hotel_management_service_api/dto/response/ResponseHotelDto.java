package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseHotelDto {

    private Long hotelId;
    private String name;
    private int starRatings;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean activeStatus;
    private BigDecimal startingFrom;
//    private List<ResponseBranchDto> branches;
}