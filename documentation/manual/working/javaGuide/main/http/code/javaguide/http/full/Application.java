/*
 * Copyright (C) 2009-2020 Lightbend Inc. <https://www.lightbend.com>
 */

// #full-controller
// ###replace: package controllers;
package javaguide.http.full;

import play.*;
import play.mvc.*;

public class Application extends Controller {

  public Result index() {
    return ok("It works!");
  }
}
// #full-controller
