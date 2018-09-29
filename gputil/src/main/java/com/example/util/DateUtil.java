package com.example.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author gao peng
 * @date 2018/9/29 10:48
 */
public class DateUtil {

  /**
   * 缺省日期格式 yyyy/MM/dd
   */
  public static final String DEFAULT_DATE_FMT = "yyyy/MM/dd";

  /**
   * 缺省日期格式 yyyy-MM-dd
   */
  public static final String DEFAULT_DATE_FMT_2 = "yyyy-MM-dd";

  /**
   * 缺省时间格式 yyyy/MM/dd HH:mm:ss
   */
  public static final String DEFAULT_TIME_FMT = "yyyy/MM/dd HH:mm:ss";

  /**
   * 缺省时间格式 yyyy-MM-dd HH:mm:ss
   */
  public static final String SQL_TIME_FMT = "yyyy-MM-dd HH:mm:ss";

  /**
   * 当天的最小时间 yyyy-MM-dd 00:00:00
   **/
  public static final String SQL_TIME_FMT_MIN = "yyyy-MM-dd 00:00:00";

  /**
   * 当天的最大时间 yyyy-MM-dd 23:59:59
   **/
  public static final String SQL_TIME_FMT_MAX = "yyyy-MM-dd 23:59:59";

  /**
   * 页面上到小时的日期格式  yyyy-MM-dd HH
   */
  public static final String YYMMDDHHFMT = "yyyy-MM-dd HH";

  /**
   * 页面上到小时分钟的日期格式 yyyy-MM-dd HH:mm
   */
  public static final String YYMMDDHHMMFMT = "yyyy-MM-dd HH:mm";

  /**
   * 页面上到天的日期格式 yyyy-MM-dd
   */
  public static final String YYYYMMDDFMT = "yyyy-MM-dd";
  /**
   * 日期格式 yyyyMMdd
   */
  public static final String YYYYMMDD = "yyyyMMdd";

  /**
   * 日期时间格式 yyyyMMddHHmmss
   */
  public static final String YYYYMMDDHHmmss = "yyyyMMddHHmmss";
  /**
   * 日期时间格式 HHmmss
   */
  public static final String HHmmss = "HHmmss";

  /**
   * 全部时区名字
   */
  private static final List<String> TimeZoneIds = Arrays.asList(TimeZone.getAvailableIDs());

  /**
   * 自定义时区缓存
   */
  private static final Map<String, TimeZone> TimeZoneCache = new HashMap<String, TimeZone>();

  /**
   * 北京时区
   */
  public static final TimeZone timeZoneBeijing = TimeZone.getTimeZone("Asia/Shanghai");

  /**
   * 一小时的毫秒数
   */
  public static final long HOUR_MICRO_SECONDS = 3600 * 1000;

  public static final String CHINESE_DATE_FMT = "yyyy年MM月dd日 HH时mm分";

  public static final String CHINESEALL_DATE_FMT = "yyyy年MM月dd日 HH时mm分ss秒";

  /**
   * 转换日期毫秒数为缺省日期格式字符串
   */
  public static String Date2String(long date) {
    return Date2String(new Date(date), DEFAULT_DATE_FMT, null);
  }

  /**
   * 转换日期毫秒数为缺省日期格式字符串
   */
  public static String Date2String(long date, TimeZone timeZone) {
    return Date2String(new Date(date), DEFAULT_DATE_FMT, timeZone);
  }

  /**
   * 转换日期为缺省日期格式字符串
   */
  public static String Date2String(Date date) {
    return Date2String(date, DEFAULT_DATE_FMT, null);
  }

  /**
   * 转换日期为缺省日期格式字符串
   */
  public static String Date2String(Date date, TimeZone timeZone) {
    return Date2String(date, DEFAULT_DATE_FMT, timeZone);
  }

  /**
   * 转换日期毫秒数为缺省日期格式字符串
   */
  public static String Time2String(long date) {
    return Date2String(new Date(date), DEFAULT_TIME_FMT, null);
  }

  /**
   * 转换日期毫秒数为缺省日期格式字符串
   */
  public static String Time2String(long date, TimeZone timeZone) {
    return Date2String(new Date(date), DEFAULT_TIME_FMT, timeZone);
  }

