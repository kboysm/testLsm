package com.bit.listboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.listboard.bean.ListBoardVO;
import com.bit.listboard.mapper.ListBoardMapper;

@Service
public class ListBoardServiceImpl implements ListBoardService {

	@Autowired
	ListBoardMapper listBoardMapper;
	
	@Override
	public int insert(ListBoardVO vo) {
		return listBoardMapper.insert(vo);
	}

	@Override
	public int countContent() {
		return listBoardMapper.countContent();
	}

	@Override
	public void countView(int idx) {
	}

	@Override
	public List<ListBoardVO> viewList() {
		return listBoardMapper.viewList();
	}

	@Override
	public ListBoardVO viewContent(int idx) {
		listBoardMapper.countView(idx);
		return listBoardMapper.viewContent(idx);
	}

	@Override
	public int update(ListBoardVO vo) {
		return listBoardMapper.update(vo);
	}

	@Override
	public int delete(int idx) {
		return listBoardMapper.delete(idx);
	}

}
