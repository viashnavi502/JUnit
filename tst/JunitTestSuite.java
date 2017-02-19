import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        JavaTest.class,
        test_dataTypes.class,
        TestAnnotations.class,
        TestJunit.class,
        UsingAssertion.class
})

public class JunitTestSuite {
} 