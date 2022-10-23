import com.fasterxml.jackson.annotation.JsonProperty;

public class CatsFacts {
    private String id;
    private String text;
    private String type;
    private String user;
    private int upvotes;

    public CatsFacts (
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public int getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "User: " + user +
                "\n Fact: " + text +
                "\n Votes: " + upvotes;
    }

}
