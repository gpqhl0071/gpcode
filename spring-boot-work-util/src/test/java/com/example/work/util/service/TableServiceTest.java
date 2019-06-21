package test.com.example.work.util.service;

import com.example.SpringBootWorkUtilApplication;
import com.example.work.util.service.TableService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * TableService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>九月 27, 2018</pre>
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootWorkUtilApplication.class)
public class TableServiceTest {
  @Autowired
  private TableService tableService;

  @Before
  public void before() throws Exception {
  }

  @After
  public void after() throws Exception {
  }

  /**
   * Method: getTableInfo()
   */
  @Test
  public void testGetTableInfo() throws Exception {

    tableService.generatorJDBCMapper("t_agent_reward_punish_month");
  }

  @Test
  public void testGeneratorJDBCTemplate() throws Exception {

    String str = tableService.generatorJDBCTemplate("t_trade_detail_append");
    System.out.println(str);
  }

} 
