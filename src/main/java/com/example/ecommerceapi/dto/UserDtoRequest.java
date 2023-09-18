package com.example.ecommerceapi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDtoRequest {



    String lastName;
    String firstName;
    String email;
    String password;
}
