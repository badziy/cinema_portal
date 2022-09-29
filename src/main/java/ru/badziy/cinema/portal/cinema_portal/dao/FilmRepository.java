package ru.badziy.cinema.portal.cinema_portal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.badziy.cinema.portal.cinema_portal.entity.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {
}
