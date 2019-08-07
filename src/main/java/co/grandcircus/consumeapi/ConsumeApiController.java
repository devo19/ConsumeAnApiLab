package co.grandcircus.consumeapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.consumeapi.entity.Innovator;
import co.grandcircus.consumeapi.entity.Inventor;
import co.grandcircus.consumeapi.service.ApiService;

@Controller
public class ConsumeApiController {
	
	@Autowired
	ApiService apiService;
	
	@RequestMapping("/")
	   public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		
		List<Inventor> inventors = apiService.getNerds();
		
		mv.addObject("list", inventors);
		return mv;
	}
	
	@RequestMapping("/complete")
	   public ModelAndView complete() {
		ModelAndView mv = new ModelAndView("complete");
		
		List<Innovator> innovators = apiService.getNerds2();
		
		mv.addObject("list", innovators);
		return mv;
	}

}
