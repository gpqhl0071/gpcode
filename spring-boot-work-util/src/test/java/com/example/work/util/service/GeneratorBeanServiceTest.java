package test.com.example.work.util.service;

import com.example.SpringBootWorkUtilApplication;
import com.example.work.util.service.GeneratorBeanService;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * GeneratorBeanService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>九月 30, 2018</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootWorkUtilApplication.class)
public class GeneratorBeanServiceTest {
  @Autowired
  private GeneratorBeanService generatorBeanService;

  @Before
  public void before() throws Exception {
  }

  @After
  public void after() throws Exception {
  }

  /**
   * Method: handle(String tableName)
   */
  @Test
  public void testHandle() throws Exception {
    System.out.println(generatorBeanService.handle("t_fanpai_record"));
  }


} 
