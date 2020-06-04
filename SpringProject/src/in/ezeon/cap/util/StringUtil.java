/**
 * 
 */
package in.ezeon.cap.util;

/**
 * This class is .
 * 
 * @Description: .
 * @author: NTHung
 * @create_date: May 28, 2020
 * @version: 1.0
 * @modifer: NTHung
 * @modifer_date: May 28, 2020
 */

public class StringUtil {
	public static String toCommaSeparatedString(Object[] items) {
		StringBuilder sb = new StringBuilder();
		for (Object item : items) {
			sb.append(item).append(",");
		}
		if (sb.length() > 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}
}
