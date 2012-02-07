package pl.nk.opensocial.model;

import java.util.HashSet;
import java.util.Set;

import org.apache.shindig.social.opensocial.model.Person;

public interface NkPerson extends Person {
  void setNkFriendsCount(Integer nkFriendsCount);

  Integer getNkFriendsCount();

  public static enum Field {
    NK_FRIENDS_COUNT("nkFriendsCount");

    private final String name;

    Field(final String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    @Override
    public String toString() {
      return name;
    }

    public static final Set<String> ALL_FIELDS = new HashSet<String>(Person.Field.ALL_FIELDS.size() + values().length);
    static {
      ALL_FIELDS.addAll(Person.Field.ALL_FIELDS);
      ALL_FIELDS.add(NK_FRIENDS_COUNT.toString());
    }
  }
}
