package com.LearnersBuzz.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;





/**
 * Servlet implementation class UserController
 */

@Controller
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	private static final Logger logger = LoggerFactory
			.getLogger(UserController.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("index");
	}

	/*@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody
	Map<String, Object> doLogin(HttpSession session, @RequestBody UserLogin user)
			throws IOException {
		logger.debug("username: " + user.getUsername());
		logger.debug("password: " + user.getPassword());
		Map<String, Object> fetchedUserDetails = new HashMap<String, Object>();
		Registered_Users fetchUserByCredentials = null;

		if (!StringUtils.isEmpty(session.getAttribute("loggedInUser"))) {
			fetchUserByCredentials = (Registered_Users) session
					.getAttribute("loggedInUser");
		} else {
			fetchUserByCredentials = userService
					.fetchUserByCredentials(user);
			if (fetchUserByCredentials != null) {
				session.setAttribute("loggedInUser", fetchUserByCredentials);
			}

		}

		return fetchedUserDetails;
	}*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
