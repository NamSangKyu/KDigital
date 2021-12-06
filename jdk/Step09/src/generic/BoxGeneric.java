package generic;
/*
 * 제네릭
 * 	객체 생성시 사용자 원하는 데이터 타입으로 선언하는 방법
 */
public class BoxGeneric<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
