/*
 * Copyright (C) 2009-2020 Lightbend Inc. <https://www.lightbend.com>
 */

// ###replace: package tasks;
package javaguide.scheduling;

import com.google.inject.AbstractModule;

public class TasksModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(MyActorTask.class).asEagerSingleton();
  }
}