  /**
   * 转换日期为缺省日期格式字符串
   */
  public static String Time2String(Date date) {
    return Date2String(date, DEFAULT_TIME_FMT, null);
  }

  /**
   * 转换日期为缺省日期格式字符串
   */
  public static String Time2String(Date date, TimeZone timeZone) {
    return Date2String(date, DEFAULT_TIME_FMT, timeZone);
  }

  /**
   * 转换日期为指定格式字符串
   */
  public static String Date2String(Date date, String format) {
    return Date2String(date, format, null);

  }

  /**
   * 转换日期为指定格式字符串
   */
  public static String Date2String(Date date, String format, TimeZone timeZone) {
    if (date == null || format == null) {
      return null;
    }
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    if (timeZone != null) {
      sdf.setTimeZone(timeZone);
    }
    return sdf.format(date);

  }

  /**
   * 解析日期时间字符串,支持 yyMMdd,yyyyMMdd, yyyy-MM-dd, yyyy/MM/dd, yyyyMMddHHmm, yyyyMMddHHmmss, yyyyMMddHHmmssSSS, yyyy-MM-dd
   * HH:mm:ss, yyyy-MM-dd HH:mm:ss.SSS 格式, 其它方式结果不保证正确
   *
   * @return date
   */
  public static Date String2Date(String str) {
    return String2Date(str, (TimeZone) null);
  }

  /**
   * 解析日期时间字符串,支持 yyMMdd,yyyyMMdd, yyyy-MM-dd, yyyy/MM/dd, yyyyMMddHHmm, yyyyMMddHHmmss, yyyyMMddHHmmssSSS, yyyy-MM-dd
   * HH:mm:ss, yyyy-MM-dd HH:mm:ss.SSS 格式, 其它方式结果不保证正确
   *
   * @return date
   */
  public static Date String2Date(String str, TimeZone timeZone) {
    if (str == null) {
      return null;
    }
    str = str.trim();
    if (str.length() == 6) {
      return String2Date(str, "yyMMdd", timeZone);
    }
    if (str.length() == 8) {
      return String2Date(str, "yyyyMMdd", timeZone);
    }
    if (str.length() == 10) {
      if (str.indexOf("-") != -1) {
        return String2Date(str, "yyyy-MM-dd", timeZone);
      }

      if (str.indexOf("/") != -1) {
        return String2Date(str, "yyyy/MM/dd", timeZone);
      }
    }
    if (str.length() == 12) {
      return String2Date(str, "yyyyMMddHHmm", timeZone);
    }
    if (str.length() == 14) {
      return String2Date(str, "yyyyMMddHHmmss", timeZone);
    }
    if (str.length() == 17) {
      return String2Date(str, "yyyyMMddHHmmssSSS", timeZone);
    }
    if (str.length() == 19) {
      if (str.indexOf("-") != -1) {
        return String2Date(str, "yyyy-MM-dd HH:mm:ss", timeZone);
      }
      if (str.indexOf("/") != -1) {
        return String2Date(str, "yyyy/MM/dd HH:mm:ss", timeZone);
      }
    }
    if (str.length() == 23) {
      if (str.indexOf("-") != -1) {
        return String2Date(str, "yyyy-MM-dd HH:mm:ss.SSS", timeZone);
      }
      if (str.indexOf("/") != -1) {
        return String2Date(str, "yyyy/MM/dd HH:mm:ss.SSS", timeZone);
      }
    }
    if (str.length() == 21) {
      if (str.indexOf("-") != -1) {
        return String2Date(str, "yyyy-MM-dd HH:mm:ss", timeZone);
      }
      if (str.indexOf("/") != -1) {
        return String2Date(str, "yyyy/MM/dd HH:mm:ss", timeZone);
      }
    }
    try {
      return new SimpleDateFormat().parse(str);
    } catch (ParseException e) {
      return null;
      //throw new BfwRuntimeException("validation.date.parse_error");
    }
  }

  /**
   * 按指定方式解析日期时间
   */
  public static Date String2Date(String str, String format) {
    return String2Date(str, format, null);
  }

