package pl.nk.opensocial.model;

import java.util.List;

import org.apache.shindig.social.core.model.ActivityImpl;

public class NkActivityImpl extends ActivityImpl implements NkActivity {

  private Integer nkCommentsCount;
  private Integer nkStarsCount;
  private List<String> nkStarsAuthorsIds;
  private String nkAppId;
  private String nkGroupId;
  private List<String> nkOrigins;
  private String nkDefaultDescription;
  private String nkImageUrl;
  private String nkSiteUrl;
  private String nkSiteTitle;
  private String nkSiteImageUrl;
  private String nkSiteDescription;

  public Integer getNkCommentsCount() {
    return nkCommentsCount;
  }

  public void setNkCommentsCount(final Integer nkCommentsCount) {
    this.nkCommentsCount = nkCommentsCount;
  }

  public Integer getNkStarsCount() {
    return nkStarsCount;
  }

  public void setNkStarsCount(final Integer nkStarsCount) {
    this.nkStarsCount = nkStarsCount;
  }

  public List<String> getNkStarsAuthorsIds() {
    return nkStarsAuthorsIds;
  }

  public void setNkStarsAuthorsIds(final List<String> nkStarsAuthorsIds) {
    this.nkStarsAuthorsIds = nkStarsAuthorsIds;
  }

  public String getNkAppId() {
    return nkAppId;
  }

  public void setNkAppId(final String nkAppId) {
    this.nkAppId = nkAppId;
  }

  public String getNkGroupId() {
    return nkGroupId;
  }

  public void setNkGroupId(final String nkGroupId) {
    this.nkGroupId = nkGroupId;
  }

  public List<String> getNkOrigins() {
    return nkOrigins;
  }

  public void setNkOrigins(final List<String> nkOrigins) {
    this.nkOrigins = nkOrigins;
  }

  @Override
  public String getNkDefaultDescription() {
    return nkDefaultDescription;
  }

  @Override
  public String getNkImageUrl() {
    return nkImageUrl;
  }

  @Override
  public String getNkSiteImageUrl() {
    return nkSiteImageUrl;
  }

  @Override
  public String getNkSiteTitle() {
    return nkSiteTitle;
  }

  @Override
  public String getNkSiteUrl() {
    return nkSiteUrl;
  }

  @Override
  public String getNkSiteDescription() {
    return nkSiteDescription;
  }

  @Override
  public void setNkDefaultDescription(final String nkDefaultDescription) {
    this.nkDefaultDescription = nkDefaultDescription;

  }

  @Override
  public void setNkImageUrl(final String nkImageUrl) {
    this.nkImageUrl = nkImageUrl;

  }

  @Override
  public void setNkSiteDescription(final String nkSiteDescription) {
    this.nkSiteDescription = nkSiteDescription;

  }

  @Override
  public void setNkSiteImageUrl(final String nkSiteImageUrl) {
    this.nkSiteImageUrl = nkSiteImageUrl;

  }

  @Override
  public void setNkSiteTitle(final String nkSiteTitle) {
    this.nkSiteTitle = nkSiteTitle;

  }

  @Override
  public void setNkSiteUrl(final String nkSiteUrl) {
    this.nkSiteUrl = nkSiteUrl;

  }

}
