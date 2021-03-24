package com.springdeveloper.app.service;

import java.util.List;

import com.springdeveloper.app.shared.dto.AddressDTO;

public interface AddressService {
	List<AddressDTO> getAddresses(String userId);
    AddressDTO getAddress(String addressId);
}
