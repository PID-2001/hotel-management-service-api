package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import com.cpd.hotel_system.hotel_management_service_api.enums.BranchType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseBranchDto {

    private Long branchId;
    private int roomCount;
    private BranchType branchType;
    private String branchName;
    private Long hotelId;
    private ResponseAddressDto address;
    private List<ResponseRoomDto> rooms;
}