package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import views.html.*;
import models.*;

public class Application extends Controller {
  
	static Form<Word> wordForm = form(Word.class);

  public static Result index() {
    return redirect(routes.Application.words());
  } 

  public static Result words(){
  	return ok(
    views.html.index.render(Word.all(), wordForm)
  );
  }

  public static Result word(Long word){
  	return TODO;
  }

	public static Result newWord(){
  	return TODO;
  }

  public static Result deleteWord(Long word){
  	return TODO;
  }
}