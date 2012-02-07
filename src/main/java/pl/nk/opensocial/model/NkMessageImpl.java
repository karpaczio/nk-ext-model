package pl.nk.opensocial.model;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.shindig.social.opensocial.model.EnumUtil;
import org.apache.shindig.social.opensocial.model.Url;

public class NkMessageImpl implements NkMessage {
  private String appUrl;
  private String body;
  private String bodyId;
  private List<String> collectionIds;
  private String id;
  private String inReplyTo;
  private List<String> recipients;
  private List<String> replies;
  private String senderId;
  private Status status;
  private Date timeSent;
  private String title;
  private String titleId;
  private Type type;
  private Date updated;
  private List<Url> urls;
  private Map<String, String> nkOptUrlParams;
  private Long nkCreatedTime;

  public static final Set<String> DEFAULT_PRIVATE_MESSAGE_FIELDS = EnumUtil.getEnumStrings(Field.ID, Field.TITLE,
      Field.TIME_SENT, Field.SENDER_ID);

  public NkMessageImpl() {}

  public NkMessageImpl(final String initBody, final String initTitle, final Type initType) {
    this.body = initBody;
    this.title = initTitle;
    this.type = initType;
  }

  public String getAppUrl() {
    return appUrl;
  }

  public void setAppUrl(final String appUrl) {
    this.appUrl = appUrl;
  }

  public String getBody() {
    return this.body;
  }

  public void setBody(final String newBody) {
    this.body = newBody;
  }

  public String getBodyId() {
    return bodyId;
  }

  public void setBodyId(final String bodyId) {
    this.bodyId = bodyId;
  }

  public List<String> getCollectionIds() {
    return collectionIds;
  }

  public void setCollectionIds(final List<String> collectionIds) {
    this.collectionIds = collectionIds;
  }

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getInReplyTo() {
    return inReplyTo;
  }

  public void setInReplyTo(final String parentId) {
    this.inReplyTo = parentId;
  }

  public List<String> getRecipients() {
    return this.recipients;
  }

  public void setRecipients(final List<String> recipients) {
    this.recipients = recipients;
  }

  public List<String> getReplies() {
    return replies;
  }

  public void setReplies(final List<String> replies) {
    this.replies = replies;
  }

  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(final String senderId) {
    this.senderId = senderId;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(final Status status) {
    this.status = status;
  }

  public Date getTimeSent() {
    return timeSent;
  }

  public void setTimeSent(final Date timeSent) {
    this.timeSent = timeSent;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(final String newTitle) {
    this.title = newTitle;
  }

  public String getTitleId() {
    return titleId;
  }

  public void setTitleId(final String titleId) {
    this.titleId = titleId;
  }

  public Type getType() {
    return type;
  }

  public void setType(final Type newType) {
    this.type = newType;
  }

  public Date getUpdated() {
    return this.updated;
  }

  public void setUpdated(final Date updated) {
    this.updated = updated;
  }

  public List<Url> getUrls() {
    return this.urls;
  }

  public void setUrls(final List<Url> urls) {
    this.urls = urls;
  }

  public Map<String, String> getNkOptUrlParams() {
    return nkOptUrlParams;
  }

  public void setNkOptUrlParams(final Map<String, String> nkOptUrlParams) {
    this.nkOptUrlParams = nkOptUrlParams;
  }

  @Override
  public Long getNkCreatedTime() {
    return nkCreatedTime;
  }

  @Override
  public void setNkCreatedTime(final Long nkCreatedTime) {
    this.nkCreatedTime = nkCreatedTime;
  }

  public String sanitizeHTML(final String htmlStr) {
    return htmlStr;
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer("{");
    sb.append("type:" + type);
    sb.append(",recipients:" + (recipients != null ? recipients.size() : 0));
    sb.append("}");
    return sb.toString();
  }
}
