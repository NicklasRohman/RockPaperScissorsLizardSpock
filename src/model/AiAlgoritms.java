package model;

import java.util.Random;

public interface AiAlgoritms {
	Human humenPlayer = Human.getInstance();

	public class Answer {

		public String theAnswer() {
			String answer = null;
			int rock = humenPlayer.getAnswerRock();
			int scissors = humenPlayer.getAnswerScissors();
			int paper = humenPlayer.getAnswerPaper();
			int lizard = humenPlayer.getAnswerLizard();
			int spock = humenPlayer.getAnswerSpock();

			if ((rock > scissors) && (rock > paper) && (rock > lizard) && (rock > spock)) {
				answer = mostRock();
			} else if ((scissors > rock) && (scissors > paper) && (scissors > lizard) && (scissors > spock)) {
				answer = mostScissors();
			} else if ((paper > rock) && (paper > scissors) && (paper > lizard) && (paper > spock)) {
				answer = mostPaper();
			} else if ((lizard > rock) && (lizard > scissors) && (lizard > paper) && (lizard > spock)) {
				answer = mostLizard();
			} else if ((spock > rock) && (spock > scissors) && (spock > paper) && (spock > lizard)) {
				answer = mostSpock();
			} else {
				switch (randomMethod(1, 5)) {
				case 1:
					return "rock";
				case 2:
					return "scissors";
				case 3:
					return "paper";
				case 4:
					return "lizard";
				case 5:
					return "spock";
				default:
					break;
				}
			}
			return answer;
		}

		private String mostRock() {

			if (humenPlayer.getAnswerPaper() == humenPlayer.getAnswerSpock()) {
				switch (randomMethod(1, 2)) {
				case 1:
					return "paper";
				case 2:
					return "spock";
				default:
					break;
				}
			}
			if (humenPlayer.getAnswerPaper() > humenPlayer.getAnswerSpock()) {
				return "paper";
			} else {
				return "spock";
			}
		}

		private String mostPaper() {
			if (humenPlayer.getAnswerScissors() == humenPlayer.getAnswerLizard()) {
				switch (randomMethod(1, 2)) {
				case 1:
					return "scissors";
				case 2:
					return "lizard";
				default:
					break;
				}
			}

			if (humenPlayer.getAnswerScissors() > humenPlayer.getAnswerLizard()) {
				return "scissors";
			} else {
				return "lizard";
			}

		}

		private String mostSpock() {
			if (humenPlayer.getAnswerLizard() == humenPlayer.getAnswerPaper()) {
				switch (randomMethod(1, 2)) {
				case 1:
					return "lizard";
				case 2:
					return "paper";
				default:
					break;
				}
			}

			if (humenPlayer.getAnswerLizard() > humenPlayer.getAnswerPaper()) {
				return "lizard";
			} else {
				return "paper";
			}
		}

		private String mostLizard() {
			if (humenPlayer.getAnswerRock() == humenPlayer.getAnswerScissors()) {
				switch (randomMethod(1, 2)) {
				case 1:
					return "rock";
				case 2:
					return "scissors";
				default:
					break;
				}
			}
			if (humenPlayer.getAnswerRock() > humenPlayer.getAnswerScissors()) {
				return "rock";
			} else {
				return "scissors";
			}

		}

		private String mostScissors() {
			if (humenPlayer.getAnswerSpock() == humenPlayer.getAnswerRock()) {
				switch (randomMethod(1, 2)) {
				case 1:
					return "spock";
				case 2:
					return "rock";
				default:
					break;
				}
			}

			if (humenPlayer.getAnswerSpock() > humenPlayer.getAnswerRock()) {
				return "spock";
			} else {
				return "rock";
			}
		}

		private int randomMethod(int min, int max) {
			Random rand = new Random();
			int test = rand.nextInt(max + 1 - min) + min;
			return test;
		}
	}
}
