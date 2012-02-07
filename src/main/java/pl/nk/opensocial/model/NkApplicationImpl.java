package pl.nk.opensocial.model;

public class NkApplicationImpl implements NkApplication {

  private String id;
  private String name;
  private String description;
  private String thumbnailUrl;
  private String url;

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(final String id) {
    this.id = id;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(final String name) {
    this.name = name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void setDescription(final String description) {
    this.description = description;
  }

  @Override
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  @Override
  public void setThumbnailUrl(final String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  @Override
  public String getUrl() {
    return url;
  }

  @Override
  public void setUrl(final String url) {
    this.url = url;

  }
}
