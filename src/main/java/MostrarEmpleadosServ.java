

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostrarEmpleadosServ
 */
@WebServlet(name = "MostrarEmpleados", urlPatterns = { "/MostrarEmpleados" })
public class MostrarEmpleadosServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarEmpleadosServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Empleado> emple = EmpleDAO.getAllEmpleado();
		
		PrintWriter salida=response.getWriter();
		salida.println("<html><body>");
		salida.println("<h1>Mostrar Datos Empleados </h1>");
		salida.println("");
		for (Empleado empleado : emple) {
			salida.println("Nombre: "+ empleado.getNombre()+" "+ empleado.getApellido1()+" "+ empleado.getApellido2());
			salida.println(" nacida en: " + empleado.getLugarNacimiento());
			salida.println(" con fecha de nacimiento: " + empleado.getFechaNacimiento());
			salida.println(" direccion: " + empleado.getDireccion());
			salida.println(" telefono:  " + empleado.getTelefono());
			salida.println(" puesto: " + empleado.getPuesto());
			salida.println(" codigo de departamento: " + empleado.getCodDepartamento());
			salida.println("<br>");
		
		}
		salida.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
