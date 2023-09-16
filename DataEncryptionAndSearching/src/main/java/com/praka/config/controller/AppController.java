package com.praka.config.controller;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.praka.config.dao.copy.DifDao;
import com.praka.config.dao.copy.TotofromDao;
import com.praka.config.entity.Diff;

@RestController
public class AppController {
	@Autowired
	private DifDao dao;
	@Autowired
	private TotofromDao tdao;
	
	@GetMapping("/show")
	public ModelAndView show()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FrontEnd");
		return mv;
	}
	@GetMapping("/encode")
	@ResponseBody
	public ModelAndView encoding(@RequestParam("fNo") String fNo,@RequestParam("sNo") String sNo)
	{
		ModelAndView mv = new ModelAndView();
		int fno1 = Integer.parseInt(fNo);
		int sNo1 = Integer.parseInt(sNo);
		System.out.println(fno1+"  "+sNo1);
		for (int i = fno1; i <= sNo1; i++) {
			Diff d = dao.getData(i);
			System.out.println(d.getH_No());
		}
		
		mv.setViewName("FrontEnd");
		return mv;
	}
	@GetMapping("/sort")
	@ResponseBody
	public ModelAndView sort(@RequestParam("ffNo") String fno ,@RequestParam("ssNo") String sno)
	{
	
		ModelAndView mv = new ModelAndView();
		int fno1 = Integer.parseInt(fno);
		int sno1 = Integer.parseInt(sno);
		for (int i = fno1; i <= sno1; i++) {
			tdao.getDh_no(i);
		}
		
		mv.setViewName("FrontEnd");
		return mv;
	}
}
