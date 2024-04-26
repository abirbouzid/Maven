package bmt;
import org.junit.Test;
import static org.junit.Assert.*;


public class FoodTasterTest {
    
    private double calculateAverageRating(int[] ratings) {
        double totalRating = 0;
        for (int rating : ratings) {
            totalRating += rating;
        }
        return totalRating / ratings.length;
    }
    

    @Test
    public void testPositiveAverageRating() {
        int[] ratings = {5, 5, 5, 5};
        double expectedAverage = 5.0;

        double actualAverage = calculateAverageRating(ratings);

        assertEquals(expectedAverage, actualAverage, 0.001);
         // Add assertTrue assertion
        assertTrue(actualAverage >= 0); // Ensures actualAverage is positive or zero
    }
    
    @Test
    public void testZeroAverageRating() {
        int[] ratings = {0, 0, 0, 0};
        double expectedAverage = 0.0;

        double actualAverage = calculateAverageRating(ratings);

        assertEquals(expectedAverage, actualAverage, 0.001);
    }
    
    @Test
    public void testNegativeAverageRating() {
        int[] ratings = {-1, -2, -3, -4};
        double expectedAverage = -2.5;

        double actualAverage = calculateAverageRating(ratings);

        assertEquals(expectedAverage, actualAverage, 0.001);
    }

   
 
}
