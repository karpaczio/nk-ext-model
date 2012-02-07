package pl.nk.opensocial.model;

import org.apache.shindig.social.core.model.PersonImpl;

public class NkPersonImpl extends PersonImpl implements NkPerson {

  private Integer friendsCount;

  @Override
  public Integer getNkFriendsCount() {
    return friendsCount;
  }

  @Override
  public void setNkFriendsCount(final Integer friendsCount) {
    this.friendsCount = friendsCount;
  }
}
