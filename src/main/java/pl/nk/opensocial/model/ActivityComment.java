package pl.nk.opensocial.model;

import org.apache.shindig.protocol.model.Exportablebean;

import com.google.inject.ImplementedBy;

// CHECKSTYLE:DUPLICATE OFF

/**
 * 
 * @author Jakub Białek
 * 
 */
@Exportablebean
@ImplementedBy(ActivityCommentImpl.class)
public interface ActivityComment extends Comment {

  public static enum Field {
    ID("id"),
    AUTHOR_ID("authorId"),
    AUTHOR("author"),
    BODY("body"),
    IN_REPLY_TO("inReplyTo"),
    APP_ID("appId"),
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

  String getAppId();

  void setAppId(String appId);
}
