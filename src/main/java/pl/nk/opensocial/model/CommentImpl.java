package pl.nk.opensocial.model;

import org.apache.shindig.social.opensocial.model.Person;

/**
 * 
 * @author Jakub Białek
 * 
 */
public class CommentImpl implements Comment {

  private String authorId;

  private String body;

  private String inReplyTo;

  private String id;

  private Long postedTime;

  private Person author;

  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(final String authorId) {
    this.authorId = authorId;
  }

  @Override
  public Person getAuthor() {
    return author;
  }

  @Override
  public void setAuthor(final Person author) {
    this.author = author;
  }

  public String getBody() {
    return body;
  }

  public void setBody(final String body) {
    this.body = body;
  }

  public String getInReplyTo() {
    return inReplyTo;
  }

  public void setInReplyTo(final String inReplyTo) {
    this.inReplyTo = inReplyTo;
  }

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public Long getPostedTime() {
    return postedTime;
  }

  public void setPostedTime(final Long postedTime) {
    this.postedTime = postedTime;
  }

}
