package ugc.app;

import ugc.dao.api.AnomaliesDao;
import ugc.dao.api.PeoplesDao;
import ugc.dao.api.SolarSystemDao;
import ugc.dao.impl.AnomaliesDaoImpl;
import ugc.dao.impl.PeopleDaoImpl;
import ugc.dao.impl.SolarSystemDaoImpl;
import ugc.model.entities.Person;
import ugc.model.entities.Planet;
import ugc.model.entities.SolarSystem;
import ugc.model.entities.Star;

public class App {
	
	public static void main(String[] args) {
		SolarSystemDao solarSystemDao = new SolarSystemDaoImpl();
		SolarSystem solarSystem = solarSystemDao.createNewSolarSystem("Sun solar system");
		System.out.println(solarSystemDao.findAllSolarSystems());
		
		
		Star sun = solarSystemDao.createAddNewStar(solarSystem, "Sun");
		
		Planet earth = solarSystemDao.createAddNewPlanet("Earth", solarSystem, sun);
		Planet mars = solarSystemDao.createAddNewPlanet("Mars", solarSystem, sun);
		Planet venera = solarSystemDao.createAddNewPlanet("Venera", solarSystem, sun);
		
		PeoplesDao peopleDao = new PeopleDaoImpl();
		Person adam = peopleDao.createPerson("Adam", earth);
		Person eva = peopleDao.createPerson("Eva", earth);
		Person marsi = peopleDao.createPerson("Marsi boy", mars);
		
		AnomaliesDao anomaliesDao = new AnomaliesDaoImpl();
		anomaliesDao.teleportPerson(eva, mars);
		anomaliesDao.teleportPerson(eva, venera);
		
		System.out.println(anomaliesDao.findAllPlanetsWithoutAnomalies());
	}

}
