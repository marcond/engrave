/* Licensed under the Apache License, version 2.0. See disclaimer at end of file.

   This class implements ArduinoOTA protocol, with best effort to follow closely the
   behaviour from the many implementations and some docs available.

   References:
      1. https://github.com/arduino/arduinoOTA
      2. https://github.com/esp8266/Arduino/tree/master/libraries/ArduinoOTA
      3. http://arduino.esp8266.com/Arduino/versions/2.0.0/doc/ota_updates/ota_updates.html

*/
package com.ardumagic.engrave;

public class ArduinoOTA implements Programmer
{
    private final static String PROTOCOL_NAME = "ArduinoOTA";

    @Override
    public String getProtocol ()
    {
        return (PROTOCOL_NAME.toLowerCase ());
    }
}

/*
   Copyright 2020 Marcond Marchi (ardumagic.com)

   Licensed under the Apache License, Version 2.0 (the "License"); you may not
   use this file except in compliance with the License. You may obtain a copy of
   the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
   WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
   License for the specific language governing permissions and limitations under
   the License.
*/