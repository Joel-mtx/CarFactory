package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Car;

/**
 * Servlet implementation class salesServlet
 */
@WebServlet("/salesServlet")
public class salesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public salesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String year = request.getParameter("carYear");
		String make = request.getParameter("carMake");
		String model = request.getParameter("carModel");
		String miles = request.getParameter("carMiles");
		
		Car newCar = new Car();
		newCar.priceSetter(Integer.parseInt(year), Integer.parseInt(miles));
		newCar.setYear(Integer.parseInt(year));
		newCar.setMake(make);
		newCar.setModel(model);
		newCar.setMiles(Integer.parseInt(miles));
		
		request.setAttribute("carMaker", newCar);
		getServletContext().getRequestDispatcher("/salesResults.jsp").forward(request, response);
	}

}
