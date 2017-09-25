package model;

public interface PlayerInterface {
	HumanClass hc = new HumanClass();
	

	public class HumanClass implements PlayerInterface {
		Human human = Human.getInstance();
		public String getName(){
			return human.getName();
		}
		public void setName(String name){
			human.setName(name);	
		}
		
	}
}
