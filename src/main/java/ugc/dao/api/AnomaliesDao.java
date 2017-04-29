package ugc.dao.api;

import java.util.List;

import ugc.model.entities.Person;
import ugc.model.entities.Planet;

public interface AnomaliesDao {
	
	boolean teleportPerson (Person p, Planet toPlanet);
	
	List<Planet> findAllPlanetsWithoutAnomalies ();

}
