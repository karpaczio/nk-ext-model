package pl.nk.opensocial.model;

import org.apache.shindig.protocol.model.Exportablebean;
import org.apache.shindig.social.opensocial.model.Person;

import com.google.inject.ImplementedBy;

@Exportablebean
@ImplementedBy(CommentImpl.class)
public interface Comment {

  public static enum Field {
    ID("id"),
    AUTHOR_ID("authorId"),
    AUTHOR("author"),
    BODY("body"),
    IN_REPLY_TO("inReplyTo"),
    POSTED_TIME("postedTime");

    private final String jsonString;

    private Field(final String jsonString) {
      this.jsonString = jsonString;
    }

    @Override
    public String toString() {
      return jsonString;
    }
  }

  String getAuthorId();

  void setAuthorId(String authorId);

  Person getAuthor();

  void setAuthor(Person author);

  String getBody();

  void setBody(String body);

  String getInReplyTo();

  void setInReplyTo(String inReplyTo);

  String getId();

  void setId(String id);

  Long getPostedTime();

  void setPostedTime(Long postedTime);

}
