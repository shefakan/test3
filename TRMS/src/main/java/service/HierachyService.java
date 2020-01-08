package service;

import dao.HierachyDao;
import dao.HierachyDaoImp;
import model.Hierachy;

public class HierachyService {
	
	public static HierachyDao h = new HierachyDaoImp();
	
	public Hierachy getRank(int rankNum) {
		return h.getRank(rankNum);
	}

}
