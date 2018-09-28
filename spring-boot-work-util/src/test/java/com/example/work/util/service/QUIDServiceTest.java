package test.com.example.work.util.service;

import com.example.SpringBootWorkUtilApplication;
import com.example.work.util.service.QUIDService;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * QUIDService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>九月 28, 2018</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootWorkUtilApplication.class)
public class QUIDServiceTest {
  @Autowired
  private QUIDService quidService;

  @Before
  public void before() throws Exception {
  }

  @After
  public void after() throws Exception {
  }

  /**
   * Method: generatorInsert(String tableName)
   */
  @Test
  public void testGeneratorInsert() throws Exception {
    quidService.generatorInsert("t_agent");
  }

  @Test
  public void testGeneratorBatchInsert() throws Exception {
    quidService.generatorBatchInsert("t_agent");
  }

  @Test
  public void testGeneratorQueryById() throws Exception {
    quidService.generatorQueryById("t_agent");
  }

  @Test
  public void testGeneratorQueryPage() throws Exception {
    quidService.generatorQueryPage("t_agent");
  }
  /**
   * Method: getNames(List<Map<String, Object>> list)
   */
  @Test
  public void testGetNames() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = QUIDService.getClass().getMethod("getNames", List<Map<String,.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
  }

  /**
   * Method: getValues(List<Map<String, Object>> list)
   */
  @Test
  public void testGetValues() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = QUIDService.getClass().getMethod("getValues", List<Map<String,.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
  }

} 
