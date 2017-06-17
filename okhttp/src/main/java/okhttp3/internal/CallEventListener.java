/*
 * Copyright (C) 2017 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package okhttp3.internal;

import okhttp3.Call;
import okhttp3.EventListener;

/** An {@link EventListener} scoped to a specific {@link Call}. */
public final class CallEventListener {
  public static final CallEventListener NONE = new CallEventListener(null, EventListener.NONE);

  private final Call call;
  private final EventListener eventListener;

  public CallEventListener(Call call, EventListener eventListener) {
    this.call = call;
    this.eventListener = eventListener;
  }

  public Call call() {
    return call;
  }

  public EventListener eventListener() {
    return eventListener;
  }
}
