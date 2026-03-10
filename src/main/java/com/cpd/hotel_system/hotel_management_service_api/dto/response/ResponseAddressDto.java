package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseAddressDto {

    private Long addressId;
    private String address;
    private String city;
    private String country;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private Long branchId;
}