package com.manamovie.manamovie.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.manamovie.manamovie.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>  {
    
}
