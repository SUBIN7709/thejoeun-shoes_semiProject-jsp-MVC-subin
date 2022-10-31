package com.jsplec.hosix.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.hosix.command.HCartDeleteCommand;
import com.jsplec.hosix.command.HCartInsertCommand;
import com.jsplec.hosix.command.HCartListCommand;
import com.jsplec.hosix.command.HCategoryPListCommand;
import com.jsplec.hosix.command.HCommand;
import com.jsplec.hosix.command.HMCustomerDeleteCommand;
import com.jsplec.hosix.command.HMCustomerListCommand;
import com.jsplec.hosix.command.HMCustomerSearchCommand;
import com.jsplec.hosix.command.HMTakeActionCommand;
import com.jsplec.hosix.command.HPListCommand;
import com.jsplec.hosix.command.HProductdetailCommand;
import com.jsplec.hosix.command.HMTakeRecordCommand;
import com.jsplec.hosix.command.HMTakeListCommand;
import com.jsplec.hosix.command.HMTakeSearchCommand;

/**
* Servlet implementation class FrontController
*/
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
   /**
    * @see HttpServlet#HttpServlet()
    */
   public FrontController() {
       super();
       // TODO Auto-generated constructor stub
   }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		actionDo(request, response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		request.setCharacterEncoding("utf-8");
		
		String viewPage = null;
		HCommand command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		System.out.println(com);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
