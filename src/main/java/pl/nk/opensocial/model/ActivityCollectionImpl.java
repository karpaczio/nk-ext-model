package pl.nk.opensocial.model;

/**
 * 
 * @author Jakub Białek
 * 
 */
public class ActivityCollectionImpl implements ActivityCollection {

  private String appId;

  private Integer unread;

  private Integer total;

  private Long lastReadTime;

  @Override
  public String getAppId() {
    return appId;
  }

  @Override
  public void setAppId(final String appId) {
    this.appId = appId;
  }

  @Override
  public Integer getUnread() {
    return unread;
  }

  @Override
  public void setUnread(final Integer unread) {
    this.unread = unread;
  }

  @Override
  public Integer getTotal() {
    return total;
  }

  @Override
  public void setTotal(final Integer total) {
    this.total = total;
  }

  @Override
  public Long getLastReadTime() {
    return lastReadTime;
  }

  @Override
  public void setLastReadTime(final Long timestamp) {
    this.lastReadTime = timestamp;
  }

}
