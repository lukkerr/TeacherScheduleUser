package com.pdist.user.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "cpf"),
        @UniqueConstraint(columnNames = "matricula")})
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String cpf;

    @NotNull
    private String matricula;

    @NotNull
    private String password;

    @NotNull
    private Boolean isTeacher;

    @NotNull
    private String email;

    @NotNull
    private String telefone;

    @OneToMany(mappedBy = "id")
    @JsonIgnore
    private List<Message> messages = new ArrayList<>();
}
