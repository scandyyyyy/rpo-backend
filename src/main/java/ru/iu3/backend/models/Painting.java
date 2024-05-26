package ru.iu3.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "paintings")
@Access(AccessType.FIELD)
public class Painting {

    public Painting() { }

    public Painting(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public long id;

    @Column(name = "name", nullable = false, length = 45)
    public String name;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artistid", referencedColumnName = "id")
    public Artist artist;

    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name = "museumid")
    public Museum museum;

    @Column(name = "year", nullable = true)
    public Integer year;
}