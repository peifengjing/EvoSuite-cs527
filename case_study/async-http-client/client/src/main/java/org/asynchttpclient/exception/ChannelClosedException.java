/*
 * Copyright (c) 2015 AsyncHttpClient Project. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.asynchttpclient.exception;

import static org.asynchttpclient.util.ThrowableUtil.unknownStackTrace;

import java.io.IOException;

@SuppressWarnings("serial")
public final class ChannelClosedException extends IOException {

    public static final ChannelClosedException INSTANCE = unknownStackTrace(new ChannelClosedException(), ChannelClosedException.class, "INSTANCE");

    private ChannelClosedException() {
        super("Channel closed");
    }
}