package test.com.example.work.util.dao;

import com.example.SpringBootWorkUtilApplication;
import com.example.work.util.dao.TestDao;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * TestDao Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十月 15, 2018</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootWorkUtilApplication.class)
public class TestDaoTest {
  @Autowired
  private TestDao testDao;

  @Before
  public void before() throws Exception {
  }

  @After
  public void after() throws Exception {
  }

  /**
   * Method: test()
   */
  @Test
  public void testTest() throws Exception {
    testDao.test();
  }


} 
