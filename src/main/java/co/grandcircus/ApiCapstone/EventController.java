package co.grandcircus.ApiCapstone;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public ModelAndView showList() {
		ModelAndView mav = new ModelAndView("display");
		
		RestTemplate restTemplate = new RestTemplate();
		
//		HttpHeaders headers = new HttpHeaders();
//		headers.add(HttpHeaders.USER_AGENT, "Hi");
		
//		String url = "https://app.ticketmaster.com/discovery/v2/events.json?size=1&apikey=2Z0zFqJrUytucwLNkdNxHkLnAXonV1PP";
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?countryCode=US&apikey=2Z0zFqJrUytucwLNkdNxHkLnAXonV1PP";
		
		ResponseEntity<EventResult> response = restTemplate.exchange(
				url, HttpMethod.GET, new HttpEntity<>(null),EventResult.class);
		
		EventResult result = response.getBody();
		
		System.out.println(result.getEmbedded().getEvents());
		
		mav.addObject("events", result.getEmbedded().getEvents());
		
		System.out.println(result);
		return mav;
	}
}
