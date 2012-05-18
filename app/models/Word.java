package models;

import java.util.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;

@Entity
public class Word extends Model {
  
  @Id  
  public Long id;

  @Required
  public String label;
   
  public static List<Word> all() {
    return find.all();
  }

  public static void create(Word word) {
    word.save();
  }

  public static void delete(Long id) {
    find.ref(id).delete();
  }  
  public static Finder<Long,Word> find = new Finder(
    Long.class, Word.class
  );  
}