import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import tvstreaming.Series;

/**
 *
 * @author Dell
 */
public class UnitTest {
    ArrayList<Series> model; 
    Series seriesApp;
    
    
    @BeforeEach
    public void setUp() {
        ArrayList<Series> model = new ArrayList<>(); 
        Series seriesApp = new Series();
    
        model.add(new Series("t123", "Dawn of the dead", "18", "10"));
        model.add(new Series("t456", "Clutter", "12", "2"));
    
    }
     
    public void TestSearchSeries() {
      Series result = seriesApp.searchSeries(model, "t456");
      assertNotNull(result,"Should be found");
        assertEquals("Clutter",result.getSeriesName());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    @Tests
    public void hello() {}
}
