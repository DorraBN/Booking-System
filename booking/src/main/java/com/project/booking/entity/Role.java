package com.project.booking.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@EntityListeners(AuditingEntityListener.class)

public class Role {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
@Column(unique=true)
private String name;
@ManyToMany(mappedBy="roles")
@JsonIgnore // mpêche la sérialisation:elimine récursivité mène à une erreur d'exécution appelée StackOverflowError
    private List<User>users;
@CreatedDate
@Column(nullable=false,updatable=false)
private LocalDateTime createdDate;
@LastModifiedDate
@Column(insertable=false)
private LocalDateTime LastModifiedDate;
}
