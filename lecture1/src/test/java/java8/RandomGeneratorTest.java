package java8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class RandomGeneratorTest {

    Random random;
    RandomGenerator randomGenerator;
    ArrayList<Integer> sequence;
    int upper_bound;

    @BeforeEach
    void setup(){
        random = new Random();
        randomGenerator = new RandomGenerator();
        sequence = new ArrayList<>();
        random.setSeed(1);
        randomGenerator.random.setSeed(1);
        upper_bound = 11;

        for (int i = 0; i < 5; i++){
            sequence.add(random.nextInt(upper_bound));
        }
    }

    @Test
    @DisplayName("Test if the number is in the set range:(1, upper_bound(exclusive))")
    void checkRange(){
        for (Integer random_numer: sequence
             ) {
            assertTrue(random_numer >= 1 && random_numer < upper_bound);
        }
    }


    @Test
    @DisplayName("Test the correctness of randomly generated numbers")
    void checkRandomness(){
        for (Integer expected_random_number: sequence
             ) {
            assertEquals(expected_random_number, randomGenerator.generate(upper_bound));
        }
    }
}