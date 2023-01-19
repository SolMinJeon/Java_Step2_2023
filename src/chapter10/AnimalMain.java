package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		//Animal a = new Animal();
		Bear b = new Bear();
		System.out.println("-----곰-----");
		System.out.println("특징 : " + b.woong);
		System.out.println("눈 : " + b.getEye());
		System.out.println("다리 : " + b.getLeg());
		
		System.out.println("-----사자-----");
		System.out.println("특징 : " + new Lion().galgi);
		System.out.println("눈 : " + new Animal().getEye());
		System.out.println("다리 : " + new Animal().getLeg());
		
		System.out.println("-----거미-----");
		System.out.println("특징 : " + new Spider().web);
		System.out.println("눈 : " + new Spider().getEye());
		System.out.println("다리 : " + new Spider().getLeg());
		
		
	}

}
