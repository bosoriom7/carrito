package com.carrito.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Data
@Entity
@Getter
@Setter
@Table(name = "Usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    //private String rol;
    //private Date fechaCreacion;

    public Usuarios() {
        // Constructor sin argumentos
    }
    public Usuarios(String username, String email, String password, List<Authority> authorities) {
        this.username = username;
        this.email = email;
        this.password = password;
        //this.authorities = authorities;
    }

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable (name = "user_authority",
//                joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
//                inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
//    private List<Authority> authorities;
}