  /**
   * 按指定方式解析日期时间
   */
  public static Date String2Date(String str, String format, TimeZone timeZone) {
    if (format == null) {
      format = DEFAULT_DATE_FMT;
    }
    SimpleDateFormat fmt = new SimpleDateFormat(format);
    if (timeZone != null) {
      fmt.setTimeZone(timeZone);
    }
    try {
      return fmt.parse(str);
    } catch (ParseException e) {
      return null;//throw new BfwRuntimeException("validation.date.parse_error", e);
    }
  }

  /**
   * 比较两个日期是否是一天(不考虑时间)
   */
  public static boolean isDateEqual(Date date1, Date date2) {
    return truncDate(date1).equals(truncDate(date2));
  }

  /**
   * 比较date1是否是date2后的一个日期,或相等
   */
  public static boolean isDateAfter(Date date1, Date date2) {
    return truncDate(date1).equals(truncDate(date2)) || truncDate(date1).after(truncDate(date2));

  }


  /**
   * 比较两个日期是否是一天(不考虑时间)
   */
  public static boolean isDateEqual(Date date1, Date date2, TimeZone timeZone) {
    return truncDate(date1, timeZone).equals(truncDate(date2, timeZone));
  }

  /**
   * 返回某日零时整
   */
  public static Date truncDate(Date date) {
    return truncDate(date, Calendar.DATE);
  }

  /**
   * 返回某日零时整
   */
  public static Date truncDate(Date date, TimeZone timeZone) {
    return truncDate(date, Calendar.DATE, timeZone);
  }

  /**
   * 日期时间取整，支持年、月、周、日、时、分、秒
   *
   * @return date
   */
  public static Date truncDate(Date date, int mode) {
    return truncDate(date, mode, null);
  }

