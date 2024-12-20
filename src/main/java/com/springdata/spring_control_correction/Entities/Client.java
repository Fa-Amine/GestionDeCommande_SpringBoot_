package com.springdata.spring_control_correction.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Client {
    @Id
    private int CIN;

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String Address;
    @Column
    private Date dateOfBirth;

    @OneToMany (mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Order> orders = new ArrayList<>();


}
