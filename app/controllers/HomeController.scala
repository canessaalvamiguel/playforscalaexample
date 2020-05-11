package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.Product

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) 
      extends BaseController {

  def index() = Action { implicit request: Request[AnyContent] =>            
    Redirect(routes.Products.list())
  }
}
