package co.grandcircus.consumeapi.service;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.consumeapi.entity.ConsumeApiResponse;
import co.grandcircus.consumeapi.entity.Innovator;
import co.grandcircus.consumeapi.entity.Inventor;

@Component
public class ApiService {

	private RestTemplate restTemplate = new RestTemplate();

	// This is an instance initialization block. It runs when a new instance of the
	// class is created--
	// right before the constructor.
	{
		// This configures the restTemplateWithUserAgent to include a User-Agent header
		// with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is
		// required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public List<Inventor> getNerds() {

		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

		ConsumeApiResponse response = restTemplate.getForObject(url, ConsumeApiResponse.class);

		return response.getInventors();

	}

	public List<Innovator> getNerds2() {

		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

		ConsumeApiResponse response = restTemplate.getForObject(url, ConsumeApiResponse.class);

		return response.getInnovators();

	}

}
