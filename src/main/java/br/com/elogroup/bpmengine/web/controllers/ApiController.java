package br.com.elogroup.bpmengine.web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.elogroup.bpmengine.web.entities.ApiStatus;

@RestController
@RequestMapping("/api")
public class ApiController {

	@RequestMapping("/status")
	public @ResponseBody ApiStatus status(){
		ApiStatus currentApiStatus = new ApiStatus();
		currentApiStatus.setApiStatus("Api is online");
		return currentApiStatus;
	}
}