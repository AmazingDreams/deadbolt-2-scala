package be.objectify.deadbolt.scala.test.controllers.composed

import be.objectify.deadbolt.scala.DeadboltActions
import play.api.mvc.{Action, Controller}

/**
 * @author Steve Chaloner (steve@objectify.be)
 */
class Dynamic(deadbolt: DeadboltActions) extends Controller {

  def index =
    deadbolt.Dynamic(name = "niceName") {
      Action {
        Ok("Content accessible")
      }
    }
}
