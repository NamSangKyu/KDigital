package generic;
//							Animal을 상속받은 클래스만 사용할 수 있다.
public class GenericExtends<T extends Animal> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public void printAnimal() {
		obj.printAnimal();//extends Animal을 했기때문에 가능
	}
}
