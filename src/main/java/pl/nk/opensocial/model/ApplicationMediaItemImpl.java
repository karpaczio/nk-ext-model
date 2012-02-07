package pl.nk.opensocial.model;

import org.apache.shindig.common.JsonProperty;
import org.apache.shindig.social.core.model.MediaItemImpl;
import org.apache.shindig.social.opensocial.model.Album;

/**
 * 
 * @author Jakub Białek
 * 
 */
public class ApplicationMediaItemImpl extends MediaItemImpl implements ApplicationMediaItem {

  private String addedBy;
  private String numSuperVotes;
  private Long nkCreatedTime;
  private Long nkVotesSum;
  private Album nkAlbum;

  public ApplicationMediaItemImpl() {}

  public ApplicationMediaItemImpl(final String mimeType, final Type type, final String url) {
    super(mimeType, type, url);
  }

  @JsonProperty("nk_addedBy")
  public String getAddedBy() {
    return addedBy;
  }

  @JsonProperty("nk_addedBy")
  public void setAddedBy(final String addedBy) {
    this.addedBy = addedBy;
  }

  @JsonProperty("nkNumSuperVotes")
  public String getNumSuperVotes() {
    return numSuperVotes;
  }

  @JsonProperty("nkNumSuperVotes")
  public void setNumSuperVotes(final String numSuperVotes) {
    this.numSuperVotes = numSuperVotes;
  }

  @Override
  public Long getNkCreatedTime() {
    return nkCreatedTime;
  }

  @Override
  public void setNkCreatedTime(final Long createdTime) {
    this.nkCreatedTime = createdTime;
  }

  @Override
  public Long getNkVotesSum() {
    return nkVotesSum;
  }

  @Override
  public void setNkVotesSum(final Long votesSum) {
    this.nkVotesSum = votesSum;
  }

  @Override
  public Album getNkAlbum() {
    return nkAlbum;
  }

  @Override
  public void setNkAlbum(final Album nkAlbum) {
    this.nkAlbum = nkAlbum;
  }

}
