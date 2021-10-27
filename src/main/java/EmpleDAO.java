import java.util.List;

import org.hibernate.Session;

public class EmpleDAO {
	public static List<Empleado> getAllEmpleado() {
		return getAllEmpleado(HibernateUtil.retrieveSession());
	}
	
	public static List<Empleado> getAllEmpleado(Session s) {
		String hQuery = "from Empleado";
		List<Empleado> clientList = s.createQuery(hQuery, Empleado.class)
				   	   			           .list();
		return clientList;
	}
}
