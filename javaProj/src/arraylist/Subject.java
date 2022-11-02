package arraylist;

public class Subject {
	//멤버변수
	private int scorePoint;
	private String name;
	
	
	
	
	//생성자
	public Subject() {
		
	}
	
	
	
	
	
	//메서드
	public void setName(String name) {		//과목명 입력할거야~
		this.name = name;
	}
	
	public void setScore(int score) {		//그과목 성적 입력할거야~
		this.scorePoint = score;
	}
	
	public int getScorePoint() {			//점수 get(), 점수가 private이어도 됨.
		return scorePoint;
	}
	
	public String getName() {				//과목명 get(), private이어도 됨.
		return name;
	}
}
