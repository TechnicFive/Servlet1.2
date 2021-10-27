import java.util.List;

import org.hibernate.Session;

public class DeparDAO {
	
	public static List<Departamento> getAllDepartamentos() {
		return getAllDepartamentos(HibernateUtil.retrieveSession());
	}
	
	public static List<Departamento> getAllDepartamentos(Session s) {
		String hQuery = "from Departamento";
		List<Departamento> clientList = s.createQuery(hQuery, Departamento.class)
				   	   			           .list();
		return clientList;
	}
}
