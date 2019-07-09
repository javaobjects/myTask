package chapter7;

public class LiteratureStu extends Student {

	double speechScore;//演讲分数
	double worksScore;//作品分数
	double finalScore;//期末考试分数
	double midtermScore;//其中考试分数
	public LiteratureStu(int stuNo, String stuName, char stuSex, int stuAge, 
			double speechScore,double worksScore,double finalScore,double midtermScore) {
		super(stuNo, stuName, stuSex, stuAge, 
				speechScore * 0.35 + worksScore * 0.35 + 
				finalScore * 0.15 + midtermScore * 0.15);
		this.speechScore = speechScore;
		this.worksScore = worksScore;
		this.finalScore = finalScore;
		this.midtermScore = midtermScore;
	}
}
