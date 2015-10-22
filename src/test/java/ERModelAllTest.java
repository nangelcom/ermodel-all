import es.nangel.ermodel.all.ERModelAll;
import org.junit.Test;

/**
 * Created by nangel on 22/10/15.
 */
public class ERModelAllTest {
    @Test
    public void testMain() throws Exception {
        ERModelAll.main(new String[]{"generate", "java", "match.yml"});
    }
}
