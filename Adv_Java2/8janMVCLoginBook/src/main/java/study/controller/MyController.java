package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import study.dao.BookDAO;
import study.entity.BookEntity;

@Controller
public class MyController {
	
	@Autowired
	BookDAO dao;
	
	@GetMapping("/login")
	public String f1()
	{
		System.out.println("hi from controller");
		return "Input";
	}
	
	@PostMapping("/verify")
	public String verify(@RequestParam String uname,@RequestParam String pass)
	{
		if(uname.equals("Dhanraj") && pass.equals("123"))
		{
			return "Home";
		}
		
		else {
			return "Input";
		}
		
	}
	
	@PostMapping("/verify2")
	public String verify2(Model model,@RequestParam String uname,@RequestParam String pass)
	{
		
		if(uname.equals("Dhanraj") && pass.equals("123"))
		{
			model.addAttribute("user", uname);
			return "Home";
		}
		
		else {
			String msg="Please enter valid userid password";
			model.addAttribute("error", msg);
			return "Input";
		}
		
	}
	
	@RequestMapping("/getbooks")
	public ModelAndView getlistofBook()
	{
		ModelAndView mv= new ModelAndView();
		List<BookEntity> list=dao.getBooks();
		mv.addObject("books", list);
		mv.setViewName("Book");
		return mv;
		
	}
	
	@RequestMapping("/getbookdetails")
	public ModelAndView viewbooks()
	{
		ModelAndView mv= new ModelAndView();
		List<BookEntity> list=dao.getBooks();
		mv.addObject("books", list);
		mv.setViewName("BookDetails");
		return mv;
		
	}
	
	@GetMapping("/viewbook")
	public ModelAndView showbookdetails(@RequestParam String bookname)
	{
		ModelAndView mv= new ModelAndView();
		List<BookEntity> list=dao.getdetails(bookname);
		mv.addObject("details", list);
		mv.setViewName("Details");
		return mv;
		
		
	}
	
	@RequestMapping("/deletebook")
	public ModelAndView deletebook()
	{
		ModelAndView mv= new ModelAndView();
		List<BookEntity> list=dao.getBooks();
		mv.addObject("books", list);
		mv.setViewName("Deletebook");
		return mv;
		
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam String bookname)
	{		
		
		ModelAndView mv= new ModelAndView();
		List<BookEntity> list = dao.getdetails(bookname);
		for(BookEntity bk:list)
			dao.delete(bk);
		String msg ="Book "+bookname+" deleted Sucessfully";
		mv.addObject("msg", msg);
		mv.setViewName("Deletemsg");
		return mv;
		
		
	}

}
