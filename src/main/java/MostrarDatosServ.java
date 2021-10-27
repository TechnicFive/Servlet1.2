

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostrarDatosServ
 */
@WebServlet(name = "MostrarDatos", urlPatterns = { "/MostrarDatos" })
public class MostrarDatosServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarDatosServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Tengo que recoger un parametro table y mostrar esa tabla 
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String introducido=request.getParameter("table");
		String Depar="Departamento";
		String Emp="Empleado";
		
		if(introducido==null)
		{
			PrintWriter salida=response.getWriter();
			salida.println("<html><body>");
			salida.println("<h1>Tienes que escribir en la url ?table=(la tabla que desees mirar)</h1>");
			salida.println("</body></html>");
		}else if(introducido.equalsIgnoreCase(Depar)) {
			
			MostrarDepartamentosServ nuevo = new MostrarDepartamentosServ();
			nuevo.doGet(request, response);
		}else if(introducido.equalsIgnoreCase(Emp)) {
			MostrarEmpleadosServ nuevo = new MostrarEmpleadosServ();
			nuevo.doGet(request, response);
		}else {
			PrintWriter salida=response.getWriter();
			salida.println("<html><body>");
			salida.println("<h1>Tienes que escribir en la url ?table=(la tabla que desees mirar)</h1>");
			salida.println("</body></html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
