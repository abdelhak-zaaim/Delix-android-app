package com.fsdm.pfe.delix.model;

import com.fsdm.pfe.delix.model.enums.Role;
import com.google.android.datatransport.runtime.dagger.Component;

@Component.Builder

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Role role;
    private String address;
    private String token;
    private String licenseNumber;

    private String vehicularMatriculate;

    private MapsLocationPoint locationPoint;


}
