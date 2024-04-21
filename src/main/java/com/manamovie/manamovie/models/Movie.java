package com.manamovie.manamovie.models;
import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String genre;

    @Column(columnDefinition = "TEXT")
    private String plot;

    @Column(nullable = false)
    private String director;
}
