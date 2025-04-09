package Models.Orders;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdvanceOrderTest.class,
        DeployOrderTest.class,
        AirliftOrderTest.class,
        BombOrderTest.class,
        DiplomacyOrderTest.class,
        BlockadeOrderTest.class,
})
public class OrdersTestSuite {
}