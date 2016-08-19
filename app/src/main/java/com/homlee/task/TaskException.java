package com.homlee.task;

/**
 * {@code Exception} is the superclass of all classes that represent recoverable
 * exceptions. When exceptions are thrown, they may be caught by application
 * code.
 *
 * @see Throwable
 * @see Error
 * @see RuntimeException
 */
public class TaskException extends Exception{

	private static final long serialVersionUID = -469332393917278921L;
	
	private int mMessageStringId = -1;

	/**
	 * @param detailMessage
	 */
	public TaskException(String detailMessage) {
		super(detailMessage);
	}
	/**
	 * @param throwable
	 */
	public TaskException(Throwable throwable) {
		super(throwable);
	}

	/** 
	 * @param detailMessage
	 * @param throwable
	 */
	public TaskException(String detailMessage, Throwable throwable) {
		super(detailMessage, throwable);
	}
	
	public TaskException(String detailMessage, int StringId) {
		super(detailMessage);
		this.mMessageStringId = StringId;
	}
	/**
	 * @param throwable
	 * @param StringId
	 */
	public TaskException(Throwable throwable, int StringId) {
		super(throwable);
		this.mMessageStringId = StringId;
	}
	
	public int getMessageStringId(){
		return this.mMessageStringId;
	}
	
}