  /**
   * 日期时间取整，支持年、月、周、日、时、分、秒
   *
   * @return date
   */
  public static Date truncDate(Date date, int mode, TimeZone timeZone) {
    if (date == null) {
      return null;
    }
    Calendar cal = (timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone));
    cal.setTime(date);
    switch (mode) {
      case Calendar.YEAR:
        cal.clear(Calendar.MONTH);
      case Calendar.MONTH:
      case Calendar.WEEK_OF_MONTH:
        if (mode == Calendar.MONTH) {
          cal.set(Calendar.DAY_OF_MONTH, 1);
        } else {
          cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
        }
      case Calendar.DATE:
        cal.set(Calendar.HOUR_OF_DAY, 0);
      case Calendar.HOUR:
        cal.clear(Calendar.MINUTE);
      case Calendar.MINUTE:
        cal.clear(Calendar.SECOND);
      case Calendar.SECOND:
        cal.clear(Calendar.MILLISECOND);
        break;
      default:
        throw new IllegalArgumentException();
    }
    return cal.getTime();
  }

  /**
   * 循环调整时间
   */
  public static Date rollDate(Date date, int field, int amount) {
    return rollDate(date, field, amount, null);
  }

  /**
   * 循环调整时间
   */
  public static Date rollDate(Date date, int field, int amount, TimeZone timeZone) {
    Calendar cal = (timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone));
    cal.setTime(date);
    cal.roll(field, amount);
    return cal.getTime();
  }

  /**
   * 调整时间
   */
  public static Date addDate(Date date, int field, int amount) {
    return addDate(date, field, amount, null);
  }

  /**
   * 调整时间
   */
  public static Date addDate(Date date, int field, int amount, TimeZone timeZone) {
    Calendar cal = (timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone));
    cal.setTime(date);
    cal.add(field, amount);
    return cal.getTime();
  }

  /**
   * 比较2个同时区时间先后，注意:时间的格式必须在String2Date支持的格式范围内
   *
   * @param date1 时间1
   * @param date2 时间2
   * @return 如果时间1等于时间2，返回0，如果时间1小于时间2，返回负值，如果时间1大于时间2，返回正值
   */
  public static int compare(String date1, String date2) {
    return String2Date(date1).compareTo(String2Date(date2));
  }

  /**
   * 比较2个时间先后
   *
   * @param date1 时间1
   * @param date2 时间2
   * @return 如果时间1等于时间2，返回0，如果时间1小于时间2，返回负值，如果时间1大于时间2，返回正值
   */
  public static int compare(Date date1, Date date2) {
    return date1.compareTo(date2);
  }

  /**
   * 查询时区
   */
  public static TimeZone findTimeZone(int timediff) {
    String[] ids = TimeZone.getAvailableIDs(timediff * 60000 + TimeZone.getDefault().getOffset(System.currentTimeMillis()));
    if (ids == null) {
      return new SimpleTimeZone(timediff * 60000, "UDT");
    }
    return TimeZone.getTimeZone(ids[0]);
  }

  /**
   * 根据时区名字取得时区 如果非java已知标准名字，则必须为 GMT[+-]hh:mm 格式
   */
  public static TimeZone getTimeZone(String id) {
    if (id == null) {
      return null;
    }
    if (TimeZoneIds.contains(id)) {
      return TimeZone.getTimeZone(id);
    }
    if (TimeZoneCache.containsKey(id)) {
      return (TimeZone) TimeZoneCache.get(id);
    }
    Pattern p = Pattern.compile("^GMT[+-](0[0-9]|1[01]):([0-5][0-9])$");
    Matcher m = p.matcher("id");
    if (!m.matches()) {
      return null;
    }
    int hh = Integer.parseInt(id.substring(4, 6));
    int mm = Integer.parseInt(id.substring(7));
    int sign = (id.charAt(3) == '-' ? -1 : 1);
    TimeZone tz = new SimpleTimeZone((hh * 60 + mm) * 60000 * sign, id);
    TimeZoneCache.put(id, tz);
    return tz;
  }

  public static Timestamp string2TimeStamp(Object millions, Object nanos) {
    try {
      Timestamp res = new Timestamp(Long.parseLong((String) millions));
      res.setNanos(Integer.parseInt((String) nanos));

      return res;
    } catch (Exception e) {
      return null;
    }

  }

  /**
   * 把Date转为Timestamp
   */
  public static Timestamp date2Timestamp(Date adate) {
    return new Timestamp(adate.getTime());
  }

  /**
   * <p> 把用户当地时间转成网银时间。 </p>
   *
   * @param date 待转换的时间。
   * @param dest 用户所在时区。
   * @return 转换后的时间。
   */
  public static Date transformDateFrom(Date date, TimeZone dest) {

    long offset = dest.getOffset(date.getTime()) - timeZoneBeijing.getOffset(date.getTime());
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(date.getTime() - offset);
    return cal.getTime();
  }

  /**
   * <p> 把网银时间转成用户当地时间。 </p>
   *
   * @param date 待转换的时间。
   * @param dest 用户所在时区。
   * @return 转换后的时间。
   */
  public static Date transformDateInto(Date date, TimeZone dest) {
    long offset = dest.getOffset(date.getTime()) - timeZoneBeijing.getOffset(date.getTime());
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(date.getTime() + offset);
    return cal.getTime();
  }

  /**
   * 校验起始日期和结束日期的合法性<p> 例如：起始日期距当前日期不超过12个月，起始结束日期间隔不超过3个月，调用<br> validateDateRange(startDate, endDate, currentDate, 3,
   * 12)
   *
   * @param startDate   起始日期
   * @param endDate     结束日期
   * @param currentDate 当前日期
   * @param maxInterval 起始日期和结束日期的最大距离（单位为月）
   * @param amount      起始日期和当前日期的最大距离（单位为月）
   */
  public static boolean validateDateRange(Date startDate, Date endDate, Date currentDate, int maxInterval, int amount) {
    if (startDate.after(endDate)) {
      return false;
    }

    if (currentDate.after(addDate(startDate, Calendar.MONTH, amount))) {
      return false;
    }

    if (endDate.after(addDate(startDate, Calendar.MONTH, maxInterval))) {
      return false;
    }

    return true;
  }

  /**
   * 比较2个同时区时间先后，注意:时间的格式必须在String2Date支持的格式范围内 yuef lyj
   *
   * @param date1 时间1
   * @param date2 时间2
   * @return 如果时间1等于时间2，返回0，如果时间1小于时间2，返回负值，如果时间1大于时间2，返回正值
   */
  public static int compareMonth(String date1, String date2, TimeZone timeZone) {
    Date start = String2Date(date1);
//		Date end = String2Date(date2);
//		if (date == null)
//			return null;
    Calendar cal = (timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone));
    cal.setTime(start);
