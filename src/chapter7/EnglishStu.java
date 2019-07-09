package chapter7;

public class EnglishStu extends Student {

	double speechScore;//演讲分数
	double finalScore;//期末考试分数
	double midtermScore;//其中考试分数
	public EnglishStu(int stuNo, String stuName, char stuSex, int stuAge,
			double speechScore,double finalScore,double midtermScore) {
		super(stuNo, stuName, stuSex, stuAge, speechScore * 0.5 + finalScore * 0.25 + midtermScore * 0.25);
		this.speechScore = speechScore;
		this.finalScore = finalScore;
		this.midtermScore = midtermScore;
	}
}
