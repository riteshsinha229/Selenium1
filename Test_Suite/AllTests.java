package Test_Suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TC01.class, TC02.class, TC03.class })
public class AllTests {

}
