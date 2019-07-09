package chapter7;

public class ComputerStu extends Student {

	double operScore;//操作能力分数
	double englishScore;//英语写作分数
	double finalScore;//期末分数
	double midtermScore;//其中考试
	
	public ComputerStu(int stuNo, String stuName, char stuSex, int stuAge,
			double operScore,double englishScore,double finalScore,double midtermScore) {
		super(stuNo, stuName, stuSex, stuAge, operScore * 0.4 + englishScore * 0.2 +
				finalScore * 0.2 + midtermScore * 0.2);
		this.operScore = operScore;
		this.englishScore = englishScore;
		this.finalScore = finalScore;
		this.midtermScore = midtermScore;
	}
}
