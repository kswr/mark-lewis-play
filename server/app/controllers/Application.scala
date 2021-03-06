package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._

@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action { implicit request =>
    Ok(views.html.index(SharedMessages.itWorks))
  }

  def getRandomNumber = Action {
    Ok(scala.util.Random.nextInt(100).toString)
  }

  def getRandomString(length: Int) = Action {
    Ok(scala.util.Random.nextString(length))
  }
  
}
