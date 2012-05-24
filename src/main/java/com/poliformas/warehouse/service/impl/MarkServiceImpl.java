package com.poliformas.warehouse.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.poliformas.warehouse.integration.dao.MarkDAO;
import com.poliformas.warehouse.integration.dao.impl.MarkDAOImpl;
import com.poliformas.warehouse.integration.entity.Mark;
import com.poliformas.warehouse.service.MarkService;

public class MarkServiceImpl implements MarkService{
	@Autowired
	private MarkDAO markDAO;

	public void saveMark(Mark mark) {
		markDAO.saveMark(mark);
	}

	public void updateMark(Mark mark) {
		markDAO.updateMark(mark);
	}

	public void deleteMark(Mark mark) {
		markDAO.deleteMark(mark);
	}

	public Mark findMark(Integer idMark) {
		return markDAO.findMark(idMark);
	}

	public List<Mark> getAll() {
		return markDAO.getAll();
	}


	
	
}
