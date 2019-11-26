package com.bit.listboard.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.listboard.bean.ListBoardVO;
import com.bit.listboard.service.ListBoardService;

@Controller
public class ListBoardController {

	@Autowired
	ListBoardService service;
	
	//게시물 작성 화면 호출
	@RequestMapping("/writeContent")
	public void write(@ModelAttribute("vo") ListBoardVO vo) {
		
	}
	//게시물 작성
	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public String insert(Model model, ListBoardVO vo)  {
		service.insert(vo);
		return "redirect://localhost:8080/list";
	}
	//조회
	@RequestMapping(value="/viewContent",method = RequestMethod.GET)
	public String viewContent(Model model,@RequestParam(value="idx",required = false) Integer idx) throws Exception{
		model.addAttribute("viewContent",service.viewContent(idx));
		System.out.println(idx);
		System.out.println(service.viewContent(idx));
		return "viewContent";
		
	}
	//게시물 수정 호출
	@RequestMapping("/updateContent")
	public String updateGet(Model model,@RequestParam(value="idx",required = false) Integer idx) throws Exception{
		System.out.println(idx);
		model.addAttribute("viewContent",service.viewContent(idx));
		return "update";
	}
	//게시물 수정
	@RequestMapping(value="/update", method = RequestMethod.PATCH)
	public String updatePost(ListBoardVO vo, Model model) throws Exception {
		service.update(vo);
		
		return "redirect://localhost:8080/list";
	}
	//게시물 삭제 
	@RequestMapping(value="/delete")
	public String delete(@RequestParam(value="idx",required = false) Integer idx) throws Exception {
		service.delete(idx);
		
		return "redirect://localhost:8080/list";
	}
	
	
	//게시물 목록 호출
	@RequestMapping("/list")
	public String viewList(Model model) {
	model.addAttribute("list", service.viewList());
	
	return "list";
	}
	
}
