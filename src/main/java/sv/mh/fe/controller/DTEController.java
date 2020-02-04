package sv.mh.fe.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;

import javax.validation.Valid;


@RestController
@RequestMapping("/dte")
public class DTEController {	

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String createPet(@Valid @RequestBody Object input) {				
		JSONObject output = new JSONObject();
		output.put("salida", "1");
		output.put("input", input);
		return output.toString();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAllDte(@Valid @RequestBody JSONObject input) {
		return input.toString();
	}

}
