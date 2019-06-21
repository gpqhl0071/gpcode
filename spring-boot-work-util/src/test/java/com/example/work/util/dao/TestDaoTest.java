package test.com.example.work.util.dao;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateUtil;

import com.example.SpringBootWorkUtilApplication;
import com.example.work.util.dao.TableDao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * TestDao Tester.
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十月 15, 2018</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootWorkUtilApplication.class)
public class TestDaoTest {
  @Autowired
  private TableDao testDao;

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

    List<Map<String, Object>> list = testDao.get();

    System.out.println(DateUtil.offsetMinute(DateUtil.parse("2019-01-01 00:00:00"), 30));

    int key1;
    int key2;
    Map<String, Integer> mapdemo = new LinkedHashMap<String, Integer>();


    for (Map<String, Object> map : list) {
      int count = 1;

      Date d = Convert.toDate(map.get("apply_time"));
      key1 = DateUtil.hour(d, true);
      if (DateUtil.minute(d) < 30) {
        key2 = 30;
      } else {
        key2 = 59;
      }


      String key = key1 + ":" + key2;
      if (mapdemo.containsKey(key)) {
        count = count + (Integer) mapdemo.get(key);
      }
      mapdemo.put(key, count);

    }

    for (Map.Entry<String, Integer> entry : mapdemo.entrySet()) {
      String[] key = entry.getKey().split(":");
      key1 = Integer.parseInt(key[1]);
      if (key1 == 59) {
        int key0 = Integer.parseInt(key[0]);
        key0 = key0 + 1;

        System.out.println("Key = " + key[0] + ":30 - " + key0 + ":00, Value = " + entry.getValue());
      } else {
        System.out.println("Key = " + key[0] + ":00 - " + key[0] + ":" + key[1] + ", Value = " + entry.getValue());
      }

    }

  }


} 
