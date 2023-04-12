/*
 * Copyright (C) 2021 pedroSG94.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.media;

/**
 * Created by pedro on 16/6/21.
 *
 * Replace MediaCodec.BufferInfo class of Android for testing purpose
 */
public class MediaCodec {
  public final static class BufferInfo {

    public void set(int newOffset, int newSize, long newTimeUs, int newFlags) {
      offset = newOffset;
      size = newSize;
      presentationTimeUs = newTimeUs;
      flags = newFlags;
    }

    public int offset;
    public int size;
    public long presentationTimeUs;
    public int flags;
  }
}
