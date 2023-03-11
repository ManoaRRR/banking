package com.projetTrans.prjetTrans.dto;

import com.projetTrans.prjetTrans.model.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class AddressDto {
    @NotNull
    @NotBlank
    private Integer id;
    @NotNull
    @NotBlank
    private String street;
    @NotNull
    @NotBlank
    private Integer houseNumber;
    @NotNull
    @NotBlank
    private String city;
    @NotNull
    @NotBlank
    private String zipCode;
    @NotNull
    @NotBlank
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
