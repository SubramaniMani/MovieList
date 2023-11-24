package com.mani.movie.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.mani.model.Movie;
import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/")
public class MovieListController {
     
	@RequestMapping(method=RequestMethod.GET , value="/movie")
	public String getmovieListByactor(Model model)
	{
		
		List<Movie> movieList = new ArrayList<Movie>();
		Movie movie = new  Movie(); 
		movie.setActor("Vijay");
		movie.setDecsription("Drama - Adventure");
		movie.setName("LEO");
		movieList.add(movie);
		//model.("movie" , movieList )
		
	  
		
			return "movieList";
		
	}
}
	

