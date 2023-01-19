package chapter16.generic2;

public class GenericPrinter<T extends Meterial> {
	
	private T meterial;
	
	public T getMeterial() {
		return meterial;
	}
	
	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}

	@Override
	public String toString() {
		return meterial.toString();
	}
	
	


}
