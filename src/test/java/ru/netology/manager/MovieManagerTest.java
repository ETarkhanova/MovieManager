package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void shouldAddNullMovie() {
        MovieManager manager = new MovieManager(0);
        manager.addMovie(null);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovie() {
        MovieManager manager = new MovieManager(1);
        Movie first = new Movie(1, "Bloodshot", "thriller", "one");
        manager.addMovie(first);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovieNoArgs() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bloodshot", "thriller", "one");
        manager.addMovie(first);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGet5Movies() {
        MovieManager manager = new MovieManager(5);
        Movie first = new Movie(1, "Bloodshot", "thriller", "one");
        Movie second = new Movie(2, "Oneward", "cartoon", "two");
        Movie third = new Movie(3, "Hotel Belgrad", "comedy", "three");
        Movie forth = new Movie(4, "The Gentlemen", "thriller", "for");
        Movie fifth = new Movie(5, "Invisible Man", "horror", "five");
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(forth);
        manager.addMovie(fifth);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{fifth, forth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGet5MoviesNoArgs() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bloodshot", "thriller", "one");
        Movie second = new Movie(2, "Oneward", "cartoon", "two");
        Movie third = new Movie(3, "Hotel Belgrad", "comedy", "three");
        Movie forth = new Movie(4, "The Gentlemen", "thriller", "for");
        Movie fifth = new Movie(5, "Invisible Man", "horror", "five");
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(forth);
        manager.addMovie(fifth);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{fifth, forth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLast10Movies() {
        MovieManager manager = new MovieManager(10);
        Movie first = new Movie(1, "Bloodshot", "thriller", "one");
        Movie second = new Movie(2, "Oneward", "cartoon", "two");
        Movie third = new Movie(3, "Hotel Belgrad", "comedy", "three");
        Movie forth = new Movie(4, "The Gentlemen", "thriller", "for");
        Movie fifth = new Movie(5, "Invisible Man", "horror", "five");
        Movie sixth = new Movie(6, "Trolls World Tour", "cartoon", "six");
        Movie seventh = new Movie(7, "Number one", "comedy", "seven");
        Movie eighth = new Movie(8, "Eighth", "comedy", "eight");
        Movie ninth = new Movie(9, "Ninth", "thriller", "nine");
        Movie tenth = new Movie(10, "Tenth", "horror", "ten");
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(forth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, forth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLast10MoviesNoArgs() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bloodshot", "thriller", "one");
        Movie second = new Movie(2, "Oneward", "cartoon", "two");
        Movie third = new Movie(3, "Hotel Belgrad", "comedy", "three");
        Movie forth = new Movie(4, "The Gentlemen", "thriller", "for");
        Movie fifth = new Movie(5, "Invisible Man", "horror", "five");
        Movie sixth = new Movie(6, "Trolls World Tour", "cartoon", "six");
        Movie seventh = new Movie(7, "Number one", "comedy", "seven");
        Movie eighth = new Movie(8, "Eighth", "comedy", "eight");
        Movie ninth = new Movie(9, "Ninth", "thriller", "nine");
        Movie tenth = new Movie(10, "Tenth", "horror", "ten");
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(forth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, forth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetMoreThan10Movies() {
        MovieManager manager = new MovieManager(10);
        Movie first = new Movie(1, "Bloodshot", "thriller", "one");
        Movie second = new Movie(2, "Oneward", "cartoon", "two");
        Movie third = new Movie(3, "Hotel Belgrad", "comedy", "three");
        Movie forth = new Movie(4, "The Gentlemen", "thriller", "for");
        Movie fifth = new Movie(5, "Invisible Man", "horror", "five");
        Movie sixth = new Movie(6, "Trolls World Tour", "cartoon", "six");
        Movie seventh = new Movie(7, "Number one", "comedy", "seven");
        Movie eighth = new Movie(8, "Eighth", "comedy", "eight");
        Movie ninth = new Movie(9, "Ninth", "thriller", "nine");
        Movie tenth = new Movie(10, "Tenth", "horror", "ten");
        Movie eleventh = new Movie(11, "Eleventh", "horror", "eleven");
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(forth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, forth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetMoreThan10MoviesNoArgs() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bloodshot", "thriller", "one");
        Movie second = new Movie(2, "Oneward", "cartoon", "two");
        Movie third = new Movie(3, "Hotel Belgrad", "comedy", "three");
        Movie forth = new Movie(4, "The Gentlemen", "thriller", "for");
        Movie fifth = new Movie(5, "Invisible Man", "horror", "five");
        Movie sixth = new Movie(6, "Trolls World Tour", "cartoon", "six");
        Movie seventh = new Movie(7, "Number one", "comedy", "seven");
        Movie eighth = new Movie(8, "Eighth", "comedy", "eight");
        Movie ninth = new Movie(9, "Ninth", "thriller", "nine");
        Movie tenth = new Movie(10, "Tenth", "horror", "ten");
        Movie eleventh = new Movie(11, "Eleventh", "horror", "eleven");
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(forth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, forth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLast5MoviesOutOf10() {
        MovieManager manager = new MovieManager(5);
        Movie first = new Movie(1, "Bloodshot", "thriller", "one");
        Movie second = new Movie(2, "Oneward", "cartoon", "two");
        Movie third = new Movie(3, "Hotel Belgrad", "comedy", "three");
        Movie forth = new Movie(4, "The Gentlemen", "thriller", "for");
        Movie fifth = new Movie(5, "Invisible Man", "horror", "five");
        Movie sixth = new Movie(6, "Trolls World Tour", "cartoon", "six");
        Movie seventh = new Movie(7, "Number one", "comedy", "seven");
        Movie eighth = new Movie(8, "Eighth", "comedy", "eight");
        Movie ninth = new Movie(9, "Ninth", "thriller", "nine");
        Movie tenth = new Movie(10, "Tenth", "horror", "ten");
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(forth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLast3MoviesInsteadOf5() {
        MovieManager manager = new MovieManager(5);
        Movie first = new Movie(1, "Bloodshot", "thriller", "one");
        Movie second = new Movie(2, "Oneward", "cartoon", "two");
        Movie third = new Movie(3, "Hotel Belgrad", "comedy", "three");

        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{third, second, first};
        assertArrayEquals(expected, actual);
    }
}


