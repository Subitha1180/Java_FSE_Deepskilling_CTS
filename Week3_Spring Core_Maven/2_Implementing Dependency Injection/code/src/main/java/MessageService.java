public class MessageService {

    private MessageRepository messageRepository;

    public void setMessageRepository(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public void displayMessage() {
        System.out.println(messageRepository.getMessage());
    }
}
