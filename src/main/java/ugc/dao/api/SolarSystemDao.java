package ugc.dao.api;

import java.util.List;

import ugc.model.entities.Planet;
import ugc.model.entities.SolarSystem;
import ugc.model.entities.Star;

public interface SolarSystemDao {

	SolarSystem createNewSolarSystem(String solarSystemName);

	List<SolarSystem> findAllSolarSystems();
	
	Star createAddNewStar (long solarSystemId, String starName);
	
	Star createAddNewStar (SolarSystem solarSystem, String starName);
	
	Planet createAddNewPlanet (String name, SolarSystem solarSystem, Star sun);
}
