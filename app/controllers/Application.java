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
    views.html.index.render(Word.all(), wordForm) );
  }

  public static Result word(Long id){
  	return TODO;
  }

  public static Result deleteWord(Long id){
  	Word.delete(id);
    return redirect(routes.Application.words());
  }

  public static Result newWord() {
    Form<Word> filledForm = wordForm.bindFromRequest();
    if(filledForm.hasErrors()) {
      return badRequest(
        views.html.index.render(Word.all(), filledForm)
      );
    } else {
      Word.create(filledForm.get());
      return redirect(routes.Application.words());  
    }
  }
}