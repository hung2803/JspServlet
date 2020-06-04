/**
* 
*/
package com.vti;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This class is .
 * 
 * @Description: .
 * @author: NTHung
 * @create_date: Jun 2, 2020
 * @version: 1.0
 * @modifer: NTHung
 * @modifer_date: Jun 2, 2020
 */
@Controller
public class WelcomeController {
	public WelcomeController() {
		System.out.println("---------Welcome Controller----------");
	}
	@RequestMapping("/welcome")
	public String WelcomePage() {
		
		return "index";
	}
}
