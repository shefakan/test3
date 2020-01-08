package model;

public class Hierachy {
	
	String positions;
	int rankNum;
	public Hierachy() {
		super();
	}
	public Hierachy(String positions, int rankNum) {
		super();
		this.positions = positions;
		this.rankNum = rankNum;
	}
	public String getPositions() {
		return positions;
	}
	public void setPositions(String positions) {
		this.positions = positions;
	}
	public int getRankNum() {
		return rankNum;
	}
	public void setRankNum(int rankNum) {
		this.rankNum = rankNum;
	}
	@Override
	public String toString() {
		return "Hierachy [positions=" + positions + ", rankNum=" + rankNum + "]";
	}
	
	

}
