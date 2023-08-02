import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

public class MovieManagerTest {
    MovieManager manager = new MovieManager(5);

    @Test
    public void setup() {
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
    }

    @Test
    public void test1FindLast() {
        MovieManager manager = new MovieManager();
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");



        String[] actual = manager.findLast();
        String[] expected = {"Movie 5","Movie 4","Movie 3","Movie 2","Movie 1"};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test2FindLast() {
        MovieManager manager = new MovieManager();
        manager.add("Movie 1");


        String[] actual = manager.findLast();
        String[] expected = {"Movie 1"};

        assertArrayEquals(actual, expected);

    }

    @Test
    public void test3FindLast() {
        MovieManager manager = new MovieManager();
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");



        String[] actual = manager.findLast();
        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test4FindLast() {
        MovieManager manager = new MovieManager();


        String[] actual = manager.findLast();
        String[] expected = {};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testFindAll() {
        MovieManager manager = new MovieManager();
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");



        String[] actual = manager.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5"};

        assertArrayEquals(actual, expected);
    }

}