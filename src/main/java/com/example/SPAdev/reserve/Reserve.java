package com.example.SPAdev.reserve;

import lombok.*;
import org.apache.tomcat.jni.Local;
import org.hibernate.annotations.Cache;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String name;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;


    @Column(name = "check_in_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate checkInDate;


    @Column(name = "check_out_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate checkOutDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    public void changeName (String name) { this.name = name; }
    public void changePhoneNumber (String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void changeCheckInDate ( LocalDate checkInDate ) { this.checkInDate = checkInDate; }
    public void changeCheckOutDate ( LocalDate checkOutDate ) { this.checkOutDate = checkOutDate; }
}
