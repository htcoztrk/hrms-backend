package kodlamaio.hrms.core.utilities.Results;

public class DataResult<T> extends Result{

	private T data;
	public DataResult(T data, boolean success) {
		super(success);
	}
	public DataResult(T data,boolean success,String message) {
		super(success,message);
		this.data=data;
	}
	
	public T getData() {
		return this.data;
	}
}
