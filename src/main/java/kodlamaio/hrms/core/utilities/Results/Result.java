package kodlamaio.hrms.core.utilities.Results;

public class Result {
  private String message;
  private boolean success;
  public Result(boolean success) {
	  this.success=success;
  }
  public Result(boolean success,String message) {
	  this(success);
	  this.message=message;
  }
  public boolean isSuccess() {
	  return success;
  }
  public String getMessage() {
	  return this.message;
  }
}
