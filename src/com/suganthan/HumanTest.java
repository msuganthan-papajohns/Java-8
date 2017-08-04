package com.suganthan;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by msuganthan on 8/4/2017.
 */
public class HumanTest {

    @Test
    public void testPreLamdaSort() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Sarah", 12));
        humans.add(new Human("Sarah", 10));
        humans.add(new Human("Jack", 12));

        //Pre-Java
        /*Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return h1.getName().compareTo(h2.getName());
            }
        });*/

        //Inline comparision
        //humans.sort((Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));

        //Using static function
        //humans.sort((h1, h2) -> h1.getName().compareTo(h2.getName()));

        //Use static function
        //humans.sort(Human::compareByNameThenAge);

        //Using instance method
        //Collections.sort(humans, Comparator.comparing(Human::getName));

        //Reverse the sort
        //Comparator<Human> comparator = (h1, h2) -> h1.getName().compareTo(h2.getName());
        //humans.sort(comparator.reversed());

        //Sort on multiple condition

        /*humans.sort((lhs, rhs) -> {
            if(lhs.getName().equals(rhs.getName())) {
                return lhs.getAge() - rhs.getAge();
            } else {
                return lhs.getName().compareTo(rhs.getName());
            }
        });*/

        humans.sort(Comparator.comparing(Human::getName).thenComparing(Human::getAge));

        assertEquals("Jack", humans.get(0).getName());
    }
}
