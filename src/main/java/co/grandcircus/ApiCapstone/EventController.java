package co.grandcircus.ApiCapstone;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.ApiCapstone.entity.EventResult;

@Controller
public class EventController {

	@RequestMapping("/")
	public ModelAndView showIndex() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/display")
	public ModelAndView showList(
			@RequestParam("name") String name) {
		ModelAndView mav = new ModelAndView("display");
		
		RestTemplate restTemplate = new RestTemplate();
		
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?keyword=" + name + "&apikey=2Z0zFqJrUytucwLNkdNxHkLnAXonV1PP";
		
//		String url = "https://app.ticketmaster.com/discovery/v2/events.json?countryCode=US&apikey=2Z0zFqJrUytucwLNkdNxHkLnAXonV1PP";
		
		ResponseEntity<EventResult> response = restTemplate.exchange(
		      url, HttpMethod.GET, new HttpEntity<>(null),EventResult.class);
		
		EventResult result = response.getBody();
		
		System.out.println(result.getEmbedded().getEvents());
		
		mav.addObject("events", result.getEmbedded().getEvents());
		
		System.out.println(result);
		return mav;
	}
}
