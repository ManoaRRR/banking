package com.projetTrans.prjetTrans.dto;

import com.projetTrans.prjetTrans.model.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@Builder
public class AddressDto {
    private Integer id;
    private String street;
    private Integer houseNumber;
    private String city;
    private String zipCode;
    private String country;
    public static AddressDto fromEntity(Address address){
        return AddressDto.builder()
                .id(address.getId())
                .street(address.getStreet())
                .houseNumber(address.getHouseNumber())
                .city(address.getCity())
                .country(address.getCountry())
                .zipCode(address.getZipCode())
                .build();
    }
    public static Address toEntity(AddressDto address){
        return Address.builder()
                .id(address.getId())
                .street(address.getStreet())
                .houseNumber(address.getHouseNumber())
                .city(address.getCity())
                .country(address.getCountry())
                .zipCode(address.getZipCode())
                .build();
    }
}
