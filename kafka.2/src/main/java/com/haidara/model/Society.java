package com.haidara.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Society {
    private long id;
    private String name;
    private String address;
    private String phone;
}
