package com.mariomanhique.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE
    )
    private Integer id;

    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;

    private LocalDateTime lastModifiedAt;

    private String createdBy;

    private String lastUpdatedBy;
}
