package enumStudy;

public enum Shichifukujin {
	
	DAIKOKUTEN(1),
	BISHAMONTEN(2),
	EBISUTEN(3),
	JUROJIN(4),
	FUKUROKUJU(5),
	BENZAITEN(6),
	HOTEIMON(7),
	HIROKI(8);
	
	private int index;
	
	public int getIndex() {
		return index;
	}

	Shichifukujin(int index){
		this.index = index;
	}
	
}