//		int ss = cal.get(Calendar.MONTH)+1;
    return String2Date(date1).compareTo(String2Date(date2));
  }

  /**
   * @param date1 需要比较的时间 不能为空(null),需要正确的日期格式
   * @param date2 被比较的时间  为空(null)则为当前时间
   * @param stype 返回值类型   0为多少天，1为多少个月，2为多少年
   */
  public static int compareDate(String date1, String date2, int stype) {
    int n = 0;

//        String[] u = {"天","月","年"};
    String formatStyle = stype == 1 ? "yyyy-MM" : "yyyy-MM-dd";

//        date2 = date2==null?DateTest.getCurrentDate():date2;

    DateFormat df = new SimpleDateFormat(formatStyle);
    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
    try {
      c1.setTime(df.parse(date1));
      c2.setTime(df.parse(date2));
    } catch (Exception e3) {
      System.out.println("wrong occured");
    }
    //List list = new ArrayList();
    while (!c1.after(c2)) {                     // 循环对比，直到相等，n 就是所要的结果
      //list.add(df.format(c1.getTime()));    // 这里可以把间隔的日期存到数组中 打印出来
      n++;
      if (stype == 1) {
        c1.add(Calendar.MONTH, 1);          // 比较月份，月份+1
      } else {
        c1.add(Calendar.DATE, 1);           // 比较天数，日期+1
      }
    }

    n = n - 1;

    if (stype == 2) {
      n = (int) n / 365;
    }

//        System.out.println(date1+" -- "+date2+" 相差多少"+u[stype]+":"+n);
    return n;
  }

  /**
   * 转换成sqldate
   */
  public static java.sql.Date toSqlDate(Date date) {
    if (date == null) {
      return null;
    }
    return new java.sql.Date(date.getTime());
  }

  /**
   * 转换成utildate
   */
  public static Date toUtildate(java.sql.Date date) {
    if (date == null) {
      return null;
    }
    return new Date(date.getTime());
  }

  /**
   * 获取两日期之间相隔的小时数(不足一小时算一小时)
   */
  public static int getHoursBetween(Date start, Date end) {
    long s = start.getTime();
    long e = end.getTime();
    long k = e - s;
    if (k % HOUR_MICRO_SECONDS == 0) {
      return (int) (k / HOUR_MICRO_SECONDS);
    } else {
      return (int) (k / HOUR_MICRO_SECONDS) + 1;
    }
  }

  /**
   * 固定类产品进入操作期专用 获取两日期之间相隔的小时数(不足一小时舍去)
   */
  public static int getOperFundHours(Date start, Date end) {
    long s = start.getTime();
    long e = end.getTime();
    long k = e - s;

    return (int) (k / HOUR_MICRO_SECONDS);
  }

  /**
   * 获取当天的最小时间 2012-11-14-->2012-11-14 00:00:00
   */
  public static Date getMinTimeofDay(String str, String format) {
    Date date = String2Date(str, format);
    return getMinTimeofDay(date);
  }

  /**
   * 获取当天的最小时间 2012-11-14-->2012-11-14 00:00:00
   */
  public static Date getMinTimeofDay(Date date) {
    if (date == null) {
      return null;
    }
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(date.getTime());
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    return cal.getTime();
  }

  /**
   * 取得days天后的日期
   */
  public static Date getDateNextdays(int days) {
    return new Date(System.currentTimeMillis() + HOUR_MICRO_SECONDS);
  }

  /**
   * 取得days天后的日期
   */
  public static Date getDateNextdays(Date date, int days) {
    return new Date(date.getTime() + (HOUR_MICRO_SECONDS * 24l * days));
  }

  /**
   * 获取当天的最大时间 2012-11-14-->2012-11-14 23:59:59
   */
  public static Date getMaxTimeofDay(String str, String format) {
    Date date = String2Date(str, format);
    return getMaxTimeofDay(date);
  }

  /**
   * 获取当天的最大时间 2012-11-14-->2012-11-14 23:59:59
   */
  public static Date getMaxTimeofDay(Date date) {
    if (date == null) {
      return null;
    }
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(date.getTime());
    cal.set(Calendar.HOUR_OF_DAY, 23);
    cal.set(Calendar.MINUTE, 59);
    cal.set(Calendar.SECOND, 59);
    cal.set(Calendar.MILLISECOND, 999);
    return cal.getTime();
  }

  /**
   * 获取当月最大的天 2012-11-14-->2012-11-14 23:59:59
   */
  public static Date getMaxDayOfMonth(Date date) {
    if (date == null) {
      return null;
    }
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(date.getTime());
    cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    cal.set(Calendar.HOUR_OF_DAY, 23);
    cal.set(Calendar.MINUTE, 59);
    cal.set(Calendar.SECOND, 59);
    cal.set(Calendar.MILLISECOND, 999);
    return cal.getTime();
  }

  /**
   * 获取前  month 个月的最大时间和最小时间
   *
   * @return Map
   * @author
   */
  public static Map<String, String> getDateMap(int month) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - month);
    Date date = calendar.getTime();
    //得到前month个月的最大时间
    calendar.setTimeInMillis(date.getTime());
    calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    calendar.set(Calendar.HOUR_OF_DAY, 23);
    calendar.set(Calendar.MINUTE, 59);
    calendar.set(Calendar.SECOND, 59);
    calendar.set(Calendar.MILLISECOND, 999);
    //System.out.println(simpleDateFormat.format(calendar.getTime()));
    //得到前month个月的最小时间
    Calendar calendar1 = Calendar.getInstance();
    calendar1.setTimeInMillis(date.getTime());
    calendar1.set(Calendar.DAY_OF_MONTH, calendar1.getActualMinimum(Calendar.DAY_OF_MONTH));
    calendar1.set(Calendar.HOUR_OF_DAY, 0);
    calendar1.set(Calendar.MINUTE, 0);
    calendar1.set(Calendar.SECOND, 0);
    calendar1.set(Calendar.MILLISECOND, 0);
    //System.out.println(simpleDateFormat.format(calendar1.getTime()));
    Map<String, String> map = new HashMap<String, String>();
    map.put("endDate", simpleDateFormat.format(calendar.getTime()));
    map.put("startDate", simpleDateFormat.format(calendar1.getTime()));
    return map;
  }

  /**
   * 判断当前日是不是周六或周日
   *
   * @author
   */
  public static boolean isWeekend(Date date) throws ParseException {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
      return true;
    } else {
      return false;
    }
  }

  //获取一个月后当天的最大时间  wuyue   2012-11-14 23:59:59
  public static Date getNextMothDate(int month) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + month);
    Date date = calendar.getTime();
    //得到下month个月的最大时间
    calendar.setTimeInMillis(date.getTime());
    calendar.set(Calendar.HOUR_OF_DAY, 23);
    calendar.set(Calendar.MINUTE, 59);
    calendar.set(Calendar.SECOND, 59);
    calendar.set(Calendar.MILLISECOND, 999);
    return simpleDateFormat.parse(simpleDateFormat.format(calendar.getTime()));
  }

  // 根据当前时间获取days天前的时间
  public static Date getLastDays(int days) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DATE, -days);
    return simpleDateFormat.parse(simpleDateFormat.format(calendar.getTime()));
  }

  //根据传入的日期获取days天前的时间
  public static Date getLastDays(Date date, int days) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.DATE, -days);
    return simpleDateFormat.parse(simpleDateFormat.format(calendar.getTime()));
  }

  //比较两个日期的相差天数，不满一天算一天
  public static int daysOfTwo(Date fDate, Date oDate) {

    Calendar aCalendar = Calendar.getInstance();
    aCalendar.setTime(fDate);
    int day1 = aCalendar.get(Calendar.DAY_OF_YEAR);
    aCalendar.setTime(oDate);
    int day2 = aCalendar.get(Calendar.DAY_OF_YEAR);
    if (day2 == day1) {
      return 1;
    } else {
      return day2 - day1;
    }
  }

  /**
   * 判断当前日是不是周六
   *
   * @author
   */
  public static boolean isWeekSAT(Date date) throws ParseException {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * 判断当前日是不是周一
   *
   * @author
   */
  public static boolean isWeekMONDAY(Date date) throws ParseException {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * 判断当前日是不是周日
   *
   * @author
   */
  public static boolean isWeekSUN(Date date) throws ParseException {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * 获取当前时间的天数，不足24小时算一天
   */
  public static int getHorsToDay(int hours) {
    if (hours == 0 || hours % 24 != 0) {
      return (hours / 24) + 1;
    } else {
      return hours / 24;
    }
  }

  /**
   * 获取指定时间加上指定小时的时间
   */
  public static Date dateAddHours(Date planDate, int hours) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(planDate);
    cal.add(Calendar.HOUR_OF_DAY, hours);

    return cal.getTime();
  }

  /**
   * 比较两个日期，忽略年月日，只比较时分秒的大小
   *
   * @param date1 时间1
   * @param date2 时间2
   * @return 如果时间1等于时间2，返回0，如果时间1小于时间2，返回正值，如果时间1大于时间2，返回负值
   */
//  public static int compareDateHms(Date date1, Date date2) {
//    String time1 = DateFormatUtils.format(date1, "HH:mm:ss");
//    String time2 = DateFormatUtils.format(date2, "HH:mm:ss");
//    Date remindTime1 = DateUtil.String2Date("2015-09-23 " + time1, DateUtil.SQL_TIME_FMT);
//    Date remindTime2 = DateUtil.String2Date("2015-09-23 " + time2, DateUtil.SQL_TIME_FMT);
//
//    return remindTime2.compareTo(remindTime1);
//  }

  /**
   * 日期字符串格式化
   *
   * @author: Gao Peng
   * @date: 2016年3月23日 上午10:17:19
   * @param: @param str
   * @param: @return
   * @return: String
   */
  public static String formatString2String(String str) {
    Date d1 = String2Date(str);
    return Date2String(d1, YYYYMMDD);
  }

  /**
   * 计算得到MongoDB存储的日期，（默认情况下mongo中存储的是标准的时间，中国时间是东八区，存在mongo中少8小时，所以增加8小时） http://www.iteye.com/problems/88507
   *
   * @author: Gao Peng
   * @date: 2016年5月4日 上午9:26:23
   * @param: @param date
   * @param: @return
   * @return: Date
   */
  public static Date getMongoDate(Date date) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Calendar ca = Calendar.getInstance();
    ca.setTime(date);
    ca.add(Calendar.HOUR_OF_DAY, 8);
    return String2Date(sdf.format(ca.getTime()));
  }

  /**
   * 根据两个DATE时间计算相差多少 "天" "小时" "分" "秒" 一般打印日志用
   *
   * @param start
   * @param end
   * @return
   * @throws Exception
   */
  public static String getBetweenDate(Date start, Date end) {
    try {
      long betweenDate = end.getTime() - start.getTime();
      long day = betweenDate / (24 * 60 * 60 * 1000);
      long hour = (betweenDate / (60 * 60 * 1000) - day * 24);
      long min = ((betweenDate / (60 * 1000)) - day * 24 * 60 - hour * 60);
      long s = (betweenDate / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
      return day + "天" + hour + "小时" + min + "分" + s + "秒";
    } catch (Exception e) {
      return "获取时间异常";
    }


  }

  public static int addMonth(Date curDate, int addMonth) {
    Date tmp = DateUtil.addDate(curDate, Calendar.MONTH, addMonth);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
    return Integer.parseInt(dateFormat.format(tmp));
  }

  public static void main(String[] args) {
    Calendar cale = Calendar.getInstance();
    int month = cale.get(Calendar.MONTH) + 1;
    System.out.println(month);

    System.out.println(addMonth(new Date(), -3));
  }
}
