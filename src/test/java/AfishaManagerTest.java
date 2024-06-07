import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

public class AfishaManagerTest {

    AfishaManager manager = new AfishaManager();
    String film1 = "first";
    String film2 = "second";
    String film3 = "third";
    String film4 = "fourth";
    String film5 = "fifth";
    String film6 = "sixth";
    String film7 = "seventh";
    String film8 = "eighth";
    

    @Test
    public void shouldFindAll() {

        manager.add(film1);
        manager.add(film5);
        manager.add(film2);

        String[] expected = {film1, film5, film2};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLessThenLimit() {

        AfishaManager manager = new AfishaManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        String[] expected = {film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfEqualsLimit() {

        AfishaManager manager = new AfishaManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        String[] expected = {film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfMoreThenLimit() {

        AfishaManager manager = new AfishaManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);

        String[] expected = {film8, film7, film6, film5, film4};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithCustomLimit() {

        AfishaManager manager = new AfishaManager(7);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);

        String[] expected = {film8, film7, film6, film5, film4, film3, film2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
