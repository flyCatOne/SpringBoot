package com.example.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 常用工具类
 * @author luzheng
 * 2017年9月6日
 */
public class CommonUtils {
	public static String dateToString(Long d)
	  {
	    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
	    return sdf.format(new Date(d.longValue()));
	  }
}
