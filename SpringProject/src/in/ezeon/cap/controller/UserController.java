/**
 * 
 */
package in.ezeon.cap.controller;

import org.springframework.web.bind.annotation.RequestMapping;

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

public class UserController {
	@RequestMapping(value = { "/index" })
	public String index() {

		return "index";
	}
}
