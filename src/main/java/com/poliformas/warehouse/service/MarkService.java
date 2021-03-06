package com.poliformas.warehouse.service;

import java.util.List;

import com.poliformas.warehouse.integration.entity.Mark;

public interface MarkService {
	public void saveMark(Mark mark);
	public void updateMark(Mark mark);
	public void deleteMark(Mark mark);
	public Mark findMark(Integer idMark);
	public List<Mark> getAll();
}
