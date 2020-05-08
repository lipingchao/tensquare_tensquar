package entity;

/**
 * The type Result.
 *
 * @param <T> the type parameter
 */
public class Result<T> {
	private boolean flag;// 是否成功
	private Integer code;// 返回码
	private String message;// 返回信息
	private Object data;// 返回数据

	/**
	 * Instantiates a new Result.
	 *
	 * @param flag    the flag
	 * @param code    the code
	 * @param message the message
	 * @param data    the data
	 */
	public Result(boolean flag, Integer code, String message, Object data) {
		super();
		this.flag = flag;
		this.code = code;
		this.message = message;
		this.data = data;
	}
	public Result(boolean flag, Integer code, Object data) {
		super();
		this.flag = flag;
		this.code = code;
		this.data = data;
	}
	/**
	 * Instantiates a new Result.
	 */
	public Result() {
	}

	/**
	 * Instantiates a new Result.
	 *
	 * @param flag    the flag
	 * @param code    the code
	 * @param message the message
	 */
	public Result(boolean flag, Integer code, String message) {
		super();
		this.flag = flag;
		this.code = code;
		this.message = message;
	}

	@Override
	public String toString() {
		return "Result{" +
				"flag=" + flag +
				", code=" + code +
				", message='" + message + '\'' +
				", data=" + data +
				'}';
	}

	/**
	 * Is flag boolean.
	 *
	 * @return the boolean
	 */
	public boolean isFlag() {
		return flag;
	}

	/**
	 * Sets flag.
	 *
	 * @param flag the flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	/**
	 * Gets code.
	 *
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * Sets code.
	 *
	 * @param code the code
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * Gets message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets message.
	 *
	 * @param message the message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets data.
	 *
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * Sets data.
	 *
	 * @param data the data
	 */
	public void setData(Object data) {
		this.data = data;
	}
}