/*
 * Copyright (C) 2009-2020 Lightbend Inc. <https://www.lightbend.com>
 */

package play.data;

import javax.validation.GroupSequence;

@GroupSequence({LoginCheck.class, PasswordCheck.class})
public interface OrderedChecks {}
