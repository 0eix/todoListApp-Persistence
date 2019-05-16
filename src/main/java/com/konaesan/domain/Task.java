package com.konaesan.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task implements Serializable
{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDate dueDate;
    private Boolean completed;
}
