package model;

import java.util.Random;

public interface AiAlgoritms {
	Player player = new Player();

	public class Answer {

		// How to get the highest value of 5
		public String theAnswer() {

			 int rock = player.getAnswerRock();
			 int scissors = player.getAnswerScissors();
			 int paper = player.getAnswerPaper();
			 int lizard = player.getAnswerLizard();
			 int spock = player.getAnswerSpock();

			if ((rock > scissors) && (rock > paper) && (rock > lizard) && (rock > spock)) {
				System.out.println(mostRock());
			} else if ((scissors > rock) && (scissors > paper) && (scissors > lizard) && (scissors > spock)) {
				System.out.println(mostScissors());
			} else if ((paper > rock) && (paper > scissors) && (paper > lizard) && (paper > spock)) {
				System.out.println(mostPaper());
			} else if ((lizard > rock) && (lizard > scissors) && (lizard > paper) && (lizard > spock)) {
				System.out.println(mostLizard());
			} else if ((spock > rock) && (spock > scissors) && (spock > paper) && (spock > lizard)) {
				System.out.println(mostSpock());
			}
			System.out.println("gick förbi if");
			return "gick förbi if";
		}

		private String mostRock() {

			if (player.getAnswerPaper() == player.getAnswerSpock()) {
				switch (randomMethod(1, 2)) {
				case 1:
					return "paper";
				case 2:
					return "spock";
				default:
					break;
				}
			}
			if (player.getAnswerPaper() > player.getAnswerSpock()) {
				return "paper";
			} else {
				return "spock";
			}
		}

		private String mostPaper() {
			if (player.getAnswerScissors() == player.getAnswerLizard()) {
				switch (randomMethod(1, 2)) {
				case 1:
					return "scissors";
				case 2:
					return "lizard";
				default:
					break;
				}
			}

			if (player.getAnswerScissors() > player.getAnswerLizard()) {
				return "scissors";
			} else {
				return "lizard";
			}

		}

		private String mostSpock() {
			if (player.getAnswerLizard() == player.getAnswerPaper()) {
				switch (randomMethod(1, 2)) {
				case 1:
					return "lizard";
				case 2:
					return "paper";
				default:
					break;
				}
			}

			if (player.getAnswerLizard() > player.getAnswerPaper()) {
				return "lizard";
			} else {
				return "paper";
			}
		}

		private String mostLizard() {
			if (player.getAnswerRock() == player.getAnswerScissors()) {
				switch (randomMethod(1, 2)) {
				case 1:
					return "rock";
				case 2:
					return "scissors";
				default:
					break;
				}
			}
			if (player.getAnswerRock() > player.getAnswerScissors()) {
				return "rock";
			} else {
				return "scissors";
			}

		}

		private String mostScissors() {
			if (player.getAnswerSpock() == player.getAnswerRock()) {
				switch (randomMethod(1, 2)) {
				case 1:
					return "spock";
				case 2:
					return "rock";
				default:
					break;
				}
			}

			if (player.getAnswerSpock() > player.getAnswerRock()) {
				return "spock";
			} else {
				return "rock";
			}
		}

		private int randomMethod(int min, int max) {
			Random rand = new Random();
			int test = rand.nextInt(max + 1 - min) + min;
			System.out.println(test);
			return test;
		}
	}
}
