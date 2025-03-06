package com.abc.model;

public class HumanBody {

	private HumanHeart humanHeart;
	
	  public HumanHeart getHumanHeart() {
		return humanHeart;
	}
	public void setHumanHeart(HumanHeart humanHeart) {
		System.out.println("Setter Method");
		this.humanHeart = humanHeart;
	}

	
	public HumanBody(HumanHeart humanHeart) {
		System.out.println("param :: Constructor");
		this.humanHeart = humanHeart;
	}

	
	public HumanBody() {
		System.out.println("No-Arg :: Constructor");
	}
	public void breath() {
			if(humanHeart!=null)
			{
		    humanHeart.pumpBlood();
		    System.out.println("Human Taking Breath Human is Alive");
			}
			else
			System.out.println("Human Heart is not working Human is Dead!!");	
	  }
}
