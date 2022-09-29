package ru.badziy.cinema.portal.cinema_portal.entity;

import javax.persistence.*;

@Entity
@Table(name = "films")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFilms")
    private int idFilms;
    @Column(name = "Title")
    private String title;
    @Column(name = "Genre")
    private String genre;
    @Column(name = "Year")
    private int year;
    @Column(name = "Director")
    private String director;
    @Column(name = "Rating")
    private double rating;
    @Column(name = "Country")
    private String country;

    public Film() {
    }

    public Film(String title, String genre, int year, String director, double rating, String country) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.country = country;
    }

    public int getIdFilms() {
        return idFilms;
    }

    public void setIdFilms(int idFilms) {
        this.idFilms = idFilms;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
