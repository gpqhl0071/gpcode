package com.example.util;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author gao peng
 * @date 2018/10/29 10:59
 */
public class XMLUtil {
  /**
   * DOM4J方式将XML转储成MAP
   *
   * @return java.apsTemplate.Map
   * @param: [xml]
   * @author gao peng
   * @date 2018/10/24 10:03
   */
  public static Map readStringXmlOut(String xml) throws Exception {
    SAXReader saxReader = new SAXReader();
    Document doc = DocumentHelper.parseText(xml);
    Element root = doc.getRootElement();

    List childList = root.elements();
    Map<String, Object> resultMap = new HashMap<String, Object>();

    for (Iterator iter = root.elementIterator(); iter.hasNext(); ) {
      Element e = (Element) iter.next();

      for (Iterator iter1 = e.elementIterator(); iter1.hasNext(); ) {
        Element e1 = (Element) iter1.next();
        resultMap.put(e1.getName(), e1.getText());
      }
    }

    return resultMap;
  }
}
