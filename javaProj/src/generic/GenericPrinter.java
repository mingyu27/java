package generic;

public class GenericPrinter<T extends Material> {

	//멤버변수
	private T material;
	
	//생성자
	
	//메서드
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
}
