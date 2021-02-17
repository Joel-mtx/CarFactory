package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Car;

/**
 * Servlet implementation class mecanicsServlet
 */
@WebServlet("/mecanicsServlet")
public class mecanicsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mecanicsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String engineType = request.getParameter("engineType");
		String transmissionType = request.getParameter("transmissionType");
		
		Car newCar = new Car();
		newCar.setEngineType(engineType);
		newCar.setTransmissionType(transmissionType);
		
		request.setAttribute("carMaker", newCar);
		getServletContext().getRequestDispatcher("/mecanicsResult.jsp").forward(request, response);
	
	}

}
