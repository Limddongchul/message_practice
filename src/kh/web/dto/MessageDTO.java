package kh.web.dto;

public class MessageDTO {
	
	private String message_id;
	private String name;
	private String message;
	
	public MessageDTO() {
		
	}
	
	public MessageDTO(String message_id, String name, String message) {
		super();
		this.message_id = message_id;
		this.name = name;
		this.message = message;
	}

	public String getMessage_id() {
		return message_id;
	}

	public void setMessage_id(String message_id) {
		this.message_id = message_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
