package ugc.dao.api;

import ugc.model.entities.Person;
import ugc.model.entities.Planet;

public interface PeoplesDao {
	
	Person createPerson (String name, Planet homePlanet);

}
