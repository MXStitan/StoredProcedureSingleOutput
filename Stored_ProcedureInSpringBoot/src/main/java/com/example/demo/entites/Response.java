package com.example.demo.entites;


public class Response {

	private int Status;
	private int ErrorCode;
	private String MessageType;
	private String Message;
	private Student student;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Response(int status, int errorCode, String messageType, String message, Student student) {
		super();
		Status = status;
		ErrorCode = errorCode;
		MessageType = messageType;
		Message = message;
		this.student = student;
	}
	
	




	public int getStatus() {
		return Status;
	}




	public void setStatus(int status) {
		Status = status;
	}




	public int getErrorCode() {
		return ErrorCode;
	}




	public void setErrorCode(int errorCode) {
		ErrorCode = errorCode;
	}




	public String getMessageType() {
		return MessageType;
	}




	public void setMessageType(String messageType) {
		MessageType = messageType;
	}




	public String getMessage() {
		return Message;
	}




	public void setMessage(String message) {
		Message = message;
	}




	public Student getStudent() {
		return student;
	}




	public void setStudent(Student student) {
		this.student = student;
	}




	@Override
	public String toString() {
		return "Response [Status=" + Status + ", ErrorCode=" + ErrorCode + ", MessageType=" + MessageType + ", Message="
				+ Message + ", student=" + student + "]";
	}
	
	


}

