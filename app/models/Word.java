package models;

import java.util.*;

import play.data.validation.Constraints.*;

public class Word {
    
  public Long id;

  @Required
  public String label;
  
  public static List<Word> all() {
    return new ArrayList<Word>();
  }
  
  public static void create(Word task) {
  }
  
  public static void delete(Long id) {
  }
    
}