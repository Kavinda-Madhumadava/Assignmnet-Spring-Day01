package data;

public class Message {
    private String sender;
    private String message;
    private String sendDate;

    public Message() {
    }

    public Message(String sender, String message, String sendDate) {
        this.sender = sender;
        this.message = message;
        this.sendDate = sendDate;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                ", sendDate='" + sendDate + '\'' +
                '}';
    }
}
