package study.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import study.MyRepository;
import study.entity.MovieEntity;

@Controller
public class MovieController {

	
	@Autowired
	MyRepository repo;
	
	//http://localhost:8080/home
	@GetMapping("/home")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/goinsert")
	public String goinsert()
	{
		return "insert";
	}
	
	@PostMapping("/insert")
	public void insert(@RequestParam String name,@RequestParam int rate,@RequestParam String catg)
	{
		MovieEntity movie=new MovieEntity(name, rate, catg);
		repo.save(movie);
	}
	
	@GetMapping("/allmovie")
	public ModelAndView showall()
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("movie", repo.findAll());
		mv.setViewName("viewAll");
		return mv;
		
	}
	
	@GetMapping("/viewbyname1")
	public ModelAndView showbyname1(@RequestParam String name)
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("movie", repo.findByName(name));
		mv.setViewName("viewByName");
		return mv;
		
	}
	
	@GetMapping("/viewbyname2")
	public ModelAndView showbyname()
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("movielist", repo.findAll());
		mv.setViewName("viewList");
		return mv;
		
	}
	
	@GetMapping("/deletebyname1")
	public ModelAndView deletebyname1(@RequestParam String name)
	{
		ModelAndView mv= new ModelAndView();
		List<MovieEntity> list=(List<MovieEntity>) repo.findByName(name);
		repo.delete(list.get(0));
		String msg ="Deleted Sucsessfully";
		mv.addObject("msg", msg);
		mv.setViewName("deletemsg");
		return mv;
		
	}
	
	@GetMapping("/viewbynamedel")
	public ModelAndView showbynamedelete()
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("movielist", repo.findAll());
		mv.setViewName("viewListdel");
		return mv;
		
	}
	
	
}
