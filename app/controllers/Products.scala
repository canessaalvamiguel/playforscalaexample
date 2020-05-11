package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.Product
import play.api.i18n._

@Singleton
class Products @Inject()(val controllerComponents: ControllerComponents) 
      extends BaseController 
      with I18nSupport{

  def list() = Action { implicit request: Request[AnyContent] =>        
    val products = Product.findAll
    implicit val lang: Lang = request.lang
    Ok(views.html.products.list(products))
  }

  def show(ean: Long) = Action { implicit request =>    
    implicit val lang: Lang = request.lang
    Product.findByEan(ean).map { product =>
      Ok(views.html.products.details(product))
    }.getOrElse(NotFound)
  }

}
