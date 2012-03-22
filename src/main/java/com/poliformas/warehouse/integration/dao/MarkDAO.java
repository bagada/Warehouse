package com.poliformas.warehouse.integration.dao;

import com.poliformas.warehouse.integration.entity.Mark;

public interface MarkDAO {
	
	public void saveMark(Mark mark);
	public void updateMark(Mark mark);
	public void deleteMark(Mark mark);
	public Mark findMark(Mark umark);

}
