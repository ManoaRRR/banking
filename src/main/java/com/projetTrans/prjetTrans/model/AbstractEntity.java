package com.projetTrans.prjetTrans.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.time.LocalDateTime;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@EntityListeners(EnableJpaAuditing.class)
public class AbstractEntity {
    @Id
    @GeneratedValue
    private Integer id;

    @CreatedDate
    @Column(name = "createDte",nullable = false, updatable = false)
    private LocalDateTime creationDate;

    @LastModifiedDate
    @Column(name="lastModifiedDate")
    private LocalDateTime lastModifiedDate;


}
