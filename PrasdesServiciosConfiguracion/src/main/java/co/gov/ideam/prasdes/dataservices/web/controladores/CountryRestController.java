package co.gov.ideam.prasdes.dataservices.web.controladores;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.gov.ideam.prasdes.dataservices.entidades.Country;



@RestController
@RequestMapping("/rest/country")
public class CountryRestController extends CommonController {

static final Logger logger = LogManager.getLogger(CountryRestController.class.getName());
	
	@CrossOrigin
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<Country> consultarListPaises() {     	
    	logger.info("Respondiento peticion rest (get)...");
    	return countryServiceImpl.obtenerListaPaises();    	     
    }
	
}
