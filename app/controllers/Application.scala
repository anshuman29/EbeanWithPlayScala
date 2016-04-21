package controllers

import play.api.mvc._
import services.EbeanLogic

class Application extends Controller{

  def testFunction() = Action { request =>
    var ebeanLogic = new EbeanLogic
    ebeanLogic.testEbean()
    Ok("result = " + true)

  }
}