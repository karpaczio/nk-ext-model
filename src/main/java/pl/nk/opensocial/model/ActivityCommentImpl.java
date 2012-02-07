package pl.nk.opensocial.model;

/**
 * 
 * @author Jakub Białek
 * 
 */
public class ActivityCommentImpl extends CommentImpl implements ActivityComment {

  private String appId;

  @Override
  public String getAppId() {
    return appId;
  }

  @Override
  public void setAppId(final String appId) {
    this.appId = appId;
  }

}
