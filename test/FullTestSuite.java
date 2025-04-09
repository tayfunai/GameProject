import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Controller.GameEngineTest;
import Controller.MainGameLoopTest;
import Models.Orders.AdvanceOrderTest;
import Models.Orders.AirliftOrderTest;
import Models.Orders.BlockadeOrderTest;
import Models.Orders.BombOrderTest;
import Models.Orders.DeployOrderTest;
import Models.Orders.DiplomacyOrderTest;
import Models.OrdersTest;
import Models.PlayerTest;
import Models.WarMapTest;
import Phases.EditPhaseTest;
import Phases.PlayPhaseTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({GameEngineTest.class,
        MainGameLoopTest.class,
        OrdersTest.class,
        AdvanceOrderTest.class,
        DeployOrderTest.class,
        AirliftOrderTest.class,
        BombOrderTest.class,
        DiplomacyOrderTest.class,
        BlockadeOrderTest.class,
        PlayerTest.class,
        WarMapTest.class,
        EditPhaseTest.class,
        PlayPhaseTest.class
})
public class FullTestSuite {
}